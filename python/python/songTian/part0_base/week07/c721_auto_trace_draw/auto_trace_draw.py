# Auto Trace Draw
import turtle as tt

tt.title("Auto Draw")
tt.setup(800, 600, 0, 0)
tt.pencolor("#ff0000")
tt.pensize(5)

# 读取数据
data0_list = []
file0 = open("./data.txt")
for line0 in file0:
    line0 = line0.replace("\n", "")
    data0_list.append(list(map(eval, line0.split(","))))
file0.close()

# Draw

for i in range(len(data0_list)):
    tt.pencolor(data0_list[i][3], data0_list[i][4], data0_list[i][5])
    tt.fd(data0_list[i][0])
    if data0_list[i][1]:
        tt.right(data0_list[i][2])
    else:
        tt.left(data0_list[i][2])
tt.done()
