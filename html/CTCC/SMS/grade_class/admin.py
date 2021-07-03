"""
Adminiton of Grade and Class.
"""

from django.contrib import admin
from .models import Grade, Clas


class GradeAdmin(admin.ModelAdmin):
    """
    Display +
    """
    list_display = ('no',)


admin.site.register(Grade, GradeAdmin)


class ClasAdmin(admin.ModelAdmin):
    """
    Display +
    """
    list_display = ('name', 'no')
    list_filter = ['no']
    search_fields = ['name']


admin.site.register(Clas, ClasAdmin)
