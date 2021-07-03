# Favorite Place

"""init dictionary"""
favorite0_place_dict = {'zt': ["Xi'An", 'Pucheng'], 'jym': ['An Kang', 'Pu Cheng'], 'ry': ['Pu Cheng', 'Wei Nan']}

"""print place"""
# print('zt'.title(), 'favorite place is:', end=' ')
# for place0_var in favorite0_place_dict['zt']:
#     print(place0_var + ', ', end='')
# print('\b\b.')

for name0_var, place0_list in favorite0_place_dict.items():
    print(name0_var.title(), 'favorite place is:', end='')
    for place0_var in place0_list:
        print(place0_var + ',', end=' ')
    print('\b\b.')

print()
