# coding=utf-8

# Open File

class FileOpen():
    def __init__(self, file_name):
        self.file_name = file_name

    def print_all(self):
        print("=========print_all=========")
        with open(self.file_name) as file_opened:
            contents = file_opened.read()
            print(contents.rstrip())
        file_opened.close()
        print()

    def print_line(self):
        print("=========print_line=========")
        with open(self.file_name) as file_opened:
            for line in file_opened:
                print(line.rstrip())
        file_opened.close()
        print()

    def print_list(self):
        print("=========print_list=========")
        with open(self.file_name) as file_opened:
            lines = file_opened.readlines()
        for line in lines:
            print(line.rstrip())
        file_opened.close()
        print()


if __name__ == '__main__':
    file = FileOpen("./ex01_data_learning_Python.txt")
    file.print_all()
    file.print_line()
    file.print_list()
