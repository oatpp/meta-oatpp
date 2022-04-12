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

SECTION = "oatpp" 
LICENSE = "Apache-2.0" 
PR = "r0" 

DEPENDS = "oatpp"

SRC_URI = "git://github.com/oatpp/${PN};protocol=https;tag=${PV}"
LIC_FILES_CHKSUM = "file://LICENSE;md5=86d3f3a95c324c9479bd8986968f4327"

ALLOW_EMPTY_${PN} = "1"

S = "${WORKDIR}/git"

inherit pkgconfig cmake

PACKAGECONFIG ??= ""

PACKAGECONFIG[shared] = "-DBUILD_SHARED_LIBS=ON,-DBUILD_SHARED_LIBS=OFF"
PACKAGECONFIG[tests] = "-DOATPP_BUILD_TESTS=ON,-DOATPP_BUILD_TESTS=OFF"

FILES_${PN}-staticdev = " \
    ${libdir}/oatpp-${PV}/lib${PN}.a \ 
"

