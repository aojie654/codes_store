package DBmanager;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * 该类用于连接数据库,关闭数据库
 * 
 * 
 */
public class DBManager {
	/**
	 * 无参构造函数
	 * 
	 */
	public DBManager() {

	}

	private Connection conn = null;

	private String url = "jdbc:mysql://localhost:3306/bookstore";

	private String username = "root";

	private String password = "root";
	
	private boolean transactionON = false; 

	/**
	 * 获得数据库连接对象
	 * 
	 * @return conn 数据库连接对象
	 */
	public Connection getConnection() {

		try {

			Class.forName("com.mysql.jdbc.Driver").newInstance();

			conn = DriverManager.getConnection(url, username, password);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return conn;
	}

	/**
	 * 关闭数据库
	 */
	public void closeAll(ResultSet rs,Statement stmt,Connection conn) {

		try {
			if (rs != null) {
				rs.close();
			}
			if (stmt != null) {
				stmt.close();
			}
			if (conn != null&&!isTransactionON()) {
				conn.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * 打开事务处理
	 * @param conn
	 * 
	 */
	public void startTransaction(Connection conn)throws SQLException{
		this.transactionON=true;
		conn.setAutoCommit(false);
	}
	
	/**
	 * 提交事务处理
	 * 
	 * @param conn 数据库连接对象
	 * @throws SQLException 
	 */
	public void commitTransaction(Connection conn) throws SQLException{		
		conn.commit();
		conn.setAutoCommit(true);
		this.transactionON=false;
	}
	
	/**
	 * 回滚事务处理
	 * 
	 * @param conn 数据库连接对象
	 */
	public void rollbackTransaction(Connection conn){
		
		try {
			this.transactionON=false;
			conn.rollback();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * 判断事务是否开启
	 * 
	 * @return  transactionON
	 */
	public boolean isTransactionON() {
		return transactionON;
	}
}
