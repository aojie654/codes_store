# coding=utf-8
# Login times

class User():
    def __init__(self):
        self.login_attempts = 0

    def increment_login_attempts(self):
        self.login_attempts += 1
        print("The user has attempts login for " + str(zt.login_attempts) + " time(s).")

    def reset_login_attempts(self):
        self.login_attempts = 0


if __name__ == '__main__':
    zt = User()
    for i in range(5):
        zt.increment_login_attempts()
    zt.reset_login_attempts()
    print("The finally attempts login times is " + str(zt.login_attempts))
