# TextProBarV4.py
import time

scale = 1000
print("迅雷9，快如闪电，享受每一次下载".center(scale // 15 - 8, "=") + "\n")
print("开始下载".center(scale // 15, "-"))
start = time.perf_counter()
for i in range(scale + 1):
    a = '*' * (i // 20)
    b = '.' * (scale // 20 - i // 20)
    c = (i / scale) * 100
    dur = time.perf_counter() - start
    print("\r{:^3.1f}%[{}->{}]{:.2f}s".format(c, a, b, dur), end='')
    if i < 77:
        time.sleep(0.05)
    elif i < 300:
        time.sleep(0.013)
    elif i < 850:
        time.sleep(0.003)
    elif i < 999:
        time.sleep(0.027)
    else:
        if i == 999:
            time.sleep(5)
    print("\r{:^3.1f}%[{}->{}]{: .2f}s".format(c, a, b, dur), end='')
print("\n" + "叮咚".center(scale // 15 + 2, '-'))
