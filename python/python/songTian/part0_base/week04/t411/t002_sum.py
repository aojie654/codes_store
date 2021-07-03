# coding=utf-8
# @File  : t002_sum
# @Author: aojie654
# @Date  : 2018.07.03 10:11
# @Desc  : 

"""
获得用户输入的整数n，输出 1!+2!+...+n!的值。
如果输入数值为0、负数、非数字或非整数，输出提示信息：输入有误，请输入正整数。
"""


def sum_o(n):
    result_var0 = 1
    for i in range(1, n + 1):
        result_var0 *= i
    return result_var0


def sum_p():
    max_n = input()
    try:
        max_n = int(max_n)
    except ValueError:
        return '输入有误，请输入正整数'
    else:
        if int(max_n) <= 0:
            return '输入有误，请输入正整数'
        else:
            max_n = int(max_n)
            s = 0
            for i in range(1, max_n + 1):
                s += sum_o(i)
            return s


def print_sum_p():
    print(sum_p())


if __name__ == '__main__':
    print_sum_p()
