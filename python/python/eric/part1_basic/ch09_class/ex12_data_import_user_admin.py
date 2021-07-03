# coding=utf-8
# Import User
from ex03_user import User


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
