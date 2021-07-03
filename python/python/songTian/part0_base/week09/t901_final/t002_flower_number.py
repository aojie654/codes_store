# encoding: utf-8
# Project & File:  - 
# Author: aojie654
# Create Time: 2018.07.10 10:14

list0 = []
for i in range(10 ** 2, 10 ** 3):
    h = i // 100
    m = i // 10 % 10
    l = i % 10
    var = h ** 3 + m ** 3 + l ** 3
    if h ** 3 + m ** 3 + l ** 3 == i:
        list0.append(i)

for i in list0:
    print(i, end='')
    if i != list0[-1]:
        print(',', end='')
