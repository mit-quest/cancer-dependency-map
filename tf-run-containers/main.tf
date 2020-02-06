variable "username" {}
variable "region" {}
variable "region_zone" {}
variable "folder_name" {}
variable "number_of_cpus" {}
variable "ram_size_mb" {}
variable "project" {
  description = "The ID of the Google Cloud project"
}
variable "credentials_file_path" {
  description = "Path to the JSON file used to describe your account credentials"
}
variable "public_key_path" {
  description = "Path to file containing public key"
}
variable "private_key_path" {
  description = "Path to file containing private key"
}


provider "google" {
  region = var.region
  project = var.project
  credentials = file(var.credentials_file_path)
}

resource "google_compute_network" "vpc_network" {
  name = "${var.username}-${var.folder_name}-network"
}

resource "google_compute_instance" "vm_instance" {
  name = "${var.username}-${var.folder_name}-instance"
  machine_type = "custom-${var.number_of_cpus}-${var.ram_size_mb}"
  zone = var.region_zone
  tags = ["docker-node"]

  boot_disk {
    initialize_params {
      image = "ubuntu-os-cloud/ubuntu-1804-lts"
    }
  }

  metadata = {
    ssh-keys = "root:${file(var.public_key_path)}"
  }

  service_account {
    scopes = ["cloud-platform"]
  }

  network_interface {
    network = google_compute_network.vpc_network.self_link
    access_config {
      nat_ip = google_compute_address.vm_static_ip.address
    }
  }

  provisioner "file" {
    source = "../scripts"
    destination = "~/scripts"
    connection {
      user = "root"
      type = "ssh"
      private_key = file(var.private_key_path)
      host = google_compute_address.vm_static_ip.address
    }
  }

  provisioner "local-exec" {
    command = "echo ${google_compute_address.vm_static_ip.address} >> ip_address.txt"
  }

  provisioner "remote-exec" {
    command = "echo ${google_compute_address.vm_static_ip.address} >> ip_address.txt"
    connection {
      type = "ssh"
      user = "root"
      timeout = "1m"
      private_key = file(var.private_key_path)
      host = google_compute_address.vm_static_ip.address
    }
  }

  provisioner "remote-exec" {
    script = "../scripts/run.sh"
    connection {
      type = "ssh"
      user = "root"
      timeout = "1m"
      private_key = file(var.private_key_path)
      host = google_compute_address.vm_static_ip.address
    }
  }
}

resource "google_compute_address" "vm_static_ip" {
  name = "${var.username}-${var.folder_name}-static-ip"
}

resource "google_compute_firewall" "default" {
  name    = "${var.username}-${var.folder_name}-firewall"
  network = google_compute_network.vpc_network.self_link

  allow {
    protocol = "tcp"
    ports    = ["80"]
  }

  source_ranges = ["0.0.0.0/0"]
  target_tags   = ["docker-node"]
}
