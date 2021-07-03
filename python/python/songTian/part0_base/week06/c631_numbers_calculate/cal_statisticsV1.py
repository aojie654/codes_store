# CalStatisticsV1.py
def get_num():  # 获取用户不定长度的输入
    nums = []
    i_num_str = input("请输入数字(回车退出): ")
    while i_num_str != "":
        nums.append(eval(i_num_str))
        i_num_str = input("请输入数字(回车退出): ")
    return nums


def mean(numbers):  # 计算平均值
    s = 0.0
    for num in numbers:
        s = s + num
    return s / len(numbers)


def dev(numbers, mean0):  # 计算方差
    s_dev = 0.0
    for num in numbers:
        s_dev = s_dev + (num - mean0) ** 2
    return pow(s_dev / (len(numbers) - 1), 0.5)


def median(numbers):  # 计算中位数
    sorted(numbers)
    size = len(numbers)
    if size % 2 == 0:
        med = (numbers[size // 2 - 1] + numbers[size // 2]) / 2
    else:
        med = numbers[size // 2]
    return med


n = get_num()  # 主体函数
m = mean(n)
print("平均值:{},方差:{:.2},中位数:{}.".format(m, dev(n, m), median(n)))
