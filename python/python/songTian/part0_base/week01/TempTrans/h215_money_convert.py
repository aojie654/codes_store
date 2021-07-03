MoneyStr = input()
if MoneyStr[0:3] == "USD":
    RMB = eval(MoneyStr[3:]) * 6.78
    print("RMB{:.2f}".format(RMB))
elif MoneyStr[0:3] == "RMB":
    USD = eval(MoneyStr[3:]) / 6.78
    print("USD{:.2f}".format(USD))
