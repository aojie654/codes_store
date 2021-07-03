# Username Check

current_users0_list = ["admin", "brown", "li", "sin", "riven"]
new_user0_list = ["zoe", "ash", "lulu", "admin", "Li"]

for new_user0_var in new_user0_list:
    for current_users0_var in current_users0_list:
        if new_user0_var.lower() == current_users0_var.lower():
            print('The user name "'+current_users0_var+'" is in use!')
            break
    else:
        print('You can login with username "'+new_user0_var+'".')
print()
