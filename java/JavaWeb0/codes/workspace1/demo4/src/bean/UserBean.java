package bean;

import java.io.Serializable;

public class UserBean implements Serializable{

	private static final long serialVersionUID = 1L;
	//数据bean存放用户名和密码
	private String userName;
	private String userPwd;
	
	//无参构造函数
	public UserBean(){}
	//有参构造函数
	public UserBean(String name,String pwd){
		this.userName=name;
		this.userPwd=pwd;
	}	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserPwd() {
		return userPwd;
	}
	public void setUserPwd(String userPwd) {
		this.userPwd = userPwd;
	}
	
}
