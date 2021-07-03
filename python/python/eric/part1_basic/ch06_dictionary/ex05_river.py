# Rivers

"""init dictionary of rivers"""
rivers0_dict = {'Ni': 'ni', 'Huang': 'China', 'Chang': 'China'}

"""print river and country"""
for key, value in rivers0_dict.items():
    print('The river', key, 'is in', value + '.')

"""print rivers"""
print('The rivers are:', end='')
for key in rivers0_dict:
    print(key.title(), end=', ')
print()

"""print countries"""
print('The countries are:', end='')
for key in rivers0_dict:
    print(rivers0_dict[key].title(), end=', ')
print()
