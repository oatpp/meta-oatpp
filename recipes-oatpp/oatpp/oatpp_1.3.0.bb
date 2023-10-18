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

DESCRIPTION = "Oat++" 
SECTION = "oatpp" 
LICENSE = "Apache-2.0" 
PR = "r0" 


SRC_URI = "git://github.com/oatpp/oatpp;protocol=https;tag=1.3.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=86d3f3a95c324c9479bd8986968f4327"

ALLOW_EMPTY:${PN} = "1"

S = "${WORKDIR}/git"

inherit pkgconfig cmake

PACKAGECONFIG ??= "logv logd logi logw loge obj_count pool_alloc thread_local set_affinity"

PACKAGECONFIG[shared] = "-DBUILD_SHARED_LIBS=ON,-DBUILD_SHARED_LIBS=OFF"
PACKAGECONFIG[tests] = "-DOATPP_BUILD_TESTS=ON,-DOATPP_BUILD_TESTS=OFF"
PACKAGECONFIG[atomic] = "-DOATPP_LINK_ATOMIC=ON,-DOATPP_LINK_ATOMIC=OFF"

PACKAGECONFIG[obj_count] = "-DOATPP_DISABLE_ENV_OBJECT_COUNTERS=OFF,-DOATPP_DISABLE_ENV_OBJECT_COUNTERS=ON"
PACKAGECONFIG[pool_alloc] = "-DOATPP_DISABLE_POOL_ALLOCATIONS=OFF,-DOATPP_DISABLE_POOL_ALLOCATIONS=ON"
PACKAGECONFIG[thread_local] = "-DOATPP_COMPAT_BUILD_NO_THREAD_LOCAL=OFF,-DOATPP_COMPAT_BUILD_NO_THREAD_LOCAL=ON"
PACKAGECONFIG[set_affinity] = "-DOATPP_COMPAT_BUILD_NO_SET_AFFINITY=OFF,-DOATPP_COMPAT_BUILD_NO_SET_AFFINITY=ON"

PACKAGECONFIG[logv] = "-DOATPP_DISABLE_LOGV=OFF,-DOATPP_DISABLE_LOGV=ON"
PACKAGECONFIG[logd] = "-DOATPP_DISABLE_LOGD=OFF,-DOATPP_DISABLE_LOGD=ON"
PACKAGECONFIG[logi] = "-DOATPP_DISABLE_LOGI=OFF,-DOATPP_DISABLE_LOGI=ON"
PACKAGECONFIG[logw] = "-DOATPP_DISABLE_LOGW=OFF,-DOATPP_DISABLE_LOGW=ON"
PACKAGECONFIG[loge] = "-DOATPP_DISABLE_LOGE=OFF,-DOATPP_DISABLE_LOGE=ON"

FILES:${PN}-staticdev = "\
    ${libdir}/oatpp-${PV}/liboatpp.a \
    ${libdir}/oatpp-${PV}/liboatpp-test.a \
"

