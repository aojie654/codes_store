# Count To 10^6

count_to_million0_list = [num0_var for num0_var in range(1, int(10e6 + 1))]
for num0_var in count_to_million0_list:
    print(str(num0_var) + "\t", end=" ")
    if num0_var % 1000 == 0:
        print()
print()
