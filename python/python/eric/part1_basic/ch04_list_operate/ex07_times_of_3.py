# Times Of 3

for num0_var in range(3, 31):
    if num0_var % 3 == 0:
        print(str(num0_var) + "\t", end="")

print("\n")

'''Method 1'''
times_of3_0_list = []
for num0_var in range(3, 31):
    if num0_var % 3 == 0:
        times_of3_0_list.append(num0_var)

'''Method 2'''
# times_of3_0_list = [num0_var * 3 for num0_var in range(1, int(30 / 3)+1)]

'''Print list'''
for num0_var in times_of3_0_list:
    print(str(num0_var) + "\t", end="")
print()
