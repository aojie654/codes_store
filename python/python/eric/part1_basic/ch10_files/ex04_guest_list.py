# coding=utf-8

class Guest():
    def __init__(self):
        self.guest_name = ""
        self.record_filename = "./ex04_data_guest.txt"

    def guest_store(self):
        with open(self.record_filename, "x+") as file_opened:
            while True:
                self.guest_name = input("Hi, what's your name? ")
                if self.guest_name == "!q":
                    break
                else:
                    print("Hi, " + self.guest_name + ", welcome to visit!")
                    file_opened.write(self.guest_name + " has visited.\n")
            file_opened.close()


if __name__ == '__main__':
    guest0 = Guest()
    guest0.guest_store()
