# Film Ticket

while True:
    age0_var = int(input("Please enter the age:"))
    if age0_var <= 3:
        print("No ticket need.")
    elif age0_var <= 12:
        print("$10 for a ticket.")
    else:
        print("$15 for a ticket.")
