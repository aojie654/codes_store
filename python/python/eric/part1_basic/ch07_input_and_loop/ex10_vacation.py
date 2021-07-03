# Vacation Place

"""Init dictionary"""
vacation_place_0_dic = {}
active_0_flag = True

"""Using user's input to store Dic"""
while active_0_flag:
    name_0_var = input("What's your name?")
    place_0_var = input("If you could visit one place in the world, where would you go?")
    vacation_place_0_dic[name_0_var] = place_0_var

    repeat_0_var = input("Would you like to let another person respond?(yes/no)")
    if repeat_0_var == "n":
        active_0_flag = False

"""Print Dic"""
print("\n-----Poll Results-----")
for name_0_var,place_0_var in vacation_place_0_dic.items():
    print(name_0_var+"'s vacation place is "+place_0_var+".")
print()
