# encoding: utf-8
# Project & File:  - 
# Author: aojie654
# Create Time: 2018.07.10 10:33


def get_text():
    file = open('./hamlet.txt', 'r').read()
    file = file.lower()
    for ch in '!"#$%&()*+,-./:;<=>?@[\\]^_`{|}~':
        file = file.replace(ch, " ")
    return file


hamlet_txt = get_text()
words = hamlet_txt.split()
counts = {}
for word in words:
    counts[word] = counts.get(word, 0) + 1
items = list(counts.items())
items.sort(key=lambda x: x[1], reverse=True)
for i in range(10):
    word, count = items[i]
    print('{0:<10},{1:>5}'.format(word, count))
