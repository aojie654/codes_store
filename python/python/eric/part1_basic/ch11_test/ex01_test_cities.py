# coding=utf-8
# @File  : ex01_test_cities.py
# @Author: aojie654
# @Date  : 18-6-9
# @Desc  : Test Cities

# import unittest
# from ex01_data_city_and_country import city_country
#
#
# class TestCities(unittest.TestCase):
#     def test_cities_countries(self):
#         test_message = city_country("xi'an", "china")
#         self.assertEqual(test_message, "Xi'An, China")
#
#
# unittest.main()

from ex01_data_city_and_country import city_country

print(city_country("xi'an", "china"))
