"""
This app is for grade and class
"""
from django.db import models


class Grade(models.Model):
    """
     Create for student grade
    """

    def __str__(self):
        return str(self.no)

    no = models.CharField("年级", max_length=4, null=False)



class Clas(models.Model):
    """
    Using clas for unrepeat with class
    """

    def __str__(self):
        return self.name

    name = models.CharField("班级", max_length=12, null=False)
    no = models.CharField("班级序号", max_length=4, null=False)
