SUMMARY = "A shell parser, formatter, and interpreter (sh/bash/mksh) "
HOMEPAGE = "https://github.com/mvdan/sh"

LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://src/${GO_IMPORT}/LICENSE;md5=5762bc15271b0661f5c9c593cd080548"

DEPENDS += "mvdan.cc-sh-native"

SRC_URI = "git://github.com/mvdan/sh;protocol=https"
SRCREV = "8360594a08f1410bfe9bb6a803f6f5aeb56f4424"
GO_IMPORT ?= "github.com/mvdan/sh"

inherit go
inherit native