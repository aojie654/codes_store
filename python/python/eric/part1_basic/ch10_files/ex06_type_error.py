# coding=utf-8
# Add Calculate

class Add():
    def __init__(self, n0, n1):
        try:
            result = int(n0) + int(n1)
        except ValueError:
            print("Hi, you can't add the non-number type!")
        else:
            print("The Result of " + str(n0) + " add to " + str(n1) + " is " + str(result))


if __name__ == '__main__':
    print("Input two numbers you want to add.")
    n0 = input("\t1st: ")
    n1 = input("\t2rd: ")
    add0 = Add(n0, n1)
