"""
Adminiton of Teacher.
"""

from django.contrib import admin
from .models import Department, Teacher

admin.site.register(Department)
admin.site.register(Teacher)
