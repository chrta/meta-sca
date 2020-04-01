SUMMARY = "Rich testing for the Go language"
HOMEPAGE = "https://github.com/go-check/check"

LICENSE = "BSD-2-Clause"
LIC_FILES_CHKSUM = "file://src/${GO_IMPORT}/LICENSE;md5=598d6673548efc92a7d6dfb739add1ed"

DEPENDS += "\
            github.com-kr-pretty-native \
            github.com-niemeyer-pretty-native \
            "

SRC_URI = "git://github.com/go-check/check;protocol=https;branch=v1"
SRCREV = "8fa46927fb4f5b54d48bde78c6c08db205b2298c"
UPSTREAM_CHECK_COMMITS = "1"

GO_IMPORT ?= "github.com/go-check/check"

inherit go
inherit native
