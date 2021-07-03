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
 * 该类操作TradeRecord在数据库中的数据
 *
 */ 
public class TradeRecordDAO {
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
	public TradeRecordDAO() {
		dbm=new DBManager();
		this.conn=dbm.getConnection();
	}
	
	/**
	 * 有参构造函数
	 * @param conn
	 */
	public TradeRecordDAO(DBManager dbm,Connection conn) {
		this.dbm=dbm;
		this.conn=conn;
	}
	
	/**
	 * 将一个交易记录对象插入到数据库中
	 * @param tr
	 * @throws SQLException 
	 */
	public void insertRecord(TradeRecord tr) throws SQLException {
		// 数据库插入语句
		String sql = "insert into traderecord(userId,bookId,tradeNum,sum) values(?,?,?,?)";
		
		try {
			if(conn.isClosed()){
				conn =	dbm.getConnection();
			}
			// 获得预处理结果集
			pstmt = conn.prepareStatement(sql);
			// 依次将属性插入数据库
			pstmt.setString(1, String.valueOf(tr.getUserId()));
			pstmt.setString(2, String.valueOf(tr.getBookId()));
			pstmt.setString(3, String.valueOf(tr.getTradeNum()));
			pstmt.setString(4, String.valueOf(tr.getSum()));
			pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
			throw e;
		} finally {
			// 关闭数据库连接
			dbm.closeAll(rs,stmt,conn);
		}
	}
	
	/**
	 * 查询所有销售记录
	 */
	public List<TradeRecord> querryRecord() {
		String sql = "select * from traderecord";
		List<TradeRecord> recordList = null;
		try {
			if(conn.isClosed()){
				conn =	dbm.getConnection();
			}
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			recordList = new ArrayList<TradeRecord>();
			
			while(rs.next()) {
				TradeRecord tr = new TradeRecord();
				tr.setId(rs.getInt(1));
				tr.setUserId(rs.getInt(2));
				tr.setBookId(rs.getInt(3));
				tr.setTradeNum(rs.getInt(4));
				tr.setSum(rs.getDouble(5));
				recordList.add(tr);
			}
			return recordList;
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			dbm.closeAll(rs,stmt,conn);
			
		}
		return recordList;
	}
}
