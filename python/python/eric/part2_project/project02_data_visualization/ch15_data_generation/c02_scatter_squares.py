# coding=utf-8
# @File  : scatter_squares.py
# @Author: aojie654
# @Date  : 18-6-12 上午10:23
# @Desc  : Scatter Squares

import matplotlib.pyplot as plt

x_values = list(range(1, 1001))
y_values = [x ** 2 for x in x_values]
plt.scatter(x_values, y_values, c=y_values, cmap=plt.cm.Blues, edgecolors='none', s=40)

# Set tittle and add tag to axis
plt.title("Square Numbers:", fontsize=24)
plt.xlabel("Value", fontsize=14)
plt.ylabel("Square of value", fontsize=14)

# Set size of tick params
plt.tick_params(axis="both", labelsize=14)

# Set params range
plt.axis([0, 1100, 0, 1100000])

# plt.show()
plt.savefig('c02_squares_plot.png', bbox_inches='tight')
