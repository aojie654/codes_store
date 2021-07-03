# coding=utf-8
# Guest

class Guest():
    def __init__(self):
        self.guest_name = input("Hi, what's your name? ")

    def guest_store(self, file_name):
        with open(file_name, "x+") as file_opened:
            file_opened.write(self.guest_name)


if __name__ == '__main__':
    guest0 = Guest()
    guest0.guest_store("./ex03_data_guest.txt")
