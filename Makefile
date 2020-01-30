# tools
SHELL := /bin/bash

# Default command and help messages
.PHONY: default help
default: help

.PHONY: initialize
initialize:
				bash initialize.sh

.PHONY: public
public:
				bash public.sh

.PHONY: private
private:
				bash private.sh

.PHONY: visualize
visualize:
				bash visualize.sh
