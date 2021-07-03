# SameSymbolOperation

# 读入一个整数N，分别计算如下内容：
# 1. N的绝对值；
# 2. N与10进行同符号加法、减法和乘法运算，同符号运算指使用N的绝对值与另一个数进行运算，运算结果的绝对值被赋予N相同的符号，其中，0的符号是正号。
# 将上述4项结果在一行输出，采用空格分隔，输出结果均为整数。

input0 = eval(input())
num1 = 10
if input0 < 0:
    symbol0 = -1
else:
    symbol0 = 1
abs0 = abs(input0)
sum0, sub0, mul0 = symbol0 * abs(abs0 + num1), symbol0 * abs(abs0 - num1), symbol0 * abs(abs0 * num1)

print(abs0, sum0, sub0, mul0)
