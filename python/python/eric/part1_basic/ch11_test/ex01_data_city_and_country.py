# coding=utf-8
# @File  : ex01_data_city_and_country.py
# @Author: aojie654
# @Date  : 18-6-9
# @Desc  : Data City And Country

def city_country(city_0_var, country_0_var):
    message_0_var = city_0_var.title() + ", " + country_0_var.title()
    return message_0_var


if __name__ == '__main__':
    print(city_country("xi'an", "china"))
