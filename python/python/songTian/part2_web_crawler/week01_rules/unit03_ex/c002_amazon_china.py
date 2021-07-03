#
# @Author: aojie654
# @Date: 2018-06-23 11:05:39
# @Last Modified by:   aojie654
# @Last Modified time: 2018-06-23 11:05:39
# /

import requests

url = 'https://www.amazon.cn/gp/product/B01M8L5Z3Y'

try:
    kv = {'user-agent': 'Mozilla/5.0'}
    r = requests.get(url, headers=kv)
    r.raise_for_status()
    r.encoding = r.apparent_encoding
    print(r.text[1000:2000])
    print(r.request.headers)
except:
    print('爬取异常')
