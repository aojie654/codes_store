# Sellout Pastrami

"""init list named sandwich_orders"""
sandwich_orders_0_list = ["pastrami sandwich", "pastrami sandwich", "pastrami sandwich", "tomato sandwich",
                          "sausage sandwich", "normal sandwich"]
finished_sandwiches_0_list = []
print("Pastrami is sellout.")

"""Remove pastrami from list"""
while sandwich_orders_0_list:
    current_sandwich_0 = sandwich_orders_0_list.pop()
    if current_sandwich_0 != "pastrami sandwich":
        finished_sandwiches_0_list.append(current_sandwich_0)
        print("I made you " + current_sandwich_0 + ".")

"""Print list"""
print("I had made you for following sandwiches: ", end="")
for sandwich_0_var in finished_sandwiches_0_list:
    print(sandwich_0_var, end=", ")
print("\b\b.")
