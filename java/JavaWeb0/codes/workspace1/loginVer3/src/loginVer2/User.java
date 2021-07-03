package loginVer2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class User {
	//增加一个验证方法，对用户名和密码验证。
	//版本1 用户名密码数据放在类中。
	public static String[][] data ={{"bi","123"},{"xiaowang","111"},{"admin","admin"},
			{"lily","123456"},{"ab","ab"},{"9p","9p"}};
	public static boolean checkLogin(String name,String pass){
		boolean ok=false;
		//对输入参数进行check 判断是否正确！
		for(int i=0;i<data.length;i++){
			if(name.equals(data[i][0])&&pass.equals(data[i][1])){
				ok= true;
			}
		}
		return ok;
	}
	
	public static boolean checkLogin2(String name,String pass){
		boolean ok=false;
		//对输入参数进行check 判断是否正确！
		//增 删 改 查 四种sql语句。
		//返回resultset的只有查这一种sql语句
		//1 加载数据库驱动程序。前提是jar包已导入
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			String url ="jdbc:mysql://192.168.202.229:3306/bookstore";
			//2建立数据连接
			Connection conn = DriverManager.getConnection(url, "java", "java");
			//3 创建句柄对象。Statement对象
			Statement state=conn.createStatement();
			//4执行sql语句。访问数据
			ResultSet rs =state.executeQuery("select name,pass from user");
			//5 访问ResultSet结果集。//如果是select语句
			String userName=null,passWord=null;
			
			while(rs.next()){
				userName = rs.getString("name");
				passWord = rs.getString("pass");
				if(name.equals(userName)&&pass.equals(passWord)){
					ok=true;
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			//关闭资源！
		}
		return ok;
	}
	//此方法用来测试函数是否正确
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean ok=User.checkLogin("lily", "123456");
		System.out.println(ok);
		ok=User.checkLogin("9p", "9p");
		System.out.println(ok);
		ok=User.checkLogin("9p", "xxx");
		System.out.println(ok);
	}
}
