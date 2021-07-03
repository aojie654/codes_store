# encoding: utf-8
# Project & File:  - 
# Author: aojie654
# Create Time: 2018.07.06 15:54


def fibonacci_max_input():
    max_var = int(input())
    fibonacci_cal(max_var)


def fibonacci_cal(max_var):
    fibonacci_list = []
    fibonacci_create(fibonacci_list, max_var)
    fibonacci_list.append(len(fibonacci_list))
    fibonacci_list.append(fibonacci_avg(fibonacci_list)[0])
    for i in fibonacci_list:
        print(i, end=',')


def fibonacci_create(list_var, max_var):
    if max_var >= 0:
        list_var.append(0)
        if max_var >= 1:
            list_var.append(1)
            while max_var > list_var[-1]:
                list_var.append(list_var[-2] + list_var[-1])
                if max_var == list_var[-1]:
                    list_var.remove(max_var)
                    break


def fibonacci_avg(list_var):
    sum_var = 0
    for i in list_var[:-1]:
        sum_var += i
    avg_var = sum_var / len(list_var[:-2])
    return sum_var, avg_var


if __name__ == '__main__':
    fibonacci_max_input()
