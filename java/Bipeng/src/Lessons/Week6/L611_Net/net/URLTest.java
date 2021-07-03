package Lessons.Week6.L611_Net.net;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import java.util.Map;

public class URLTest {
	/**  www.baidu.com?name1=value1&name2=value2
	 * 向指定URL发送GET方法的请求
	 * @param url 发送请求的URL
	 * @param param 请求参数，格式满足name1=value1&name2=value2的形式。
	 * @return URL所代表远程资源的响应
	 */
	public static String sendGet(String url , String param) 
	{
		String result = "";
		String urlName = url + "?" + param;
		try
		{
			URL realUrl = new URL(urlName);
			// 打开和URL之间的连接 此链接与服务器链接了！可以输入输出！
			URLConnection conn = realUrl.openConnection();
			// 设置通用的请求属性 伪装http请求。http头属性设置！
			conn.setRequestProperty("accept", "*/*"); 
			conn.setRequestProperty("connection", "Keep-Alive"); 
			conn.setRequestProperty("user-agent", "Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.1; SV1)"); 
		
			//建立真连接！
			conn.connect();
			//获得响应的头字段
			Map<String,List<String>> map=conn.getHeaderFields();
			for(String key:map.keySet()){
				System.out.println(key+"--->"+map.get(key));
			}
			//获得具体内容！  try新用发。将需要释放的对象放在try（）中。则不用显示的finanlly释放！
			try(BufferedReader bd = new BufferedReader(
					new InputStreamReader(
							conn.getInputStream()));
			){
				String line ;
				while((line=bd.readLine())!=null){
					result +="\n"+line;
				}
			}
			
		}catch(Exception e){
			System.out.println("发送Get请求异常！");
		}
		return result;
	}
	/**
	 * 向指定URL发送POST方法的请求
	 * @param url 发送请求的URL
	 * @param param 请求参数，格式应该满足name1=value1&name2=value2的形式。
	 * @return URL所代表远程资源的响应
	 */	
	public static String sendPost(String url , String param)
	{
		String result = "";
		
		return result;
	}
	// 提供主方法，测试发送GET请求和POST请求
	public static void main(String args[])
	{
		// 发送GET请求
		String s = URLTest.sendGet("http://www.baidu.cn", null);
		System.out.println(s);
		// 发送POST请求
		//String s1 = URLTest.sendPost("http://localhost:8080/HelloWorld/login.jsp"
		//	, "userName=lilei&userPwd=123456");
		//System.out.println(s1);
	}
}
