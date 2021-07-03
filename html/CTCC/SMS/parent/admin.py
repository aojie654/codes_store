"""
Admiration of Parents.
"""

from django.contrib import admin
from .models import Parent


class ParentAdmin(admin.ModelAdmin):
    """
    Display +
    """
    list_display = ('name', 'u_name')


admin.site.register(Parent, ParentAdmin)
