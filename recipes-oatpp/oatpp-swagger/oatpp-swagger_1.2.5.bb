#############################################################################
#
# Project         _____    __   ____   _      _
#                (  _  )  /__\ (_  _)_| |_  _| |_
#                 )(_)(  /(__)\  )( (_   _)(_   _)
#                (_____)(__)(__)(__)  |_|    |_|
#
#
# Copyright 2021-present, Benedikt-Alexander Mokroß <github@bamkrs.de>
#
# Licensed under the Apache License, Version 2.0 (the "License");
# you may not use this file except in compliance with the License.
# You may obtain a copy of the License at
#
#     http://www.apache.org/licenses/LICENSE-2.0
#
# Unless required by applicable law or agreed to in writing, software
# distributed under the License is distributed on an "AS IS" BASIS,
# WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
# See the License for the specific language governing permissions and
# limitations under the License.
#
#############################################################################

DESCRIPTION = "Oat++ Swagger (OAS 3.0)" 
inherit oatpp-module

PACKAGES += " ${PN}-ui"

RESIDR = "${incdir}/oatpp-${PV}/bin/oatpp-swagger/res"
FILES_${PN}-ui = " \
    ${RESDIR}/swagger-ui.js.map \
    ${RESDIR}/swagger-ui-standalone-preset.js \
    ${RESDIR}/swagger-ui.css \
    ${RESDIR}/swagger-ui.js \
    ${RESDIR}/swagger-ui-es-bundle-core.js \
    ${RESDIR}/swagger-ui-es-bundle-core.js.map \
    ${RESDIR}/swagger-ui-bundle.js \
    ${RESDIR}/favicon-32x32.png \
    ${RESDIR}/favicon-16x16.png \
    ${RESDIR}/swagger-ui-es-bundle.js \
    ${RESDIR}/swagger-ui-es-bundle.js.map \
    ${RESDIR}/oauth2-redirect.html \
    ${RESDIR}/swagger-ui-standalone-preset.js.map \
    ${RESDIR}/index.html \
    ${RESDIR}/swagger-ui-bundle.js.map \
    ${RESDIR}/swagger-ui.css.map \
"
