"""
Create sms views
"""
from django.http import HttpResponse
from django.shortcuts import render_to_response


def index(request):
    """
    Create Index view
    """

    return render_to_response('student/m_index.html')
