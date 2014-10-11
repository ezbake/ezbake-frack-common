#!/bin/bash
#   Copyright (C) 2013-2014 Computer Sciences Corporation
#
#   Licensed under the Apache License, Version 2.0 (the "License");
#   you may not use this file except in compliance with the License.
#   You may obtain a copy of the License at
#
#       http://www.apache.org/licenses/LICENSE-2.0
#
#   Unless required by applicable law or agreed to in writing, software
#   distributed under the License is distributed on an "AS IS" BASIS,
#   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
#   See the License for the specific language governing permissions and
#   limitations under the License.


# Check that the correct version of Thrift is installed
if ! [[ "$(thrift -version | egrep "0.6")" == *0.6.1* ]]; then
    echo "This script requires Thrift version 0.6.1.  Please install it and try again."
    exit 1;
fi

rm -Rf gen-java

if [ ! -f "$1" ]; then
    echo "The specified thrift file '" $1 "' does not exist"
    echo "Usage: ./gen.sh ./src/main/thrift/<<some thrift file>>"
    exit 1;
fi

mvn dependency:unpack
thrift --gen java -I external-thrift/src/main/thrift $1

if [ ! -d ./gen-java ]; then
  echo "gen-java directory missing, Thrift gen must have failed"
  exit 1;
fi

for f in `find ./gen-java -name "*.java"`
do
  filename="${f##*/}"
  dir="${f:11:${#f} - ${#filename}-11}"
  dest="./src/main/java/"$dir
  if [ ! -d "$dest" ]; then
    echo $dest "does not exists so creating it"
    mkdir -p $dest
  fi
  echo "copying" $f "to" $dest
  cp $f $dest
done

rm -Rf gen-java
echo "removed gen-java directory"
echo "do 'git status' to see new or modified Java file(s)"

