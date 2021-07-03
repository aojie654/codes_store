package dao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import DBmanager.DBManager;
import bean.*;

/**
 * 实现对购物车的管理
 *
 */
public class BookCartDAO {
	
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
	public BookCartDAO(){
		dbm=new DBManager();
		this.conn=dbm.getConnection();
	}
	
	/**
	 * 有参构造函数
	 * @param conn
	 */
	public BookCartDAO(DBManager dbm,Connection con){
		this.dbm=dbm;
		this.conn=con;
	}
	
	/**
	 * 删除购物车中的一条记录
	 * @param id
	 * @throws SQLException 
	 */
	public void deleteCart(String bookId) throws SQLException{
		
		String delete;
		delete = "delete from cart where bookId="+bookId+";";
		
		try{
			if(conn.isClosed()){
				conn =	dbm.getConnection();
			}
			stmt = conn.createStatement();
			stmt.executeUpdate(delete);
			
		}catch(SQLException e){
			e.printStackTrace();
			throw e;
		}finally{
			dbm.closeAll(rs, stmt, conn);
		}	
	}
	
	
	/**
	 * 删除用户购物车中的所有记录
	 * @param userName
	 * @throws SQLException 
	 */
	public void deleteUserCart(String userName) throws SQLException{
		
		String delete;
		delete = "delete from cart where userName='"+userName+"';";
		try{
			if(conn.isClosed()){
				conn =	dbm.getConnection();
			}
			stmt = conn.createStatement();
			stmt.executeUpdate(delete);
			
		}catch(SQLException e){
			e.printStackTrace();
			throw e;
		}finally{
			dbm.closeAll(rs,stmt,conn);
		}	
	}
	
	/**
	 * 向购物车中插入一条记录
	 * @param cart
	 */
	public void insertCart(BookCart cart){
		
		
		String name=cart.getName();
		float unitPrice = cart.getUnitPrice();
		float totalPrice = cart.getTotalPrice(); 
		int number = cart.getNumber();
		Date date = cart.getAddDate();
		int bookId = cart.getBookId();
		String userName = cart.getUserName();

		String insert = "insert into cart(userName,name,unitPrice,number,totalPrice,addDate,bookId)" +
						"values(?,?,?,?,?,?,?);";
		
		try{
			if(conn.isClosed()){
				conn =	dbm.getConnection();
			}
			pstmt = conn.prepareStatement(insert);
			pstmt.setString(1, userName);
			pstmt.setString(2,name);
			pstmt.setFloat(3, unitPrice);
			pstmt.setInt(4,number);
			pstmt.setFloat(5,totalPrice);
			pstmt.setDate(6,date);
			pstmt.setInt(7,bookId);
			pstmt.executeUpdate();
		}catch(SQLException e){
			e.printStackTrace();
		}finally{
			dbm.closeAll(rs, pstmt, conn);
		}
		
	}
	
	/**
	 * 向购物车中更新一条记录
	 * @param cart
	 */
	public void updateCart(BookCart cart){
		
		float unitPrice = cart.getUnitPrice();
		float totalPrice = cart.getTotalPrice(); 
		int number = cart.getNumber();
		Date date = cart.getAddDate();
		int bookId = cart.getBookId();

		String update = "update cart set unitPrice= ?,number =?,totalPrice=?,addDate=? where bookId= " +
						bookId;
		
		try{
			if(conn.isClosed()){
				conn =	dbm.getConnection();
			}
			pstmt = conn.prepareStatement(update);
			pstmt.setFloat(1, unitPrice);
			pstmt.setInt(2,number);
			pstmt.setFloat(3, totalPrice);
			pstmt.setDate(4,date);
			pstmt.executeUpdate();
		}catch(SQLException e){
			e.printStackTrace();
		}finally{
			dbm.closeAll(rs, pstmt, conn);
		}
		
	}
	
	/**
	 * 按照用户名来查询对应的购物车记录
	 * @param userName
	 * @return
	 */
	public List<BookCart> querryCart(String userName){
		
		
		String querry = "select * from cart where userName=\'"+userName+"\';";

		BookCart cart=null; 
		List<BookCart> allCart = new ArrayList<BookCart>();
			
			
		try{
			if(conn.isClosed()){
				conn =	dbm.getConnection();
			}
			stmt = conn.createStatement();
			rs = stmt.executeQuery(querry);
			
			while(rs.next()){
			cart = new BookCart();
			cart.setId(rs.getInt(1));
			cart.setUserName(rs.getString(2));
			cart.setName(rs.getString(3));
			cart.setUnitPrice(rs.getFloat(4));
			cart.setNumber(rs.getInt(5));
			cart.setTotalPrice(rs.getFloat(6));
			cart.setAddDate(rs.getDate(7));
			cart.setBookId(rs.getInt(8));
			allCart.add(cart);
			}
			
		}catch(SQLException e){
			e.printStackTrace();
		}finally{
				dbm.closeAll(rs, stmt, conn);
		}
		return allCart;
	}
	
	/**
	 * 按照用户名和书ID来查询对应的某条购物车记录
	 * @param userName
	 * @param bookId
	 * @return
	 */
	public BookCart querryCartById(String userName,int bookId){
		
		
		String querry = "select * from cart where userName=\'"+userName+"\' and bookId ="+bookId + ";";
		BookCart cart=null;
		
		try{
			conn = dbm.getConnection();
			stmt = conn.createStatement();
			rs = stmt.executeQuery(querry);
			
			if(rs.next()){
			cart = new BookCart();
			cart.setId(rs.getInt(1));
			cart.setUserName(rs.getString(2));
			cart.setName(rs.getString(3));
			cart.setUnitPrice(rs.getFloat(4));
			cart.setNumber(rs.getInt(5));
			cart.setTotalPrice(rs.getFloat(6));
			cart.setAddDate(rs.getDate(7));
			cart.setBookId(rs.getInt(8));
			}
			
		}catch(SQLException e){
			e.printStackTrace();
		}finally{
			dbm.closeAll(rs, stmt, conn);
		}
		return cart;
	}
}
