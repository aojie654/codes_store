# coding=utf-8
# @File  : t003_study
# @Author: aojie654
# @Date  : 2018.07.03 10:28
# @Desc  : 

"""
成绩分数百分制转为五级制的判断输出（建议使用异常处理try-except-else-finally）。
具体要求如下：
1）输入一个[0-100]内成绩数据，输出相应等级（A、B、C、D、E），如输入为99，第一行输出为“输入成绩属于A级别。”；
2）当输入数据为其他字符或者超过范围，则输出“输入数据有误！”；
3）当成绩等级为A、B、C、D，则换行输出“祝贺你通过考试！”；
4）使用finally实现无论输入任何数据，均在最后输出“好好学习，天天向上！
"""


def score():
    level = ''
    score_var0 = input()

    try:
        score_var0 = int(score_var0)
        if score_var0 not in range(0, 101):
            raise ValueError
    except ValueError:
        print('输入数据有误！')
    else:
        if score_var0 >= 90:
            level = 'a'
        elif score_var0 >= 80:
            level = 'b'
        elif score_var0 >= 70:
            level = 'c'
        elif score_var0 >= 60:
            level = 'd'
        else:
            level = 'e'
        print_sum_p(level.upper())
    finally:
        print('好好学习，天天向上！')


def print_sum_p(score_var):
    print('输入成绩属于{:}级别。'.format(score_var))
    if score_var != 'E':
        print('祝贺你通过考试！')


if __name__ == '__main__':
    score()
