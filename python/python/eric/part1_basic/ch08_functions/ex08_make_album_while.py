# Make Album While

"""Init Dic"""
album_0_dic = {}

"""Function make_album_0_fun(singer_0_var, album_0_var, count_0_var)"""


def make_album_0_fun(singer_0_var, album_0_var, count_0_var=1):
    info_0_list = [singer_0_var]
    if count_0_var > 1:
        info_0_list.append(count_0_var)
    album_0_dic[album_0_var] = info_0_list


"""Function main"""
if __name__ == '__main__':
    """Active Flag"""
    active_0_flag = True

    """Make album"""
    while active_0_flag:
        singer_2_var = input("Input singer's name:")
        album_2_var = input("Input album's name:")
        count_2_var = input("Input album's count:")
        make_album_0_fun(singer_2_var, album_2_var, int(count_2_var))
        if input("Do you like to add another album?(y/n)") == "n":
            active_0_flag = False

    """Print Album"""
    for album_1_var, info_1_var in album_0_dic.items():
        print("The album '" + album_1_var.title() + "' is belong to " + info_1_var[0], end="")
        if len(info_1_var) == 1:
            print(".")
        else:
            print(", there is " + str(info_1_var[1]) + " songs in this album.")
