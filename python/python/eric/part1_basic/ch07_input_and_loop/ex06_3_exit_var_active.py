# Exit of Var Named Active

active = True

while active:
    age0_var = input("Please enter the age:")
    if age0_var == "quit":
        active = False
    else:
        age0_var = int(age0_var)
        if age0_var <= 3:
            print("No ticket need.")
        elif age0_var <= 12:
            print("$10 for a ticket.")
        else:
            print("$15 for a ticket.")
