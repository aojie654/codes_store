cal0_str_var = input()
if cal0_str_var[-3:] == "cal":
    joule0_var = eval(cal0_str_var[:-3]) * 4.186
    print("{:.3f}J".format(joule0_var))
elif cal0_str_var[-1] == "J":
    calories0_var = eval(cal0_str_var[:-1]) / 4.186
    print("{:.3f}cal".format(calories0_var))
