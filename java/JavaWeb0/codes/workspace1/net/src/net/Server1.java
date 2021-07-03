package net;
import java.io.IOException;
import java.io.PrintStream;
import java.net.*;
public class Server1 {

	public static void main(String[] args) {
		//任務 与客户端的请求建立套接字连接并响应客户端发送一条消息！
		
		//1 创建服务器端套接字！
		//服务器端套接字 只需指定端口号！ip就是本机！
		//此套接字是服务器端的。等待客户端向自己请求！可以生成多个套接字！
		Socket s=null;
		PrintStream ps =null;
		try {
			ServerSocket ss = new ServerSocket(30001);
			//ss套接字等待客户端请求。成功后会返回一个与请求对应的套接字
			while(true){
				s=ss.accept();//如果客户端发送了请求！则生成s
				//s输出流发送给客户端的输入流
				ps =new PrintStream(s.getOutputStream());
				ps.println("hello "+s.getInetAddress()+" 谢谢访问服务器！");
				//关闭资源
				ps.close();
				s.close();
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			//记得关闭资源！

		}
	}

}
