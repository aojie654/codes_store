# People

"""init dicts"""
ldd_info0_dict = {'name': 'Li Dan Dan', 'sex': 'girl', 'job': 'teacher', }
wwl_info0_dict = {'name': 'Wang Wang Lin', 'sex': 'woman', 'job': 'teacher', }

"""init list"""
people_info0_list = [ldd_info0_dict, wwl_info0_dict]

"""print list"""
for people_info0_dict in people_info0_list:
    """print key and value of each dict"""
    for key, value in people_info0_dict.items():
        print(key, ":\t", value, end=";\t")
    print()

print()
