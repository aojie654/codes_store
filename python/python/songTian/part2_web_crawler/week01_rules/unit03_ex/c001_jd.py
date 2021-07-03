#
# @Author: aojie654
# @Date: 2018-06-23 10:58:39
# @Last Modified by:   aojie654
# @Last Modified time: 2018-06-23 10:58:39
#


import requests

url = 'https://item.jd.com/7513407.html'
try:
    r = requests.get(url)
    r.raise_for_status()
    r.encoding = r.apparent_encoding
    print(r.text[:1000])
except:
    print('爬取失败')
