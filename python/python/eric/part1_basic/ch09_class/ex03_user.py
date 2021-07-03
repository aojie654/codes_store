# coding=utf-8

class User():
    def __init__(self, first_name, last_name):
        self.first_name = first_name
        self.last_name = last_name

    def describe_user(self):
        print("The username is " + self.first_name + ". " + self.last_name)

    def greet_user(self):
        print("Hello, " + self.last_name + ".\n")


if __name__ == '__main__':
    zt = User("Zhao", "Tian")
    zt.describe_user()
    zt.greet_user()

    tjy = User("Tang", "Jiayu")
    tjy.describe_user()
    tjy.greet_user()

    ldd = User("Li", "Dandan")
    ldd.describe_user()
    ldd.greet_user()
