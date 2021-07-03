# coding=utf-8
# Import Admin

from ex07_admin import Admin

if __name__ == '__main__':
    asj = Admin("Ao", "Shengjie")
    asj.describe_user()
    asj.print_privileges()
    asj.greet_user()
