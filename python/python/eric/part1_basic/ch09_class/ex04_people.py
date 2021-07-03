# coding=utf-8
# Restaurant

class Restaurant0_class():
    def __init__(self, restaurant_name, cuisine_type):
        self.restaurant_name = restaurant_name
        self.cuisine_type = cuisine_type
        self.number_served = 0

    def set_number_served(self, number_served):
        self.number_served = number_served
        print("She has get together with me for " + str(self.number_served) + " days.")

    def describe_restaurant(self):
        print("The name of restaurant is " + self.restaurant_name)
        print("The type of she is " + self.cuisine_type)

    def open_restaurant(self):
        print("The restaurant is open.")
        print()

    def increment_number_served(self, increment_number):
        self.increment_number = increment_number
        print("There are " + str(self.increment_number) + " days I want to stay with her more.")


if __name__ == '__main__':
    rst0 = Restaurant0_class("zt", "fool")
    rst0.describe_restaurant()
    rst0.set_number_served(600)
    rst0.increment_number_served(20000)
    rst0.open_restaurant()

    rst1 = Restaurant0_class("tjy", "angel")
    rst1.describe_restaurant()
    rst1.set_number_served(700)
    rst1.increment_number_served(19900)
    rst1.open_restaurant()

    rst2 = Restaurant0_class("ldd", "cute")
    rst2.describe_restaurant()
    rst2.set_number_served(100)
    rst0.increment_number_served(20500)
    rst2.open_restaurant()
