# coding=utf-8
# @File  : c00_random_walk
# @Author: aojie654
# @Date  : 2018.06.15 10:52
# @Desc  : Random Walk

from random import choice


class RandomWalk():
    """Init a random walk class"""

    def __init__(self, num_points=5000):
        """Init a random walk factor"""
        self.num_points = num_points

        # All points start at(0,0)
        self.x_values = [0]
        self.y_values = [0]

    def fill_walk(self):
        """calculate all points"""

        # walk until max length
        while len(self.x_values) < self.num_points:
            # decide the direction of walk
            x_direction = choice([1, -1])
            x_distance = choice([0, 1, 2, 3, 4])
            x_step = x_direction * x_distance

            y_direction = choice([1, -1])
            y_distance = choice([0, 1, 2, 3, 4])
            y_step = y_direction * y_distance

            # refuse no distance
            if x_step == 0 and y_step == 0:
                continue

            # calculate next point value
            next_x = self.x_values[-1] + x_step
            next_y = self.y_values[-1] + y_step

            self.x_values.append(next_x)
            self.y_values.append(next_y)
