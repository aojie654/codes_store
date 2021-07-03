# coding=utf-8
# Battery Upgrade

class Car():
    def __init__(self, make, model, year):
        self.make = make
        self.model = model
        self.year = year
        self.odometer_reading = 0

    def get_descriptive_name(self):
        long_name = str(self.year) + ' ' + self.make + ' ' + self.model
        return long_name.title()

    def read_odometer(self):
        print("This car has " + str(self.odometer_reading) + " miles on it.")

    def update_odometer(self, mileage):
        if mileage < self.odometer_reading:
            print("You can'l roll back an odometer!")
        else:
            self.odometer_reading = mileage

    def increment_odometer(self, miles):
        if miles < self.odometer_reading:
            print("You can'l roll back an odometer!")
        else:
            self.odometer_reading += miles


class ElectricCar(Car):

    def __init__(self, make, model, year):
        super(ElectricCar, self).__init__(make, model, year)
        self.battery = Battery()

    def fill_gas_tank(self):
        print("This car doesn't need a gas tank!")


class Battery():
    def __init__(self, battery_size=70):
        self.battery_size = battery_size

    def describe_bettery(self):
        print("This car has a " + str(self.battery_size) + "-kWh battery.")

    def get_ranges(self):
        global ranges
        if self.battery_size == 70:
            ranges = 240
        elif self.battery_size == 85:
            ranges = 270
        message = "This car can go approximately " + str(ranges)
        message += " miles on a full charge."
        print(message)

    def upgrade_battery(self):
        if self.battery_size <= 85:
            self.battery_size = 85


if __name__ == '__main__':
    my_tesla = ElectricCar('tesla', 'model s', 2016)
    print(my_tesla.get_descriptive_name())
    my_tesla.battery.describe_bettery()
    my_tesla.battery.get_ranges()
    my_tesla.battery.upgrade_battery()
    my_tesla.battery.get_ranges()
