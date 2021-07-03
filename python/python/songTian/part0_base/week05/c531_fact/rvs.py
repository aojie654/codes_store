def rvs(s):
    if s == "":
        return s
    else:
        return rvs(s[1:]) + s[0]


s = rvs("Ji Yumeng")
print(s)
