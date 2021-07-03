import turtle as t

# ##SetOutBorder
t.setup(500, 500)
t.pu()
t.color("#efa250", "#f9d47b")
t.goto(0, -235)
t.width(14)
t.pd()
t.begin_fill()
t.circle(234)
t.end_fill()
t.width(1)
t.pu()

# DrawShadow
t.color("#fadd8d")
t.seth(89)
t.goto(-227, 0)
t.pd()
t.begin_fill()
t.circle(-228, 135)
t.seth(-100)
t.circle(-265, 109)
t.end_fill()
t.pu()


# ## DrawMouth
t.goto(-180, -15)
t.color("#733705")
t.pd()
t.begin_fill()
t.seth(-90)
t.circle(180, 180)
t.seth(-93)
t.circle(-180, 175)
t.end_fill()
t.pu()


# ## DrawFace
# Draw left
t.seth(90)
t.goto(-202, 56)
t.color("#fd936c")
t.pd()
t.begin_fill()
for i in range(2):
    t.circle(-15, 70)
    t.circle(-100, 40)
    t.circle(-15, 70)
t.end_fill()
t.pu()

# Draw right
t.goto(100, 56)
t.color("#fd936c")
t.pd()
t.begin_fill()
for i in range(2):
    t.circle(-15, 70)
    t.circle(-100, 40)
    t.circle(-15, 70)
t.end_fill()
t.pu()


# ## DrawEyes
# Draw left
t.goto(-60, 90)
t.color("#f0a93d", "#ffffff")
t.width(4)
t.seth(15)
t.begin_fill()
t.pd()
t.circle(15, 150)
t.circle(300, 30)
t.circle(15, 150)
t.seth(15)
t.circle(-300, 30)
t.end_fill()
t.width(1)
t.pu()
t.goto(-185, 95)
t.color("#753708")
t.seth(0)
t.pd()
t.begin_fill()
t.circle(15)
t.end_fill()
t.pu()

# Draw right
t.goto(220, 90)
t.color("#f0a93d", "#ffffff")
t.width(4)
t.seth(15)
t.begin_fill()
t.pd()
t.circle(15, 150)
t.circle(300, 30)
t.circle(15, 150)
t.seth(15)
t.circle(-300, 30)
t.end_fill()
t.width(1)
t.pu()
t.goto(85, 95)
t.color("#753708")
t.seth(0)
t.pd()
t.begin_fill()
t.circle(15)
t.end_fill()
t.pu()


# ## DrawEyebrow
t.color("#333333")
# Draw left
t.goto(-150, 220)
t.seth(45)
t.pd()
t.begin_fill()
t.circle(-45, 180)
t.seth(55)
t.circle(45, 165)
t.end_fill()
t.pu()

# Draw right
t.goto(150, 220)
t.seth(135)
t.pd()
t.begin_fill()
t.circle(45, 180)
t.seth(125)
t.circle(-45, 165)
t.end_fill()
t.pu()


# ##Hide Turtle
t.color("#ffffff")
t.goto(-250, -250)
t.done()
