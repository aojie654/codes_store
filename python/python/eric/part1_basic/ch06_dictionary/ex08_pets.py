# Pets

"""init dictionary"""
zt0 = {'name': 'Zhao Tian', 'type': 'fool', 'owner': 'bear'}
lt0 = {'name': 'Liu Tong', 'type': 'pica', 'owner': 'Zhang Yan'}
ry0 = {'name': 'Ren Yan', 'type': 'girl', 'owner': 'Ao Shengjie'}

"""init list"""
pets0_list = [zt0, lt0, ry0]

"""print dictionary"""
for pets0_var in pets0_list:
    for key, value in pets0_var.items():
        print(key, ':', value, end=', ')
    print('\b\b.')

print()
