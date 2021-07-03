# Mod of 10

"""Input"""
num0_var = input("Input a number:")
remainder0_of_10_var = int(num0_var) % 10
times0_of_10_var = int(num0_var) // 10
if remainder0_of_10_var == 0:
    print("The number", num0_var, "is", str(times0_of_10_var), "time(s) of 10.")
else:
    print("The number", num0_var, "can't dive 10 by a int number for the remainder is", str(remainder0_of_10_var) + ".")
