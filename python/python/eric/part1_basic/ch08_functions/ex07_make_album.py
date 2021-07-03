# Make Album

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
    make_album_0_fun("ry", "Hello")
    make_album_0_fun("asj", "None")
    make_album_0_fun("ldd", "Marry", 5)
    for album_1_var, info_1_var in album_0_dic.items():
        print("The album '" + album_1_var + "' is belong to " + info_1_var[0], end="")
        if len(info_1_var) == 1:
            print(".")
        else:
            print(", there is " + str(info_1_var[1]) + " songs in this album.")
