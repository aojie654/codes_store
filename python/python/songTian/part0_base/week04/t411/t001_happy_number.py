"""
编写一个算法来确定一个数字是否“快乐”。 快乐的数字按照如下方式确定：从一个正整数开始，用其每位数的平方之和取代该数，
并重复这个过程，直到最后数字要么收敛等于1且一直等于1，要么将无休止地循环下去且最终不会收敛等于1。能够最终收敛等于1的数就是快乐的数字。

例如: 19 就是一个快乐的数字，计算过程如下：

12 + 92 = 82
82 + 22 = 68
62 + 82 = 100
12 + 02 + 02 = 1
当输入时快乐的数字时，输出True，否则输出False。
"""


def happy_number():
    hn_var0 = input()
    hn_var1 = int(hn_var0)
    count_var0 = 1
    while hn_var1 != 1:
        hn_list0 = list(str(hn_var1))
        hn_var1 = 0
        for i in hn_list0:
            hn_var1 += int(i) ** 2
        count_var0 += 1
        if count_var0 >= 10000:
            return False
            break
    else:
        return True


if __name__ == '__main__':
    print(happy_number())
