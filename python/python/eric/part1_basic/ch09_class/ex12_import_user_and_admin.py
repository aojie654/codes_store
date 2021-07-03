# coding=utf-8
# Import User and Admin

from ex03_user import User
from ex12_data_import_user_admin import Admin

if __name__ == '__main__':
    """If we were not import User from ex03_ser, user tjy can't be init"""
    tjy = User("Tang", "Jiayu")
    tjy.describe_user()
    """tjy has no method named print_privilege()"""
    # tjy.print_privileges()
    tjy.greet_user()
    asj = Admin("Ao", "Shengjie")
    asj.describe_user()
    asj.print_privileges()
    asj.greet_user()
