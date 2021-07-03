"""
This app is for parents.
"""
from django.db import models
from student.models import Student


class Parent(models.Model):
    """
    Create info of parents.
    """

    def __str__(self):
        return self.name

    name = models.CharField("姓名", max_length=16, null=False)
    child = models.ForeignKey(
        Student, on_delete=models.CASCADE, verbose_name="学生姓名")
    GENDER = (
        ("男", "男"),
        ("女", "女"),
    )
    gender = models.CharField("性别", max_length=2, choices=GENDER, null=False)
    u_name = models.CharField("用户名", max_length=50, blank=False)
    pass_wd = models.CharField("密码", max_length=50, blank=False, default='00000000')
