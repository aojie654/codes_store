#!/bin/bash

yum install -y gcc openssl-devel bzip2-devel libffi-devel
mkdir -p /root/tmp/downloads/python
cd /root/tmp/downloads/python/
wget -O Python-3.7.4.tgz https://www.python.org/ftp/python/3.7.4/Python-3.7.4.tgz
tar -zxvf Python-3.7.4.tgz
cd Python-3.7.4
./configure 
make
make install
rm -rf /root/tmp/downloads/python/Python-3.7.4
