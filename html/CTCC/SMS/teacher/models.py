"""
This app is for teacher
"""

from django.db import models


class Department(models.Model):
    """
     Create department of teachers
    """

    def __str__(self):
        return self.name

    name = models.CharField("教师部门", max_length=16, null=False)
    no = models.CharField("部门编号", max_length=2, null=False)


class Teacher(models.Model):
    """
    Create info of teachers
    """

    def __str__(self):
        return self.name

    department = models.ForeignKey(
        Department, verbose_name="部门", on_delete=models.CASCADE)
    name = models.CharField("姓名", max_length=4, null=False)
    GENDER = (
        ("男", "男"),
        ("女", "女"),
    )
    gender = models.CharField("性别", max_length=2, choices=GENDER, null=False)
    no = models.CharField("职工号", max_length=50)
    password = models.CharField("密码", max_length=50, default='00000000')
    is_leave = models.BooleanField(
        verbose_name="已离职", null=False, default=False)
    start_year = models.DateField(verbose_name="入职日期", null=False)
    leave_year = models.DateField("离职日期", null=True, blank=True)
