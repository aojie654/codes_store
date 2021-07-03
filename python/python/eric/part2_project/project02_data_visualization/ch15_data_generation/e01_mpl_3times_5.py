# coding=utf-8
# @File  : mpl_3times
# @Author: aojie654
# @Date  : 18-6-12 上午10:41
# @Desc  : Mpl 3 Times for 5

import matplotlib.pyplot as plt

x_max = 5
x_values = list(range(1, x_max + 1))
y_values = [x ** 3 for x in x_values]
plt.plot(x_values, y_values, linewidth=5)

# Set tittle and add tag to axis
plt.title("Square Numbers:", fontsize=24)
plt.xlabel("Value", fontsize=14)
plt.ylabel("Square of value", fontsize=14)

# Set size of tick params
plt.tick_params(axis="both", labelsize=14)

# Set params range
plt.axis([0, x_max+1, 0, x_max ** 3 + 50])

# plt.show()
plt.savefig('e01_3times_plot5.png', bbox_inches='tight')
