# coding=utf-8
# Dice

from random import randint


class Dice():
    def __init__(self):
        self.side = 1

    def print_dice_number(self):
        print(self.dice_number, end="")

    def roll_dice(self):
        self.dice_number = randint(1, self.side)

    def print_roll_result(self, times):
        """roll dice for %times% times"""
        print("The result of " + str(self.side) + " rolled for " + str(times) + " time(s) is ", end="")
        for i in range(times):
            self.roll_dice()
            print(self.dice_number, end=", ")
        print("\b\b.\n")


class Dice6(Dice):

    def __init__(self):
        super(Dice6, self).__init__()
        self.side = 6

    def print_dice_number(self):
        super(Dice6, self).print_dice_number()

    def roll_dice(self):
        super(Dice6, self).roll_dice()

    def print_roll_result(self, times):
        super(Dice6, self).print_roll_result(times)


class Dice10(Dice):

    def __init__(self):
        super(Dice10, self).__init__()
        self.side = 10

    def print_dice_number(self):
        super(Dice10, self).print_dice_number()

    def roll_dice(self):
        super(Dice10, self).roll_dice()

    def print_roll_result(self, times):
        super(Dice10, self).print_roll_result(times)


class Dice20(Dice):

    def __init__(self):
        super(Dice20, self).__init__()
        self.side = 20

    def print_dice_number(self):
        super(Dice20, self).print_dice_number()

    def roll_dice(self):
        super(Dice20, self).roll_dice()

    def print_roll_result(self, times):
        super(Dice20, self).print_roll_result(times)


if __name__ == '__main__':
    """init a dice named dice0"""
    dice6 = Dice6()
    dice6.print_roll_result(10)

    dice10 = Dice10()
    dice10.print_roll_result(10)

    dice20 = Dice20()
    dice20.print_roll_result(10)
