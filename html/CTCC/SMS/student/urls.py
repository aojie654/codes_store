"""
This is a urls list of student.
"""

from django.urls import include,path
from . import views
from notification import urls
# from . import views  这个也可以使用,跟上面那个一样的

app_name = 'student'
urlpatterns = [
    path('', views.login, name='login'),
    path('notification/', include('notification.urls'), name='student_notification'),
]
