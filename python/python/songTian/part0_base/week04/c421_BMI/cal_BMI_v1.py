# CalBMIv1.py

height, weight = eval(input("Input height and weight with symbol \",\": "))
bmi = weight / pow(height, 2)
print("BMI is {:.2f}".format(bmi))
typeI = ""
typeC = ""

if bmi < 18.5:
    typeI = "thin"
elif bmi < 25:
    typeI = "normal"
elif bmi < 30:
    typeI = "overweight"
else:
    typeI = "fat"
if bmi < 18.5:
    typeC = "thin"
elif bmi < 24:
    typeC = "normal"
elif bmi < 28:
    typeC = "overweight"
else:
    typeC = "fat"
print("Your type of international BMI is {0}".format(typeI))
print("Your type of Chinese BMI is {0}".format(typeC))
