# Hello To Admin(Null)

users0_list = ["admin", "brown", "li", "sin", "riven"]
user0_index_var = 0
while users0_list:
    if users0_list[user0_index_var] == "admin":
        print("Hello", users0_list[user0_index_var] + ", would you like to see a status report?")
    else:
        print("Hello", users0_list[user0_index_var] + ", thank you for logging in again.")
    users0_list.remove(users0_list[0])

if len(users0_list) == 0:
    print("We need find some users!")

print()
