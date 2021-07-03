package service;

import bean.UserBean;

public class UserService {

	private static UserBean[] userDate=new UserBean[5];
	static{
		userDate[0]=new UserBean("tom","123");
		userDate[1]=new UserBean("jimmy","123");
		userDate[2]=new UserBean("jack","123");
		userDate[3]=new UserBean("lily","123");
		userDate[4]=new UserBean("lucy","123");
	}
	
	/*
	 * 验证用户名或密码是否正确
	 * userName表示外界传入的用户名
	 * userPwd表示外界传入的密码
	 */
	public static boolean checkLogin(UserBean userBean){
		
		for(int i=0;i<userDate.length;i++){
			if(userDate[i].getUserName().equals(userBean.getUserName())){
				if(userDate[i].getUserPwd().equals(userBean.getUserPwd())){
					return true;
				}
			}
		}
		return false;
	}
}