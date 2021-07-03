# coding=utf-8
# Administrator

class User():
    def __init__(self, first_name, last_name):
        self.first_name = first_name
        self.last_name = last_name

    def describe_user(self):
        print("The username is " + self.first_name + ". " + self.last_name)

    def greet_user(self):
        print("Hello, " + self.last_name + ".")


class Admin(User):
    def __init__(self, first_name, last_name):
        super(Admin, self).__init__(first_name, last_name)
        self.privileges = "can creat, modified or delete user"

    def print_privileges(self):
        print("The administrator has the advanced privileges just like he " + self.privileges)


if __name__ == '__main__':
    asj = Admin("Ao", "Shengjie")
    asj.describe_user()
    asj.print_privileges()
    asj.greet_user()
