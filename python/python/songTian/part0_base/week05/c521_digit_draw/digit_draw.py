import turtle as tt
import time as tm


def drawGap():
    tt.pu()
    tt.fd(5)


def drawLine(draw):
    drawGap()
    tt.pd() if draw else tt.pu()
    tt.fd(40)
    drawGap()
    tt.right(90)


def drawDigit(digit):
    drawLine(True) if digit in [2, 3, 4, 5, 6, 8, 9] else drawLine(False)
    drawLine(True) if digit in [0, 1, 3, 4, 5, 6, 7, 8, 9] else drawLine(False)
    drawLine(True) if digit in [0, 2, 3, 5, 6, 8, 9] else drawLine(False)
    drawLine(True) if digit in [0, 2, 6, 8] else drawLine(False)
    tt.left(90)
    drawLine(True) if digit in [0, 4, 5, 6, 8, 9] else drawLine(False)
    drawLine(True) if digit in [0, 2, 3, 5, 6, 7, 8, 9] else drawLine(False)
    drawLine(True) if digit in [0, 1, 2, 3, 4, 7, 8, 9] else drawLine(False)
    tt.left(180)
    tt.pu()
    tt.fd(20)


def drawDate(date):
    tt.color("#ff0000")
    for i in date:
        if i == "-":
            tt.write('年', font=('Arial', 18, 'normal'))
            tt.color('#00ff00')
            tt.fd(40)
        elif i == "=":
            tt.write('月', font=('Arial', 18, 'normal'))
            tt.color('#0000ff')
            tt.fd(40)
        elif i == "+":
            tt.write('日', font=('Arial', 18, 'normal'))
        else:
            drawDigit(eval(i))


def main():
    tt.setup(800, 250, 200, 200)
    tt.pu()
    tt.speed(20)
    tt.fd(-300)
    tt.pensize(5)
    drawDate(tm.strftime("%Y-%m=%d+",tm.gmtime()))
    tt.hideturtle()
    tt.done()


main()
