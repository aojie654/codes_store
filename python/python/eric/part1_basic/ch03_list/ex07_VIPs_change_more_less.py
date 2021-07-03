# VIPs Change More Less

vips0_list = ["Eric", "Tomas", "Gates"]
message0_var = "I would like to invite you to have a dinner with me,"

print(message0_var, vips0_list[0])
print(message0_var, vips0_list[1])
print(message0_var, vips0_list[2])

print("\n" + vips0_list[2], "can't come to have dinner." + "\n")

vips0_list[2] = "Joy"
print(message0_var, vips0_list[0])
print(message0_var, vips0_list[1])
print(message0_var, vips0_list[2])

print("\n" + "There is a bigger table." + "\n")

vips0_list.insert(0, "Cache")
vips0_list.insert(2, "Memory")
vips0_list.append("JYM")

print(message0_var, vips0_list[0])
print(message0_var, vips0_list[1])
print(message0_var, vips0_list[2])
print(message0_var, vips0_list[3])
print(message0_var, vips0_list[4])
print(message0_var, vips0_list[5])

print("\n" + "Table is unreachable." + "\n")

message1_var = "I'm afraid that I can't invite you,"

vip1_var = vips0_list.pop()
print(message1_var, vip1_var)
vip1_var = vips0_list.pop()
print(message1_var, vip1_var)
vip1_var = vips0_list.pop()
print(message1_var, vip1_var)
vip1_var = vips0_list.pop()
print(message1_var, vip1_var)
vip1_var = vips0_list.pop()
print(message0_var, vip1_var)
vip1_var = vips0_list.pop()
print(message0_var, vip1_var)

print("VIPs list is:", vips0_list)
