"""
Model of Student.
"""
from django.db import models
from grade_class.models import Grade, Clas


class Department(models.Model):
    """
     Create department of students
    """

    def __str__(self):
        return self.name

    name = models.CharField("院系", max_length=16, null=False)
    no = models.CharField("院系编号", max_length=2, null=False)


class Student(models.Model):
    """
    Create info of student
    """

    def __str__(self):
        return self.name

    department = models.ForeignKey(
        Department, verbose_name="所在院系", on_delete=models.CASCADE)
    grade = models.ForeignKey(
        Grade, verbose_name="所属年级", on_delete=models.CASCADE)
    clas = models.ForeignKey(Clas, verbose_name="所属班级", on_delete=models.CASCADE)
    name = models.CharField("姓名", max_length=16, null=False)
    GENDER = (
        ("男", "男"),
        ("女", "女"),
    )
    no = models.CharField("用户名", max_length=50)
    password = models.CharField("密码", max_length=50, default='00000000')
    gender = models.CharField("性别", max_length=2, choices=GENDER, null=False)
    # no = models.ForeignKey(User, verbose_name="学号",
    #                        on_delete=models.CASCADE)
    is_leave = models.BooleanField("已离校", null=False, default=False)
    start_year = models.DateField(null=False, verbose_name="入学日期")
    leave_year = models.DateField(null=False, verbose_name="离校日期")
