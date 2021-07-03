# User Profile

"""Function named build_profile(first,last,**user_info)"""


def build_profile(first, last, **user_info):
    """create a Dic about everything we known"""
    profile = {'first_name': first, 'last_name': last}
    for key, value in user_info.items():
        profile[key] = value
    return profile


if __name__ == '__main__':
    user_profile = build_profile('Shengjie', 'Ao', location='Xi\'An', filed='computer', sex='man')

    print(user_profile)
