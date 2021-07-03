package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import DBmanager.*;
import bean.*;

/**
 * 实现图书类别管理
 * 
 */

public class BookCategoryDAO {
	
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
	public BookCategoryDAO(){
		dbm=new DBManager();
		this.conn=dbm.getConnection();
	}
	
	/**
	 * 有参构造函数
	 * @param conn
	 */
	public BookCategoryDAO(DBManager dbm,Connection con){
		this.dbm=dbm;
		this.conn=con;
	}
	
	/**
	 * 按照类别名来查询响应的类别对象返回
	 * @param id
	 * @return BookCategory
	 */
	
	public BookCategory querryUseName(String name) {
		String querry = "select * from category where name = \'"+name+"\'";

		BookCategory  bc = null;
		try{
			bc = new BookCategory();
			if(conn.isClosed()){
				conn =	dbm.getConnection();
			}
			stmt = conn.createStatement();
			rs = stmt.executeQuery(querry);
			
			if(rs.next()){
				bc.setId(rs.getInt(1));
				bc.setName(rs.getString(2));
			}
			
		}catch(SQLException e){
			e.printStackTrace();
		}finally{
			dbm.closeAll(rs, stmt, conn);
		}
		return bc;
	}
	
	/**
	 * 按照ID来查询响应的类别对象
	 * @param id
	 * @return 类别对象
	 */
	public BookCategory querry(int id){
		String querry = "select * from category where id = "+id+";";
		BookCategory  bc = null;
		try{
			bc = new BookCategory();
			if(conn.isClosed()){
				conn =	dbm.getConnection();
			}
			stmt = conn.createStatement();
			rs = stmt.executeQuery(querry);
			
			while(rs.next()){
				bc.setId(rs.getInt(1));
				bc.setName(rs.getString(2));
			}
		return bc;
		}catch(SQLException e){
			e.printStackTrace();
		}finally{
			dbm.closeAll(rs, stmt, conn);
		}
		return bc;
	}
	
	
	/**
	 * 将一个类别对象插入到数据库中
	 * @param bc
	 */
	public void insert(BookCategory bc){
		String insert = "insert into category(name) values(?);";
		
		try{
			if(conn.isClosed()){
				conn =	dbm.getConnection();
			}
			pstmt = conn.prepareStatement(insert);
			pstmt.setString(1, bc.getName());
			pstmt.executeUpdate();
			
		}catch(SQLException e){
			e.printStackTrace();
		}finally{
			dbm.closeAll(null, pstmt, conn);
		}
	}
	
	/**
	 * 根据ID来删除一个类别对象
	 * @param id
	 */
	public void delete(int id){
		
		String delete = "delete from category where id = "+id+";";
		
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
	
	/**
	 * 更新一个类别对象
	 * @param bc
	 */
	public void update(BookCategory bc){
		String update = "update category set name = ?  where id = "+ bc.getId()+";";
		
		try{
			if(conn.isClosed()){
				conn =	dbm.getConnection();
			}
			pstmt = conn.prepareStatement(update);
			pstmt.setString(1,bc.getName());
			pstmt.executeUpdate();
		}catch(SQLException e){
			e.printStackTrace();
		}finally{
			dbm.closeAll(null, pstmt, conn);
		}
	}
	
	/**
	 * 查询所有图书类别
	 * @return
	 */
	public List<BookCategory> querryCategory() {
		String sql = "select * from category";
	
		List<BookCategory> categoryList = null;
		try {
			if(conn.isClosed()){
				conn =	dbm.getConnection();
			}
			stmt = conn.createStatement();
			categoryList = new ArrayList<BookCategory>();
			rs = stmt.executeQuery(sql);
			
			while(rs.next()) {
				BookCategory bc =new BookCategory();
				bc.setId(rs.getInt(1));
				bc.setName(rs.getString(2));
				categoryList.add(bc);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			dbm.closeAll(rs,stmt,conn);
		}
		return categoryList;
	}
}
