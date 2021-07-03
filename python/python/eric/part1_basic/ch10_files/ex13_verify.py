# coding=utf-8
# @File  : ex13_verify.py
# @Author: aojie654
# @Date  : 18-6-8
# @Desc  : Verify User

import json


class UserName():
    def get_stored_username(self):
        filename = './ex13_data_username.json'
        try:
            with open(filename) as file:
                username = json.load(file)
        except FileNotFoundError:
            return None
        else:
            return username

    def get_new_username(self):
        username = input("What is your name?")
        filename = './ex13_data_username.json'
        with open(filename, 'w') as file:
            json.dump(username, file)
        file.close()
        return username

    def greet_user(self):
        username = self.get_stored_username()
        # veriry = input("We have found a username " + username + "' Is that you?")
        # if username and veriry.lower() == "y":
        if username and input("We have found a username " + username + "' Is that you?").lower() == "y":
            print('Welcome back, ' + username + '!')
        else:
            username = self.get_new_username()
            print("We'll remember you when you come back, " + username + "!")


if __name__ == '__main__':
    user0 = UserName()
    user0.greet_user()
