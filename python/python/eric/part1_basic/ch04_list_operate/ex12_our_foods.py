# Our Foods

"""create my foods list"""
my_foods0_list = ["pizza", "rice", "carrot cake"]

'''create friend's foods list with slice'''
friend_foods0_list = my_foods0_list[:]

'''make different'''
my_foods0_list.append("bread")
friend_foods0_list.append("juice")

'''print my food list'''
for food0_var in my_foods0_list:
    print(food0_var, end="")
    if food0_var != my_foods0_list[-1]:
        print(",", end=" ")
print()

'''print friend's food list'''
for food0_var in friend_foods0_list:
    print(food0_var, end="")
    if food0_var != friend_foods0_list[-1]:
        print(",", end=" ")
print()
