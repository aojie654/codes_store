# coding=utf-8

class Reason():
    def __init__(self):
        self.reason_content = ""
        self.record_filename = "./ex05_data_reason.txt"

    def reason_store(self):
        with open(self.record_filename, "x+") as file_opened:
            while True:
                self.reason_content = input("Hi, what's your reason for likes programing? ")
                if self.reason_content == "!q":
                    break
                else:
                    print("Hi, thank you for the reason :" + self.reason_content + "!")
                    file_opened.write(self.reason_content + "\n")
            file_opened.close()


if __name__ == '__main__':
    reason0 = Reason()
    reason0.reason_store()
