# Car Produce

"""Function named car_produce_0_fun(vendor,model,**product_info)"""


def car_produce_0_fun(vendor, model, **product_info):
    """create a Dic about everything we known"""
    profile = {'vendor_name': vendor, 'model_name': model}
    for key, value in product_info.items():
        profile[key] = value
    return profile


if __name__ == '__main__':
    user_profile = car_produce_0_fun('Subaru', 'Outback', color='Blue', tow_package=True, size="1.9m")

    print(user_profile)
