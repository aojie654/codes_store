# DayDayUpQ2.py

dayFactor0 = eval(input()) / 1000

dayUp0 = pow(1 + dayFactor0, 365)
dayDown0 = pow(1 - dayFactor0, 365)
times0 = int(dayUp0 // dayDown0)

print("{0:.2f},{1:.2f},{2}".format(dayUp0, dayDown0, times0))
