"""
The Student View.
"""
from django.shortcuts import render, render_to_response
from django.http import HttpResponseRedirect
from django import forms
# from .models import User, Student
from .models import Student
from notification.models import Notification


# Create your views here.
# 定义表单模型


class UserForm(forms.Form):
    """
    User Login Form
    """
    username = forms.CharField(label='学号 :', max_length=50)
    password = forms.CharField(label='密码 :', widget=forms.PasswordInput())


# 登录


def login(request):
    """
    User Login Check
    """
    if request.method == 'POST':
        user_form = UserForm(request.POST)
        if user_form.is_valid():
            # 获取表单用户密码
            username = user_form.cleaned_data['username']
            password = user_form.cleaned_data['password']
            # 获取的表单数据与数据库进行比较
            user = Student.objects.filter(
                no__exact=username, password__exact=password)
            if user:
                # return render_to_response('student/index.html', {'username': username})
                return render_to_response('student/index.html',
                                          {'name': Student.objects.get(),
                                           'n_get': Notification.objects.get(),
                                           })
            else:
                return HttpResponseRedirect('/student/')
    else:
        user_form = UserForm()
    return render_to_response('student/login.html', {'uf': user_form})
