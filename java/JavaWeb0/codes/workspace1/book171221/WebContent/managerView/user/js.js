/**
 * 
 */

 	function CheckForm(){
 	if(document.a.name.value.length == 0){
 		alert("请输入用户名！");
 		document.a.name.focus();
 	}else if(document.a.realName.value.length==0){
 		alert("请输入真实姓名!");
 		document.a.realName.focus();
 	}else if(document.a.age.value.length==0){
 		alert("请输入您的年龄");
 		document.a.age.focus();
 	}else if(document.a.phone.value.length==0){
 		alert("请输入您的手机号码");
 		document.a.phone.focus();
 	}else if(document.a.address.value.length==0){
 		alert("请输入您的联系地址");
 		document.a.address.focus();
 	}else if(document.a.email.value.length==0){
 		alert("请输入您的电子邮箱");
 		document.a.email.focus();
 	}else if((!document.a.sex[0].checked)&&(!document.a.sex[1].checked)){
 		alert("请选择您的性别");
 		document.a.sex[0].focus();
 	}
 	else{
 		return true;
 	}
 	return false;
 }

 	
function isName(strName) {
 		if (strName.search(/^(\w){6,20}$/) != -1)
 			return true;
 		else{
 			alert("请输入正确的用户名!只能输入6-20个字母、数字、下划线");
 			document.a.name.focus();
 		}
}

function isPhone(strPhone) {
		if (strPhone.search(/^[1][3,4,5,7,8][0-9]{9}$/) != -1)
			return true;
		else{
			alert("请输入正确的电话");
			document.a.phone.focus();
		}
}

function isEmail(strEmail) {
	if (strEmail.search(/^\w+([-+.]\w+)*@\w+([-.]\w+)*\.\w+([-.]\w+)*/) != -1)
		return true;
	else{
		alert("请输入正确的Email!");
		document.a.email.focus();
		}
}
function isAge(strAge) {
	if (strAge.search(/^[0-9]{1,2}$/) != -1)
		return true;
	else{
		alert("请输入正确的年龄!");
		document.a.age.focus();
	}
}
