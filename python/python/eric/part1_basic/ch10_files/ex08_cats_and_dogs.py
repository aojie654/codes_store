# -*- coding: utf-8 -*-
# @File  : ex08_cats_and_dogs.py
# @Author: aojie654
# @Date  : 18-6-8
# @Desc  :


class CatsAndDogs():
    def __init__(self, file_name):
        self.file_name = file_name

    def print_all(self):
        print("=========print_all=========")
        try:
            with open(self.file_name) as file_opened:
                contents = file_opened.read()
        except FileNotFoundError:
            print("Oh, no! There is no file named '" + self.file_name + "' exist!")
        else:
            print(contents.rstrip())
            file_opened.close()
        print()


if __name__ == '__main__':
    cad0 = CatsAndDogs("./ex09_data_cats.txt")
    cad0.print_all()
    # cad1 = CatsAndDogs("./ex09_data_dogs.txt")
    cad1 = CatsAndDogs("./ex09_data_dog.txt") # No such file then occurs error
    cad1.print_all()
