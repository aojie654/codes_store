# coding=utf-8
# @File  : mpl_squares.py
# @Author: aojie654
# @Date  : 18-6-12 上午10:11
# @Desc  : Mpl Squares

import matplotlib.pyplot as plt

input_values = [1, 2, 3, 4, 5]
squares = [1, 4, 9, 16, 25]

plt.plot(input_values, squares, linewidth=5)

# Set tittle and add tag to axis
plt.title("Square Numbers:", fontsize=24)
plt.xlabel("Value", fontsize=14)
plt.ylabel("Square of value", fontsize=14)

# Set size of tick marks
plt.tick_params(axis="both", labelsize=14)

# Show
plt.show()
