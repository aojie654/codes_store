package demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

//对登录信息进行验证！
public class User {
	//类内部的用户数据信息！
	private static String [][] data={{"bi","123"},{"admin","admin"},
		{"lily","123456"},{"tiger","scott"},{"root","root"}};
	
	//验证用户名和密码！
	public static boolean checkLogin(String user ,String pass){
		boolean ok = false;
		for(int i=0;i<data.length;i++){
			//data[i][0] i行第一个元素。肯定是用户名。
			//data[i][1] i行第二个元素， 肯定是密码。
			if(user.equals(data[i][0])&&pass.equals(data[i][1])){
				ok=true;
				break;
			}
		}
		return ok;
	}
	
	public static boolean checkLogin2(String user, String pass){
		boolean ok = false;
		//访问数据库！sql ="select * from user"
		//sql语句有几个类型？增 删 改  查。只有查类型sql语句返回结果集
		//1 注册数据库驱动程序类！
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Connection conn=null;
		Statement state=null;//比较简单！
		//较Statement对象功能更强大！效率更高。sql语句中有？参数需要设定时使用。
		PreparedStatement pst=null;
		ResultSet rs=null;//结果集
		try{
			//2获得数据库连接  
			//半角符号， 小写字母
			String url = "jdbc:mysql://192.168.202.229:3306/bookstore";
			 conn=DriverManager.getConnection(url, "java", "java");
			//3获得操作数据库的句柄Statement对象。
			 state = conn.createStatement();
			//4执行sql语句，获得结果 select 语句使用executeQuery
			 rs=	state.executeQuery("select name,pass from user;");
			 //对于增 删 改使用哪个方法？executeUpdate
			 //int count=  state.executeUpdate(sql);
			
			 //5如果是select语句则需要对返回的结果集进行处理resultSet
			//处理结果集rs对象里面的所有结果。
			String userName="",passWord="";
			while(rs.next()){//rs.next()判断只要结果集还有内容则进入循环
				userName=rs.getString("name");
				passWord=rs.getString("pass");
				if(userName.equals(user)&&passWord.equals(pass)){
					ok=true;
					break;
				}
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			try {//6 关闭资源。最后打开的资源，最先关闭！
				if(rs!=null){
					rs.close();
				}
				if(state!=null){
					state.close();
				}
				if(conn!=null){
					conn.close();
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		//返回结果
		return ok;
	}
	
	
	//测试User类是否正确！
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean ok = User.checkLogin("bi", "123");
		System.out.println(ok);
		ok = User.checkLogin("admin", "admin");
		System.out.println(ok);
		ok = User.checkLogin("lily", "123");
		System.out.println(ok);
		ok = User.checkLogin("roott", "root");
		System.out.println(ok);
	}

}
