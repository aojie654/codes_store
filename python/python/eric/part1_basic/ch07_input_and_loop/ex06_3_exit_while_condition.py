# 3 Exit of Loop Condition

age0_var = input("Please enter the age:")
while age0_var != "quit":
    age0_var = int(age0_var)
    if age0_var <= 3:
        print("No ticket need.")
    elif age0_var <= 12:
        print("$10 for a ticket.")
    else:
        print("$15 for a ticket.")
    age0_var = input("Please enter the age:")
