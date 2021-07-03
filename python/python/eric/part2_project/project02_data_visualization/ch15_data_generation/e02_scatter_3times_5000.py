# coding=utf-8
# @File  : mpl_3times
# @Author: aojie654
# @Date  : 18-6-12 上午10:41
# @Desc  : Mpl 3 Times for 5

import matplotlib.pyplot as plt

x_max = 5000
x_values = list(range(1, x_max + 1))
y_values = [x ** 3 for x in x_values]
plt.scatter(x_values, y_values, c=y_values, cmap=plt.cm.Blues, edgecolors='none', s=40)

# Set tittle and add tag to axis
plt.title("Square Numbers:", fontsize=24)
plt.xlabel("Value", fontsize=14)
plt.ylabel("Square of value", fontsize=14)

# Set size of tick params
plt.tick_params(axis="both", labelsize=14)

# Set params range
plt.axis([0, x_max + 100, 0, (x_max + 1) ** 3 + x_max])

plt.show()
# plt.savefig('3times_plot.png', bbox_inches='tight')
