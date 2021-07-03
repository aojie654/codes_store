# CalBMIv1.py

height, weight = eval(input("Input height and weight with symbol \",\": "))
bmi = weight / pow(height, 2)
print("BMI is {:.2f}".format(bmi))
typeI = ""
typeC = ""

if bmi < 18.5:
    typeI = typeC = "thin"
elif bmi < 24:
    typeI = typeC = "normal"
elif bmi < 25:
    typeI, typeC = "normal", "overweight"
elif bmi < 28:
    typeI = typeC = "overweight"
elif bmi < 30:
    typeI, typeC = "normal", "fat"
else:
    typeI = typeC = "fat"
print("Your type of international BMI is {0}".format(typeI))
print("Your type of Chinese BMI is {0}".format(typeC))
