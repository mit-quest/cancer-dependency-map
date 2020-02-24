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
    ssh-keys = "${var.username}:${file(var.public_key_path)}"
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
    source = "../scripts/remote/${var.image}.sh"
    destination = "~/"
    connection {
      user = var.username
      type = "ssh"
      private_key = file(var.private_key_path)
      host = google_compute_address.vm_static_ip.address
    }
  }

  provisioner "file" {
    source = var.credentials_file_path
    destination = var.credentials_file_path
    connection {
      user = var.username
      type = "ssh"
      private_key = file(var.private_key_path)
      host = self.network_interface[0].access_config[0].nat_ip
    }
  }

  provisioner "file" {
    source = var.public_key_path
    destination = var.public_key_path
    connection {
      user = var.username
      type = "ssh"
      private_key = file(var.private_key_path)
      host = self.network_interface[0].access_config[0].nat_ip
    }
  }

  provisioner "file" {
    source = var.data_dir_path
    destination = "~/data"
    connection {
      user = var.username
      type = "ssh"
      private_key = file(var.private_key_path)
      host = self.network_interface[0].access_config[0].nat_ip
    }
  }

  provisioner "remote-exec" {
    inline = [
      "bash ~/${var.image}.sh -cred ${var.credentials_file_path} -proj ${var.project} -host ${var.host_name} -port ${var.port} -pub ${var.public_key_path} -data ~/data"
    ]
    connection {
      user = var.username
      type = "ssh"
      private_key = file(var.private_key_path)
      host = google_compute_address.vm_static_ip.address
    }
  }

  provisioner "local-exec" {
    command = "bash ../scripts/local/${var.image}.sh -ip ${google_compute_address.vm_static_ip.address} -port ${var.port} -user ${var.username} -private ${var.private_key_path} -data ${var.data_dir_path}"
  }
}

resource "google_compute_address" "vm_static_ip" {
  name = "${var.username}-${var.folder_name}-static-ip"
}

resource "google_compute_firewall" "vpc_firewall" {
  name    = "${var.username}-${var.folder_name}-firewall"
  network = google_compute_network.vpc_network.self_link

  allow {
    protocol = "tcp"
    ports    = ["${var.port}"]
  }

  source_ranges = ["0.0.0.0/0"]
  target_tags   = ["docker-node"]
}
