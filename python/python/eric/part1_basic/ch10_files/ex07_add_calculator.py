# -*- coding: utf-8 -*-
# @File  : ex07_add_calculator.py
# @Author: aojie654
# @Date  : 18-6-8
# @Desc  : Add Calculator


class Add():
    def add_calculate(self):
        while True:
            print("Input two numbers you want to add.")
            n0 = input("\t1st: ")
            n1 = input("\t2rd: ")
            try:
                if n0 == "!q" or n1 == "!q":
                    break
                else:
                    result = int(n0) + int(n1)
            except ValueError:
                print("Hi, you can't add the non-number type!")
            else:
                print("The Result of " + str(n0) + " add to " + str(n1) + " is " + str(result))


if __name__ == '__main__':
    add0 = Add()
    add0.add_calculate()
