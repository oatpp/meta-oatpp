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

SUMMARY = "All Oat++ packages"

inherit packagegroup

RDEPENDS_${PN} += "websocket"
RDEPENDS_${PN} += "postgresql"
RDEPENDS_${PN} += "ssdp"
RDEPENDS_${PN} += "openssl"
RDEPENDS_${PN} += "libressl"
RDEPENDS_${PN} += "zlib"
RDEPENDS_${PN} += "sqlite"
RDEPENDS_${PN} += "mongo"
RDEPENDS_${PN} += "mbedtls"
RDEPENDS_${PN} += "curl"
RDEPENDS_${PN} += "protobuf"
RDEPENDS_${PN} += "swagger"
