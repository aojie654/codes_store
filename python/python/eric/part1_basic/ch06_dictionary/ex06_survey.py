# Survey

"""init favorite_languages_dictionary"""
favorite_language0_dict = {
    'jen': 'python',
    'sarah': 'c',
    'edward': 'ruby',
    'phil': 'python'
}

"""print dictionary"""
for name, language in favorite_language0_dict.items():
    print(name.title() + "'s favorite language is", language.title() + '.')
print()

"""init people list"""
people0_list = ['jen', 'sarah', 'edward', 'zt', 'jym']

"""print information"""
for people in people0_list:
    if people.lower() in favorite_language0_dict.keys():
        print('Thanks for the survey,', people.title() + '.')
    else:
        print('Hi', people.title() + ', would you like to have a survey?')
print()
