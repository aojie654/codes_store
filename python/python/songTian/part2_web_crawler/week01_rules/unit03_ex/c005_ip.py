# coding=utf-8
# @File  : c005_ip
# @Author: aojie654
# @Date  : 2018.06.23 19:26
# @Desc  : 

import requests

url = 'http://ip.chinaz.com/'
ip = 'g.cn'
try:
    r = requests.get(url + ip)
    r.encoding = r.apparent_encoding

    print(r.status_code)
    print(r.text[15700:18000])
    # print(r.text)
except:
    print('爬取失败')
