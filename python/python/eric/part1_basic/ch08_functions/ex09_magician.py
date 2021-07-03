# Magician

"""Init list magician_0_list"""
magician_0_list = ["ldd", "asj", "ry"]

"""Function named show_magician(magician_0_list)"""


def show_magician(magician_temp_list):
    print("There are magicians' name: ", end="")
    for count_0_var in range(len(magician_temp_list)):
        print(magician_temp_list[count_0_var].title(), end=", ")
    print("\b\b.")


"""Function named main"""
if __name__ == '__main__':
    show_magician(magician_0_list)
