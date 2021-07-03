# coding=utf-8
# @File  : L001_request_google_cn
# @Author: aojie654
# @Date  : 2018.06.15 09:56
# @Desc  : Request

import requests

r = requests.get("http://g.cn")
print(r.status_code)
print(r.text)
print(r.encoding)
print(r.apparent_encoding)
r.encoding = 'utf-8'
print(r.text)
