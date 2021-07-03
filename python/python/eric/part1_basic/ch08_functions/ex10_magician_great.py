# Magician Great

"""Init list magician_0_list"""
magician_0_list = ["ldd", "asj", "ry"]

"""Function named show_magician(magician_0_list)"""


def make_great_magician(magician_temp_list):
    print("There are magicians' name: ", end="")
    for count_0_var in range(len(magician_temp_list)):
        magician_temp_list[count_0_var] = "the great magician " + magician_temp_list[count_0_var].title()
        print(magician_temp_list[count_0_var], end=", ")
    print("\b\b.")


"""Function named main"""
if __name__ == '__main__':
    print("Original magician_0_list is: ", end="")
    print(magician_0_list)
    make_great_magician(magician_0_list)
    print("After function make_great_magician, magician_0_list is: ", end="")
    print(magician_0_list)
