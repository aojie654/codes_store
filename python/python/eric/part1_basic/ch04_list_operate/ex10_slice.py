# Slice of Cubed From 1 To 10 with analyze

cubed_from_1to10_analyze_0_list = [num0_var ** 3 for num0_var in range(1, 11)]
for num0_var in cubed_from_1to10_analyze_0_list:
    print(str(num0_var) + "\t", end="")
print()

'''slice the first 3 items'''
print("The first 3 items in the list are:")
for num0_var in cubed_from_1to10_analyze_0_list[:3]:
    print(str(num0_var) + "\t", end="")
print()

'''slice the middle 3 items'''
print("From middle 3 items in the list are:")
for num0_var in cubed_from_1to10_analyze_0_list[3:6]:
    print(str(num0_var) + "\t", end="")
print()

'''slice the last 3 items'''
print("The last 3 items in the list are:")
for num0_var in cubed_from_1to10_analyze_0_list[-3:]:
    print(str(num0_var) + "\t", end="")
print()
