# coding=utf-8
class FileOpen():
    def __init__(self, file_name):
        self.file_name = file_name

    def modified_line(self, r_word, n_word):
        print("Replace word '" + r_word + "' with '" + n_word + "'.(There is no change to original file.)")
        with open(self.file_name) as file_opened:
            for line in file_opened:
                print(line.replace(r_word, n_word).rstrip())
        print()
        file_opened.close()


if __name__ == '__main__':
    file = FileOpen("./ex01_data_learning_Python.txt")
    file.modified_line("In", "With")
