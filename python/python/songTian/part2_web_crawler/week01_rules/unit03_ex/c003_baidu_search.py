# coding=utf-8
# @File  : c003_baidu_search
# @Author: aojie654
# @Date  : 2018.06.23 11:30
# @Desc  :

import requests

keyword = 'Python'
try:
    # 百度
    kv = {'wd': keyword}
    r = requests.get('http://www.baidu.com/s', params=kv)
    print(r.request.url)
    r.raise_for_status()
    print(len(r.text))

    # 360
    kv = {'q': keyword}
    r = requests.get('http://www.so.com/s', params=kv)
    print(r.request.url)
    r.raise_for_status()
    print(len(r.text))
except:
    print('爬取失败')
