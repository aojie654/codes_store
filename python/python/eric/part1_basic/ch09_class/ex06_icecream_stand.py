# coding=utf-8
# Ice Cream Stand
# Restaurant

class Restaurant0_class():
    def __init__(self, restaurant_name, cuisine_type):
        self.restaurant_name = restaurant_name
        self.cuisine_type = cuisine_type

    def describe_restaurant(self):
        print("The name of restaurant is " + self.restaurant_name)
        print("The type of she is " + self.cuisine_type)

    def open_restaurant(self):
        print("The " + self.restaurant_name + " is here.")


class IceCreamStand(Restaurant0_class):
    def __init__(self, restaurant_name, cuisine_type):
        super(IceCreamStand, self).__init__(restaurant_name, cuisine_type)
        self.flavors = ["thin", "black", "sweet"]

    def print_flavors(self):
        print("She has some characteristics like", end=" ")
        for element in self.flavors:
            print(element, end=", ")
        print("\b\b.")


if __name__ == '__main__':
    rst0 = IceCreamStand("zt", "fool")
    rst0.describe_restaurant()
    rst0.print_flavors()
    rst0.open_restaurant()
