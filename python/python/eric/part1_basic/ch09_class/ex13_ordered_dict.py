# coding=utf-8
# Ordered Dict

class OrderedDict():
    def __init__(self):
        self.glossary0_dict = {}

    def dict_add(self, key, value):
        self.glossary0_dict[key] = value
        print("There is a key named '" + key + "' and value '" + value + "' has added.")


if __name__ == '__main__':
    dict0 = OrderedDict()

    """init dictionary"""
    dict0.dict_add('dictionary', 'One of the data type.')
    dict0.dict_add('for', 'One keyword of loop codes.')
    dict0.dict_add('in', 'Express the date in the list type.')
    dict0.dict_add('Python', 'One of the popular programing language.')
    dict0.dict_add('print', 'Show the information on screen')
    print()

    """print dictionaries' keys and values"""
    for key, value in dict0.glossary0_dict.items():
        print('The word', key, "means", value)
    print()
