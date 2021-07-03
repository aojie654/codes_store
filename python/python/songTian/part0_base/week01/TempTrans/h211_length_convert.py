# 1 米 = 39.37 英寸
LengthStr = input()
if LengthStr[-1] == "m":
    in0 = eval(LengthStr[0:-1]) * 39.37
    print("{:.3f}in".format(in0))
elif LengthStr[-2]+LengthStr[-1] == "in":
    mt0 = eval(LengthStr[0:-2]) / 39.37
    print("{:.3f}m".format(mt0))
