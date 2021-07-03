package net1;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import java.util.Map;

public class URLTest {
	/**html form get  http://www.baidu.com?name1=value1&name2=value2
	 * 向指定URL发送GET方法的请求
	 * @param url 发送请求的URL
	 * @param param 请求参数，格式满足name1=value1&name2=value2的形式。
	 * @return URL所代表远程资源的响应
	 */
	public static String sendGet(String url , String param) 
	{
		StringBuffer result = new StringBuffer();
		String urlName = url + "?" + param;
		try
		{
			URL realUrl = new URL(urlName);
			// 打开和URL之间的连接 与url地址服务器的连接！
			URLConnection conn = realUrl.openConnection();
			// 设置通用的请求属性 http请求头属性设置！
			conn.setRequestProperty("accept", "*/*"); 
			conn.setRequestProperty("connection", "Keep-Alive");
			conn.setRequestProperty("Charset", "utf-8");
			conn.setRequestProperty("user-agent"
				, "Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.1; SV1)"); 
			
			//建立真正连接
			conn.connect();
			//获得响应头，打印响应头信息！
			Map<String,List<String>> map=conn.getHeaderFields();
			for(String key:map.keySet()){
				System.out.println(key+"--->"+map.get(key));
			}
			//得到输入流  
			//try(){} 此用法中（）中可以定义初始化资源对象，省略finally中的close。
			try(InputStream input=conn.getInputStream();
					BufferedReader br = new BufferedReader(
					new InputStreamReader(input)))
				{		
					//循环取数据！
					String line;
					while((line=br.readLine())!=null){
						result.append("\n"+line);
						//result + = "\n"+line;
					}
				}
		}catch(Exception e){
		  System.out.println("get请求异常！");
		}
		return result.toString();
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
		String s = URLTest.sendGet("http://www.xjtucc.cn", null);
		System.out.println(s);
		// 发送POST请求
		String s1 = URLTest.sendPost("http://localhost:8080/HelloWorld/login.jsp"
			, "userName=lilei&userPwd=123456");
		System.out.println(s1);
	}
}
