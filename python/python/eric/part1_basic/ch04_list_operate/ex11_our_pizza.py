# Pizzas Print

"""copy hte list with slice"""
my_pizzas0_list = ["cheese", "tomato", "potato"]
friend_pizzas0_list = my_pizzas0_list[:]

'''To make difference'''
my_pizzas0_list.append("eggplants")
friend_pizzas0_list.append("sugar")

'''print my pizzas list'''
for pizza0_var in my_pizzas0_list:
    print("I like", pizza0_var, "pizza!")
print()

'''print friend pizzas list'''
for pizza0_var in friend_pizzas0_list:
    print("Friend like", pizza0_var, "pizza!")
print()

print("I really like pizzas!")
print("My friend either!")
