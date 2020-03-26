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

resource "google_compute_network" "vpc_network" {
  name = "${var.folder_name}-network-${var.username}"
}

resource "google_compute_instance" "vm_instance" {
  name = "${var.folder_name}-${var.image}-${var.username}"
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
    source = "${var.this_dir_path}/scripts/${var.image}/create.sh"
    destination = "~/create.sh"
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

  provisioner "local-exec" {
    command = "echo bash ${var.this_dir_path}/scripts/${var.image}/start.sh -c ~/Terraform.json -i ${google_compute_address.vm_static_ip.address} -j ${var.project} -h ${var.host_name} -p ${var.port} -t ${var.trial_id} -f ${var.folder_name} -u ${var.username} -v ${var.private_key_path} > ${var.this_dir_path}/data/${var.image}/start.txt"
  }

  provisioner "local-exec" {
    command = "echo bash ${var.this_dir_path}/scripts/${var.image}/open.sh -i ${google_compute_address.vm_static_ip.address} -p ${var.port} -u ${var.username} -v ${var.private_key_path} -d ${var.this_dir_path}/data/${var.image} -t ${var.trial_id} -f ${var.folder_name} > ${var.this_dir_path}/data/${var.image}/open.txt"
  }

  provisioner "local-exec" {
    command = "echo bash ${var.this_dir_path}/scripts/${var.image}/save.sh -i ${google_compute_address.vm_static_ip.address} -p ${var.port} -u ${var.username} -v ${var.private_key_path} -d ${var.this_dir_path}/data/${var.image} -t ${var.trial_id} -f ${var.folder_name} > ${var.this_dir_path}/data/${var.image}/save.txt"
  }

  provisioner "remote-exec" {
    inline = [
      "bash ~/create.sh -c ~/Terraform.json -j ${var.project} -h ${var.host_name} -p ${var.port} -t ${var.trial_id} -f ${var.folder_name} -u ${var.username}"
    ]
    connection {
      user = var.username
      type = "ssh"
      private_key = file(var.private_key_path)
      port = 22
      host = google_compute_address.vm_static_ip.address
    }
  }

  desired_status = var.status
}

resource "google_compute_address" "vm_static_ip" {
  name = "${var.folder_name}-static-ip-${var.username}"
}

resource "google_compute_firewall" "vpc_firewall" {
  name    = "${var.folder_name}-firewall-${var.username}"
  network = google_compute_network.vpc_network.name

  allow {
    protocol = "tcp"
    ports    = ["22", "${var.port}"]
  }

  source_ranges = ["0.0.0.0/0"]
  target_tags   = ["docker-node"]
}
