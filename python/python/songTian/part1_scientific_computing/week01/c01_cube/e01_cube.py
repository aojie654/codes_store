# coding=utf-8
# @File  : E01_cube.py
# @Author: aojie654
# @Date  : 18-6-10
# @Desc  : Cube

from tvtk.api import tvtk as tk

s = tk.CubeSource(x_length=1.0, y_length=2.0, z_length=3.0)
m = tk.PolyDataMapper(input_connection=s.output_port)
a = tk.Actor(mapper=m)
r = tk.Renderer(background=(0, 0, 0))
r.add_actor(a)
w = tk.RenderWindow(size=(3000, 300))
w.add_renderer(r)
i = tk.RenderWindowInteractor(render_window=w)
i.initialize()
i.start()
