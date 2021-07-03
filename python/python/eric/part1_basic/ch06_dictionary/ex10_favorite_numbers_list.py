# Favourite Numbers list

"""Init dictionary"""
favourite_numbers0_dict = {'ldd': [1, 2, 3, 4, 5], 'wwl': [2, 3, 4, 5, 6], 'ycc': [3, 4, 5, 6, 7],
                           'jym': [4, 5, 6, 7, 8], 'ry': [5, 6, 7, 8, 9]}

"""Print everyone's favourite number"""
for name0_var, numbers0_list in favourite_numbers0_dict.items():
    print('The favourite numbers of ', name0_var.title(), 'are:', end=' ')
    for number0_var in numbers0_list:
        print(number0_var, end=', ')
    print('\b\b.')

print()
