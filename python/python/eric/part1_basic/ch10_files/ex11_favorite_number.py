# coding=utf-8
# @File  : ex11_favorite_number.py
# @Author: aojie654
# @Date  : 18-6-8
# @Desc  : Favorite Number

import json


class FavoriteNumber():
    def __init__(self, number, file):
        self.favorite_number = number
        self.file_name = file

    def favorite_number_save(self):
        with open(self.file_name, "w") as file:
            json.dump(self.favorite_number, file)
        file.close()
        print("Your number has saved.\n")

    def favorite_number_load(self):
        with open(self.file_name, "r") as file:
            number = json.load(file)
        print("I know your favorite number is " + number + ".\n")
        file.close()


if __name__ == '__main__':
    fn0 = FavoriteNumber('2', './ex11_data_favorite_number.json')
    fn0.favorite_number_save()
    fn0.favorite_number_load()
