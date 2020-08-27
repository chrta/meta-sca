SUMMARY = "All-round base protection ansible role"
DESCRIPTION = "This Ansible role provides numerous security-related configurations, providing all-round base protection"
HOMEPAGE = "https://github.com/dev-sec/ansible-os-hardening"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://README.md;beginline=202;endline=215;md5=c87156bb1a5f6706f85efc44355fb4f6"

SRC_URI = "git://github.com/dev-sec/ansible-os-hardening.git;protocol=https \
           file://${ROLE_NAME}.json"
SRCREV = "84f659d83da265ca926fce5691e3379cfaeabc49"
S = "${WORKDIR}/git"

ROLE_NAME = "dev-sec.os-hardening"

do_configure() {
    :
}

do_compile() {
    :
}

do_install () {
    install -d ${D}/${datadir}/ansible/roles/${ROLE_NAME}
    cp -r ${S}/* ${D}/${datadir}/ansible/roles/${ROLE_NAME}
    rm -rf ${D}/${datadir}/ansible/roles/${ROLE_NAME}/.git
    chown root:root ${D}/${datadir}/ansible/roles/${ROLE_NAME}
}

do_install_append() {
    install -d ${D}/${datadir}/ansible/roles/
    install -m 0444 ${WORKDIR}/${ROLE_NAME}.json ${D}/${datadir}/ansible/roles/${ROLE_NAME}.json
}

FILES_${PN} += "${datadir}"

RDEPENDS_${PN}_class-target += "\
                                perl \
                                python3-ansible \
                               "
RDEPENDS_${PN}_class-native += "\
                                perl-native \
                                python3-ansible-native \
                               "

BBCLASSEXTEND = "native"