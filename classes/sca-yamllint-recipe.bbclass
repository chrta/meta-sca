## SPDX-License-Identifier: BSD-2-Clause
## Copyright (c) 2019, Konrad Weihmann

inherit sca-helper
inherit sca-global
inherit sca-yamllint-core
inherit sca-tracefiles

SCA_DEPLOY_TASK = "do_sca_deploy_yamllint_recipe"

python do_sca_deploy_yamllint_recipe() {
    sca_conv_deploy(d, "yamllint")
}

do_sca_yamllint_core[doc] = "Lint yaml files"
do_sca_yamllint_core_report[doc] = "Report findings from do_sca_yamllint_core"
do_sca_deploy_yamllint_recipe[doc] = "Deploy results of do_sca_yamllint_core"
addtask do_sca_yamllint_core after do_compile before do_sca_tracefiles
addtask do_sca_yamllint_core_report after do_sca_tracefiles
addtask do_sca_deploy_yamllint_recipe after do_sca_yamllint_core_report before do_package

DEPENDS += "sca-recipe-yamllint-rules-native"
