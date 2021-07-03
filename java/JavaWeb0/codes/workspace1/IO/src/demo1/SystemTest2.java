package demo1;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
//从键盘输入到文档中！ 通过修改默认的输入输出完成的！ System.in 键盘！ System.out 控制台！
public class SystemTest2 {
	//改变系统默认输出。将键盘输入存储到console.txt文件中！每次输入一行键盘字符，并存储！
	public static void main(String[] args) {
		// 参数必须是字节流 System.in是系统默认输入流！就是键盘这个可以设置更改！
		//转换流！将字节流转换成字符流！注意！没有将字符流转换成字节流的类！
		InputStreamReader reader =new  InputStreamReader(System.in);//System.in键盘输入本质是字符输入！
		//reader是字符流 被处理流包装！进行了缓冲区包装
		BufferedReader br = new BufferedReader(reader);//输入流包装输入流。输出流包装输出流！切不要弄混！
		String line=null;
		try {
			//修改默认的输出！将sysout输出到console.txt文档中！
			System.setOut(new PrintStream(new FileOutputStream("console.txt")));
			while((line=br.readLine())!=null){
				if(line.equals("exit")){
					System.exit(1);
				}
				System.out.println(line);//将line打印倒文档中！
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			try {
				reader.close();//关闭先打开的流
				br.close();//在关闭后打开的流。
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
