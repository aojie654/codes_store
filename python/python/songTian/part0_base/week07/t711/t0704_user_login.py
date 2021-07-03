# encoding: utf-8
# Project & File:  - 
# Author: aojie654
# Create Time: 2018.07.06 16:09


def check_login():
    user_name = 'Kate'
    password = '666666'
    times = 1
    while times <= 3:
        input1, input2 = input(), input()

        if input1 == user_name and input2 == password:
            print('登录成功！')
            break
        else:
            times += 1
    else:
        print('3次用户名或者密码均有误！退出程序。')


if __name__ == '__main__':
    check_login()
