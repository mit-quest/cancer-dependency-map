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
variable "this_dir_path" {}
variable "trial_id" {}
variable "status" {}


provider "google" {
  region = var.region
  project = var.project
  credentials = file(var.credentials_file_path)
}

resource "google_compute_instance" "vm_instance" {
  name = "${var.folder_name}-build-${var.username}"
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
    source = "${var.this_dir_path}/experiments"
    destination = "~/experiments"
    connection {
      user = var.username
      type = "ssh"
      private_key = file(var.private_key_path)
      host = self.network_interface[0].access_config[0].nat_ip
    }
  }

  provisioner "file" {
    source = "${var.this_dir_path}/scripts/build.sh"
    destination = "~/build.sh"
    connection {
      user = var.username
      type = "ssh"
      private_key = file(var.private_key_path)
      host = self.network_interface[0].access_config[0].nat_ip
    }
  }

  provisioner "file" {
    source = var.credentials_file_path
    destination = "~/Terraform.json"
    connection {
      user = var.username
      type = "ssh"
      private_key = file(var.private_key_path)
      host = self.network_interface[0].access_config[0].nat_ip
    }
  }

  provisioner "remote-exec" {
    inline = [
      "bash ~/build.sh -c ~/Terraform.json -j ${var.project} -h ${var.host_name} -f ${var.folder_name} -u ${var.username}"
    ]
    connection {
      user = var.username
      type = "ssh"
      private_key = file(var.private_key_path)
      host = self.network_interface[0].access_config[0].nat_ip
    }
  }
}
