variable "username" {}
variable "region" {}
variable "region_zone" {}
variable "folder_name" {}
variable "host_name" {}
variable "project_name" {
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
  project = var.project_name
  credentials = file(var.credentials_file_path)
}

resource "google_compute_instance" "vm_instance" {
  name = "${var.username}-${var.folder_name}-instance"
  machine_type = "n1-standard-1"
  zone = var.region_zone
  tags = ["docker-node"]

  boot_disk {
    initialize_params {
      size = "50"
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
    network = "default"
    access_config {
      # Ephemeral
    }
  }

  provisioner "file" {
    source = "../../cancer-dependency-map"
    destination = "~/"
    connection {
      user = var.username
      type = "ssh"
      private_key = file(var.private_key_path)
      host = self.network_interface[0].access_config[0].nat_ip
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

  provisioner "remote-exec" {
    inline = [
      "echo ${var.project_name} >> ~/cancer-dependency-map/project_name.txt",
      "echo ${var.credentials_file_path} >> ~/cancer-dependency-map/credentials_file_path.txt",
      "echo ${var.host_name} >> ~/cancer-dependency-map/host_name.txt",
      "bash ~/cancer-dependency-map/scripts/build.sh"
    ]
    connection {
      user = var.username
      type = "ssh"
      private_key = file(var.private_key_path)
      host = self.network_interface[0].access_config[0].nat_ip
    }
  }
}
