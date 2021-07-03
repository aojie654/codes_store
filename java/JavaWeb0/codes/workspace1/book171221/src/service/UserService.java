package service;

import java.util.List;

import bean.User;
import dao.BookCategoryDAO;
import dao.UserDAO;

public class UserService {
	/**
	 * 获得所有用户信息列表
	 * 
	 * @return List<User> 用户信息列表
	 */
	public List<User>  getUserList(){
		
		List<User> userList;
		UserDAO userdao = new UserDAO();
		userList = userdao.getUserList();
		return userList;
	}
	
	/**
	 * 获得制定id用户
	 * 
	 * @return User 用户信息
	 */
	public User  getUser(String id){
		
		User user;
		UserDAO userdao = new UserDAO();
		user = userdao.getUser(Integer.valueOf(id));
		return user; 
	}
	
	/**
	 * 用于删除一个用户
	 * @param String id
	 *	
	 */
	public void deleteUser(String id){
		UserDAO userdao = new UserDAO();
		userdao.delete(Integer.valueOf(id).intValue());
	}
	
	/**
	 * 用于删除多个用户
	 * @param String id
	 *	
	 */
	public void deleteUsers(String[] ids){
		for(String id:ids){
		UserDAO userdao = new UserDAO();
		userdao.delete(Integer.valueOf(id).intValue());
		}
	}
	
	//增加一个用户！ 
	public void insertUser(User user){
		UserDAO userdao = new UserDAO();
		userdao.insertUser(user);
	}
	
	//更新一个用户！ 
	public void updateUser(User user){
		UserDAO userdao = new UserDAO();
		userdao.updateUser(user);
	}
}
