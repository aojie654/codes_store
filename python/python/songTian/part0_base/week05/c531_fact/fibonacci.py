def fibonacci(i):
    if i == 1 or i == 2:
        return 1
    else:
        return fibonacci(i - 1) + fibonacci(i - 2)


print(fibonacci(7))
