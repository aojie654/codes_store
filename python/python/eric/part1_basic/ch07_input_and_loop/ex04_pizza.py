# Pizza

print("Hello, welcome to here!")
input_0_list = []
input_0_var = input("Tell me what material do you like add to pizza, enter 'quit' to exit: ")
while True:
    if input_0_var != "quit":
        input_0_list.append(input_0_var)
    else:
        break
    input_0_var = input("Do you want to more material? Enter 'quit' to exit: ")

print("We had add", end=" ")
for material_0_var in input_0_list:
    print(material_0_var, end=", ")
print("\b\b to your pizza.")
