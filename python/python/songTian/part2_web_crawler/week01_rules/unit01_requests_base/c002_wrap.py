# coding=utf-8
# @File  : c002_wrap
# @Author: aojie654
# @Date  : 2018.06.22 09:03
# @Desc  : Wrap

import requests


def get_html_text(url_var):
    try:
        r = requests.get(url_var, timeout=30)
        r.raise_for_status()
        r.encoding = r.apparent_encoding
        return r.text
    except:
        return "产生异常"


if __name__ == '__main__':
    # url = "http://g.cn"
    url = "g.cn"
    print(get_html_text(url))
