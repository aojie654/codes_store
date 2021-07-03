# -*- coding: utf-8 -*-
# @File  : ex10_word_count.py
# @Author: aojie654
# @Date  : 18-6-8
# @Desc  : Word Count


class Word():
    def __init__(self, word, string):
        self.word = word
        self.string = string

    def count_times(self):
        print(self.string.lower().count(self.word))


if __name__ == '__main__':
    wd0 = Word("i", "I will not do the thing that I do not want to do.")
    wd0.count_times()
7