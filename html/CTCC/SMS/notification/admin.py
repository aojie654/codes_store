"""
Adminiton of Notification.
"""

from django.contrib import admin
from .models import Notification


class NotiAdmin(admin.ModelAdmin):
    """
    Display +
    """
    list_display = ('name', 'no', 'related_time')
    list_filter = ['no', 'related_time']
    search_fields = ['name', 'no']


admin.site.register(Notification, NotiAdmin)
