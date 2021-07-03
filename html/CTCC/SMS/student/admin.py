"""
Adminiton of Student.
"""

from django.contrib import admin
from .models import Department, Student


class DepAdmin(admin.ModelAdmin):
    """
    Display +
    """
    list_display = ('name', 'no')


class StuAdmin(admin.ModelAdmin):
    """
    Display +
    """
    list_display = ('name', 'gender', 'no', 'department', 'grade', 'clas')
    list_filter = ['no']
    search_fields = ['name']


admin.site.register(Department, DepAdmin)
admin.site.register(Student, StuAdmin)
