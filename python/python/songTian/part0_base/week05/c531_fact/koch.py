# KochDrawV1.py

import turtle as t


def koch(size, n):
    t.speed(200)
    if n == 0:
        t.fd(size)
    else:
        for angle in [0, 60, -120, 60]:
            t.left(angle)
            koch(size / 3, n - 1)


def main():
    """
    t.setup(800, 400)
    t.pu()
    t.goto(-300, -50)
    t.pd()
    t.pensize(2)
    koch(600, 3)
    t.hideturtle()
    t.done()
    """
    t.setup(800, 800)
    t.pu()
    t.goto(-300, 150)
    t.pd()
    t.pensize(2)
    level = 3
    for i in range(3):
        koch(600, level)
        t.right(120)
    t.hideturtle()
    t.done()


main()
