# Print Dictionary

"""init dicts"""
ldd_info0_dict = {'name': 'Li Dan Dan', 'sex': 'girl', 'job': 'teacher', }
wwl_info0_dict = {'name': 'Wang Wang Lin', 'sex': 'woman', 'job': 'teacher', }
ycc_info0_dict = {'name': 'Yu Cong Cong', 'sex': 'girl', 'job': 'teacher', }

"""init list"""
teachers_info0_list = [ldd_info0_dict, wwl_info0_dict, ycc_info0_dict]

"""print list"""
for teacher_info0_dict in teachers_info0_list:
    """print key and value of each dict"""
    for key, value in teacher_info0_dict.items():
        print(key, ":\t", value, end=";\t")
    print()
print()
