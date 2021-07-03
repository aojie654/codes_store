# StartPrint.py

num0 = eval(input())
for i in range(1, num0 + 1, 2):
    starLine0 = "*" * i
    print(starLine0.center(num0))
