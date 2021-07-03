try:
    score = eval(input())
except NameError:
    print("Input illegal!")
else:
    if score >= 90:
        grade = "A"
    elif score >= 80:
        grade = "B"
    elif score >= 70:
        grade = "C"
    elif score >= 60:
        grade = "D"
    else:
        grade = "E"
    print("The grade is {}".format(grade))
