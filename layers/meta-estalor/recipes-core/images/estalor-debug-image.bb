SUMMARY = "The Image to run the estalor image with debugging tools"
AUTHOR = "Tom Geelen"

LICENSE = "CLOSED"

require estalor-image-common.inc

IMAGE_FEATURES:append = "\
    debug-tweaks \
"

IMAGE_INSTALL:append = " \
    nano \
"