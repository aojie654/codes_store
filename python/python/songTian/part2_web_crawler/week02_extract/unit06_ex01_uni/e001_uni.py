# coding=utf-8
# @File  : e001_uni
# @Author: aojie654
# @Date  : 2018.06.23 23:05
# @Desc  : Uni

import requests
from bs4 import BeautifulSoup
import bs4


def get_html_text(url_var):
    try:
        r = requests.get(url_var, timeout=30)
        r.raise_for_status()
        r.encoding = r.apparent_encoding
        return r.text
    except:
        return ""


def fill_univ_list(ulist_var, html_var):
    soup = BeautifulSoup(html_var, "html.parser")
    for tr in soup.find('tbody').children:
        for i in range(21):
            if isinstance(tr, bs4.element.Tag):
                tds = tr('td')
                ulist_var.append([tds[0].string, tds[1].string, tds[3].string])
        else:
            break


def print_univ_list(ulist, num):
    print("{:^10}\t{:^6}\t{:^10}".format("排名", "学校名称", "总分"))
    for i in range(num):
        u = ulist[i]
        print("{:^10}\t{:^6}\t{:^10}".format(u[0], u[1], u[2]))


if __name__ == '__main__':
    u_info = []
    url = 'https://www.zuihaodaxue.cn/zuihaodaxuepaiming2016.html'
    html = get_html_text(url)
    fill_univ_list(u_info, html)
    print_univ_list(u_info, 20)  # 20 univs
