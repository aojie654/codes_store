# coding=utf-8
# @File  : c004_pic_download
# @Author: aojie654
# @Date  : 2018.06.23 19:19
# @Desc  : Picture Download

import os, requests

url = 'https://desk-fd.zol-img.com.cn/t_s1920x1080c5/g5/M00/01/04/ChMkJ1g2YQeIbYQRABTlVmUrO4AAAYB0gGpqwMAFOVu246.jpg'
root = './pic/'
path = root + url.split('/')[-1]

try:
    if not os.path.exists(root):
        os.mkdir(root)
    if not os.path.exists(path):
        r = requests.get(url)
        with open(path, 'wb') as f:
            f.write(r.content)
            f.close()
            print('文件保存成功')
    else:
        print('文件已存在')
except:
    print('爬取出错')
