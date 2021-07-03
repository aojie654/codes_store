# Restaurant

class Restaurant0_class():
    def __init__(self, restaurant_name, cuisine_type):
        self.restaurant_name = restaurant_name
        self.cuisine_type = cuisine_type

    def describe_restaurant(self):
        print("The name of restaurant is " + self.restaurant_name)
        print("The type of she is " + self.cuisine_type)

    def open_restaurant(self):
        print("The restaurant is open.")


if __name__ == '__main__':
    rst0 = Restaurant0_class("zt", "fool")
    rst0.describe_restaurant()
    rst0.open_restaurant()
