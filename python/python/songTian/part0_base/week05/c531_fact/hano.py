hano_count0 = 0


def hano(i, left, right, mid):
    global hano_count0
    if i == 1:
        print("{}:{}->{}".format(i, left, right))
        hano_count0 += 1
    else:
        hano(i - 1, left, right, mid)
        print("{}:{}->{}".format(i, left, right))
        hano_count0 += 1
        hano(i - 1, left, right, mid)


hano(3, "a", "b", "c")
print(hano_count0)
