# Sum To Million

sum_to_million0_list = [num0 for num0 in range(1, int(10e6 + 1))]
sum0_var = 0
print(min(sum_to_million0_list), max(sum_to_million0_list))

for num0_var in range(1, int(10e6)):
    sum0_var += num0_var
print(sum0_var)
print()
