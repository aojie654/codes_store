# Gov Report Word Cloud V1

import jieba
import wordcloud

f0 = open("1.txt", "r", encoding="utf-8")
t0 = f0.read()
f0.close()
ls = jieba.lcut(t0)
txt0 = "".join(ls)
w0 = wordcloud.WordCloud(width=1000, height=700, background_color="white")
w0.generate(txt0)
w0.to_file("1.png")
