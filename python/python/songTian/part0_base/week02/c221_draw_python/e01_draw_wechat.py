# Draw Chat
import turtle as t

t.setup(500, 500)
t.color("#009900", "#009900")

# Draw Background
t.penup()
t.goto(-250, 250)
t.pendown()
t.begin_fill()
for i in range(4):
    t.fd(500)
    t.right(90)
t.end_fill()
t.penup()

# Draw BigOut
t.seth(90)
t.fd(180)
t.seth(0)
t.fd(28)
t.goto(-222, 70)
t.color("#dddddd", "#dddddd")
t.seth(90)
t.pendown()
t.begin_fill()
for i in range(2):
    t.circle(-100, 50)
    t.circle(-150, 80)
    t.circle(-100, 50)
t.end_fill()
t.penup()

# Draw BigTill
t.goto(-170, -18)
t.pendown()
t.begin_fill()
t.seth(-110)
t.fd(50)
t.seth(37)
t.fd(65)
t.end_fill()
t.penup()

# Draw BigEyes
t.seth(90)
t.color("#009900", "#009900")
t.goto(-145, 100)
t.pendown()
t.begin_fill()
t.circle(-15)
t.end_fill()
t.penup()
t.goto(-30, 100)
t.pendown()
t.begin_fill()
t.circle(-15)
t.end_fill()
t.penup()

# Draw SmallOut
t.seth(90)
t.goto(-60, -20)
t.color("#ffffff", "#ffffff")
t.pendown()
t.begin_fill()
for i in range(2):
    t.circle(-70, 60)
    t.circle(-120, 60)
    t.circle(-70, 60)
t.end_fill()
t.penup()

# Draw SmallTill
t.goto(100, -70)
t.pendown()
t.begin_fill()
t.seth(-75)
t.fd(50)
t.seth(150)
t.fd(65)
t.end_fill()
t.penup()

# Draw SmallEyes
t.seth(90)
t.color("#009900", "#009900")
t.goto(60, -5)
t.pendown()
t.begin_fill()
t.circle(-13)
t.end_fill()
t.penup()
t.goto(-30, -5)
t.pendown()
t.begin_fill()
t.circle(-13)
t.end_fill()
t.penup()
t.goto(-250, 250)
t.done()
