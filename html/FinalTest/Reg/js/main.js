$(document).ready(function() {
	//为表单的必填文本框添加提示信息（选择form中的所有后代input元素）
	$("form :input.required").each(function() {
		//创建元素
		var $required = $("<strong class='high'>*</strong>");
		//将它追加到文档中
		$(this).parent().append($required);
	});
});

function submitCheck() {
	var userName = document.getElementById("userName").value;
	var passwordd = document.getElementById("password").value;
	var passwordCheck = document.getElementById("passwordCheck").value;
	var question = document.getElementById("question").value;
	var answer = document.getElementById("answer").value;
	var email = document.getElementById("email").value;
	var phone = document.getElementById('phone').value;
	var name = document.getElementById("name").value;
	var zipCode = document.getElementById('zipCode').value;
	var birthdateYear = document.getElementById("birthdateYear").value;
	var IDnumber = document.getElementById("IDnumber").value;
	var contact = document.getElementById('contact').value;
	if(!/^[a-zA-Z]{1}([a-zA-Z0-9_]){3,15}$/.test(userName) || !/^([a-zA-Z0-9_]){4,16}$/.test(passwordd || passwordCheck)) {
		alert('请输入正确的用户名，密码和确认密码！(可以使用字母数字下划线但必须以字母开头,且长度在4-16位之间)');
		return;
	}

	if(passwordd != passwordCheck) {
		alert("两次输入密码不一致！");
		return;
	}
	if(question.length == 0) {
		alert('请输入密码提示问题！');
		return;
	}
	if(answer.length == 0) {
		alert('请输入问题答案！');
		return;
	}

	if(email.length != 0 && !(/^[a-zA-Z0-9_-]+@[a-zA-Z0-9]+(\.[a-zA-Z0-9_-]+)+$/.test(email))) {
		alert('邮箱格式不正确！');
		return;
	}
	if(phone.length != 0 && !(/^(1[0-9])\d{10}$/.test(phone))) {
		alert('请输入正确的电话号码！');
		return;
	}
	if(name.length == 0) {
		alert('请输入您的姓名！');
		return;
	}
	if(zipCode.length != 0 && !(/^[0-9]{6}$/.test(zipCode))) {
		alert('请输入正确的邮编！');
		return;
	}

	if(birthdateYear.length == 0) {
		alert('请输入你的出生年份！');
	} else if(!/^19[0-9]{2}|^200[0-9]{1}|^201[0-7]{1}$/.test(birthdateYear)) {
		alert('出生年份格式有误！');
		return;
	}
	if(IDnumber.length != 0 && !(/^([0-9])\d{18}$/.test(IDnumber))) {
		alert('请输入正确身份证号！');
		return;
	}
	if(contact.length != 0 && !(/^(0[1-9]{2})-\d{8}$|^(0[1-9]{3}-(\d{7,8}))$/.test(contact))) {
		alert('请输入正确联系电话！');
		return;
	}
	alert('提交成功');
}