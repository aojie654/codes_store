# coding=utf-8
# @File  : c01_rw_visual
# @Author: aojie654
# @Date  : 2018.06.15 11:09
# @Desc  : Random Walk

import matplotlib.pyplot as plt

from c03_random_walk import RandomWalk

if __name__ == '__main__':
    # do walk if program running
    while True:
        rw = RandomWalk(50000)
        rw.fill_walk()
        point_numbers = list(range(rw.num_points))
        plt.scatter(rw.x_values, rw.y_values, c=point_numbers, cmap=plt.cm.Blues, edgecolors='none', s=1)

        # Highlight start and end point
        plt.scatter(0, 0, c='green', edgecolors='none', s=100)
        plt.scatter(rw.x_values[-1], rw.y_values[-1], c='red', edgecolors='none', s=100)
        plt.show()

        # Hide axis
        plt.axes().get_xaxis().set_visible(False)
        plt.axes().get_yaxis().set_visible(False)

        if input('Make another walk?(n to exit) ').lower() == 'n':
            break
