# CaesarCode.py

# P=(C-3) mod 26
# C=(P+3) mod 26

charsLow = "abcdefghijklmnopqrstuvwxyz"
charsUp = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
charsAll = charsLow + charsUp

source0 = input()

for i in source0:
    if i in charsUp:
        print(chr((ord(i) + 3 - 65) % 26 + 65), end="")
    elif i in charsLow:
        print(chr((ord(i) + 3 - 97) % 26 + 97), end="")
    else:
        print(i, end="")
