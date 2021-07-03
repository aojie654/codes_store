# TempTrans
TempStr = input("Input the temperature with char:")
if TempStr[-1] in ['f', 'F']:
    C = (eval(TempStr[0:-1]) - 32) / 1.8
    print("The temperature after trans is {:.2f}C".format(C))
elif TempStr[-1] in ['c', 'C']:
    F = (1.8 * eval(TempStr[0:-1]) + 32)
    print("The temperature after trans is {:.2f}F".format(F))
else:
    print("Input error!")
