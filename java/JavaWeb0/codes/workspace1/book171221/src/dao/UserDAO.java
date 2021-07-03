package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import DBmanager.*;
import bean.*;

import java.sql.PreparedStatement;

/**
 * 该类操作User类在数据库中的数据
 * 
 * 
 */
public class UserDAO {

	
	// 数据库管理类
	DBManager dbm = null;
	// 数据库连接
	private Connection conn = null;
	// 会话
	private Statement stmt = null;
	// 结果集
	private ResultSet rs = null;
	// 预处理结果集
	private PreparedStatement pstmt = null;
	
	/**
	 * 无参构造函数
	 * 
	 */
	public UserDAO() {
		dbm=new DBManager();
		this.conn=dbm.getConnection();
	}

	/**
	 * 有参构造函数
	 * @param conn
	 */
	public UserDAO(DBManager dbm,Connection conn) {
		this.dbm=dbm;
		this.conn=conn;
	}
	
	/**
	 * 验证用户权限
	 */
	public boolean userTest(User u) {
		// 查询数据库的SQL语句
		String sql = "select * from user where name=\'" + u.getName()
				+ " \'and pass =\'" + u.getPass() + "\'";
		
		try {
			if(conn.isClosed()){
				conn =	dbm.getConnection();
			}
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			// 判断用户是否在数据库中
			if (rs.next()) {
				return true;	// 在，返回真
			} else {
				return false;	// 不在，返回假
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			// 关闭数据库连接
			dbm.closeAll(rs,stmt,conn);
		}
		return false;
	}
	
	/**
	 * 获取指定Id用户
	 */
	public User getUser(int id) {
		// 查询数据库的SQL语句
		String sql = "select * from user where id="+id+";";
		User u =new User();
		try {
			if(conn.isClosed()){
				conn =	dbm.getConnection();
			}
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			// 判断用户是否在数据库中
			if(rs.next()){
				u = new User();
				u.setId(rs.getInt(1));
				u.setName(rs.getString(2));
				u.setPass(rs.getString(3));
				u.setRole(rs.getInt(4));
				u.setRealName(rs.getString(5));
				u.setPhone(rs.getString(6));
				u.setEmail(rs.getString(7));
				u.setAddress(rs.getString(8));
				u.setAge(rs.getInt(9));
				u.setSex(rs.getString(10));
				u.setRegisterDate(rs.getDate(11));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			// 关闭数据库连接
			dbm.closeAll(rs,stmt,conn);
		}
		return u;
	}
	
	
	/**
	 * 插入一个用户对象到USER表
	 * @param user
	 */
	public void insertUser(User user) {
		String sql = "insert into user(name,pass,role,realName,phone,email,address,age,sex,registerDate) values(?,?,?,?,?,?,?,?,?,?)";
		
		try {
			if(conn.isClosed()){
				conn =	dbm.getConnection();
			}
			// 获得预处理结果集
			pstmt = conn.prepareStatement(sql);
			// 依次将属性插入数据库
			pstmt.setString(1, user.getName());
			pstmt.setString(2, user.getPass());
			pstmt.setString(3, String.valueOf(user.getRole()));
			pstmt.setString(4, user.getRealName());
			pstmt.setString(5, user.getPhone());
			pstmt.setString(6, user.getEmail());
			pstmt.setString(7, user.getAddress());
			pstmt.setString(8, String.valueOf(user.getAge()));
			pstmt.setString(9, user.getSex());
			pstmt.setString(10, String.valueOf(user.getRegisterDate()));
			pstmt.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();

		}finally {
			// 关闭数据库连接
			dbm.closeAll(rs,stmt,conn);
		}
	}
	
	/**
	 * 更新一个用户对象到USER表
	 * @param user
	 */
	public void updateUser(User user) {
		String sql = "update user set name = ?,realName=?,phone =?, email =?,address=?," +
		"age=?,sex=? where id = "+ user.getId();
		try {
			if(conn.isClosed()){
				conn =	dbm.getConnection();
			}
			// 获得预处理结果集
			pstmt = conn.prepareStatement(sql);
			// 依次将属性插入数据库
			pstmt.setString(1, user.getName());
			pstmt.setString(2, user.getRealName());
			pstmt.setString(3, user.getPhone());
			pstmt.setString(4, user.getEmail());
			pstmt.setString(5, user.getAddress());
			pstmt.setString(6, String.valueOf(user.getAge()));
			pstmt.setString(7, user.getSex());
			pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			// 关闭数据库连接
			dbm.closeAll(rs,stmt,conn);
		}
	}
	
	/**
	 * 查询所有USER对象
	 * @param name
	 * @return
	 */
	public List<User> getUserList(){
		String querry = "select name,age,sex,id from user ;";
		List<User> userList = new ArrayList<User>();
		try{
			if(conn.isClosed()){
				conn =	dbm.getConnection();
			}
			stmt = conn.createStatement();
			rs = stmt.executeQuery(querry);
			while(rs.next()){
				User u = new User();
				u.setName(rs.getString(1));
				u.setAge(rs.getInt(2));
				u.setSex(rs.getString(3));
				u.setId(rs.getInt(4));
				userList.add(u);
			}
		}catch(SQLException e){
			e.printStackTrace();
		}finally{
				// 关闭数据库连接
				dbm.closeAll(rs,stmt,conn);
			}
		return userList;
	}
	/**
	 * 根据姓名查询一个USER对象
	 * @param name
	 * @return
	 */
	public User querryUserbyName(String name){
		String querry = "select * from user where name = \'"+ name+"\';";
		User u = null;
		
		try{
			if(conn.isClosed()){
				conn =	dbm.getConnection();
			}
			stmt = conn.createStatement();
			rs = stmt.executeQuery(querry);
			
			while(rs.next()){
				u = new User();
				u.setId(rs.getInt(1));
				u.setName(rs.getString(2));
				u.setPass(rs.getString(3));
				u.setRole(rs.getInt(4));
				u.setRealName(rs.getString(5));
				u.setPhone(rs.getString(6));
				u.setEmail(rs.getString(7));
				u.setAddress(rs.getString(8));
				u.setAge(rs.getInt(9));
				u.setSex(rs.getString(10));
				u.setRegisterDate(rs.getDate(11));
				
			}
			
			return u;
		}catch(SQLException e){
			e.printStackTrace();
		}finally{
				// 关闭数据库连接
				dbm.closeAll(rs,stmt,conn);
			}
		return u;
	}
	
	/**
	 * 判断是否是管理员
	 * @param u
	 * 			
	 * @return
	 * 		如果是管理员，返回真
	 * 		不是返回假
	 */
	public boolean adminTest(String name,String password){
		//查询数据库的SQL语句
		String sql = "select * from user where name=\'" + name
				+ " \'and pass=\'" + password+"\'and role=0";
		try {
			if(conn.isClosed()){
				conn =	dbm.getConnection();
			}
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			// 判断用户是否在数据库中
			if (rs.next()) {
				return true;	// 在，返回真
			} else {
				return false;	// 不在，返回假
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			// 关闭数据库连接
			dbm.closeAll(rs,stmt,conn);
		}
		return false;
	}
	
	/**
	 * 根据用户ID来删除一个用户对象
	 * @param id
	 */
	public void delete(int id){
		
		String delete = "delete from user where id = "+id+";";
		
		try{
			if(conn.isClosed()){
				conn =	dbm.getConnection();
			}
			stmt = conn.createStatement();
			stmt.executeUpdate(delete);
		}catch(SQLException e){
			e.printStackTrace();
		}finally{
			dbm.closeAll(null, stmt, conn);
		}
	}
	
}
