import datetime
from django.db import models
from django.utils import timezone


class Notification(models.Model):
    def __str__(self):
        return self.name

    name = models.CharField("名称", max_length=50)
    no = models.CharField("编号", max_length=50)
    CONTEXT_TYPE = (
        ("文件", "文件"),
        ("通告", "通告"),
        ("通知", "通知"),
    )
    context_type = models.CharField("类型", choices=CONTEXT_TYPE, max_length=6, blank=False, default="通知", null=False)
    related_time = models.DateTimeField("发布日期")
    content = models.TextField("内容")


class Question(models.Model):
    # ...
    def __str__(self):
        return self.question_text

    def was_published_recently(self):
        now = timezone.now()
        return now - datetime.timedelta(days=1) <= self.pub_date <= now

    question_text = models.CharField(max_length=200)
    pub_date = models.DateTimeField('date published')
    was_published_recently.admin_order_field = 'pub_date'
    was_published_recently.boolean = True
    was_published_recently.short_description = 'Published recently?'


class Choice(models.Model):
    def __str__(self):
        return self.choice_text

    question = models.ForeignKey(Question, on_delete=models.CASCADE)
    choice_text = models.CharField(max_length=200)
    votes = models.IntegerField(default=0)
