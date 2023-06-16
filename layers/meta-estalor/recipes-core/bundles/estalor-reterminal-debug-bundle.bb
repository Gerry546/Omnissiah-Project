LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

inherit bundle

RAUC_BUNDLE_COMPATIBLE = "Estalor (reterminal)"

RAUC_BUNDLE_FORMAT = "verity"

RAUC_BUNDLE_SLOTS = "rootfs vfat"

RAUC_IMAGE_FSTYPE = "tar.bz2"

RAUC_SLOT_rootfs = "estalor-debug-image"
RAUC_SLOT_rootfs[fstype] = "ext4"
RAUC_SLOT_rootfs[adaptive] = "block-hash-index"

RAUC_SLOT_vfat = "reterminal-boot-image"
RAUC_SLOT_vfat[file] = "reterminal-boot.vfat"
RAUC_SLOT_vfat[type] = "boot"

RAUC_KEY_FILE = "${THISDIR}/files/development-1.key.pem"
RAUC_CERT_FILE = "${THISDIR}/files/development-1.cert.pem"