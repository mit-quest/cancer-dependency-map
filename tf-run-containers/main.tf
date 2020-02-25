variable "username" {}
variable "region" {}
variable "region_zone" {}
variable "folder_name" {}
variable "host_name" {}
variable "number_of_cpus" {}
variable "ram_size_mb" {}
variable "project" {}
variable "credentials_file_path" {}
variable "public_key_path" {}
variable "private_key_path" {}
variable "image" {}
variable "port" {}
variable "data_dir_path" {}


provider "google" {
  region = var.region
  project = var.project
  credentials = file(var.credentials_file_path)
}

resource "google_compute_network" "vpc_network" {
  name = "${var.username}-${var.folder_name}-network"
}

resource "google_compute_instance" "vm_instance" {
  name = "${var.username}-${var.folder_name}-${var.image}"
  machine_type = "custom-${var.number_of_cpus}-${var.ram_size_mb}"
  zone = var.region_zone
  tags = ["docker-node"]

  boot_disk {
    initialize_params {
      size = "25"
      image = "ubuntu-os-cloud/ubuntu-1804-lts"
    }
  }

  metadata = {
    ssh-keys = "${var.username}:${file(var.public_key_path)}"
  }

  service_account {
    scopes = ["cloud-platform"]
  }

  network_interface {
    network = google_compute_network.vpc_network.name
    access_config {
      nat_ip = google_compute_address.vm_static_ip.address
    }
  }

  provisioner "file" {
    source = "../scripts/remote/${var.image}.sh"
    destination = "~/${var.image}.sh"
    connection {
      user = var.username
      type = "ssh"
      private_key = file(var.private_key_path)
      port = 22
      host = google_compute_address.vm_static_ip.address
    }
  }

  provisioner "file" {
    source = var.credentials_file_path
    destination = "~/Terraform.json"
    connection {
      user = var.username
      type = "ssh"
      private_key = file(var.private_key_path)
      port = 22
      host = google_compute_address.vm_static_ip.address
    }
  }

  provisioner "file" {
    source = var.data_dir_path
    destination = "~/data/"
    connection {
      user = var.username
      type = "ssh"
      private_key = file(var.private_key_path)
      port = 22
      host = google_compute_address.vm_static_ip.address
    }
  }

  provisioner "remote-exec" {
    inline = [
      "bash ~/${var.image}.sh -c ~/Terraform.json -j ${var.project} -h ${var.host_name} -p ${var.port} -d ~/data/"
    ]
    connection {
      user = var.username
      type = "ssh"
      private_key = file(var.private_key_path)
      port = 22
      host = google_compute_address.vm_static_ip.address
    }
  }

  provisioner "local-exec" {
    command = "bash ../scripts/local/${var.image}.sh -i ${google_compute_address.vm_static_ip.address} -p ${var.port} -u ${var.username} -v ${var.private_key_path} -d ${var.data_dir_path}"
  }
}

resource "google_compute_address" "vm_static_ip" {
  name = "${var.username}-${var.folder_name}-static-ip"
}

resource "google_compute_firewall" "vpc_firewall" {
  name    = "${var.username}-${var.folder_name}-firewall"
  network = google_compute_network.vpc_network.name

  allow {
    protocol = "tcp"
    ports    = ["22", "${var.port}"]
  }

  source_ranges = ["0.0.0.0/0"]
  target_tags   = ["docker-node"]
}
