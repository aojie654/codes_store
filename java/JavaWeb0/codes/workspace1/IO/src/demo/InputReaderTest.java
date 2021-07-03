package demo;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;

public class InputReaderTest {

	public static void main(String[] args) {
		InputStreamReader reader = null;
		BufferedReader br =null;
		try {
			//将默认输入改到文档中！
			System.setIn(new FileInputStream("poem.txt"));
			//转换流包装低级流  將system.in字節流轉換成了字符流！
			reader = new InputStreamReader(System.in);//System.in 键盘！
			br = new BufferedReader(reader);//再次包装字符流reader 变成带缓冲的字符流！
			String line=null;
			//将控制台输出改到一个文档中！
			System.setOut(new PrintStream(new FileOutputStream("console.txt")));
			while((line=br.readLine())!=null){//使用 readline方法更方便！
				System.out.println(line);
				if(line.equals("exit")){
					System.exit(1);//当输入exit时，程序结束！
				}
			}
		}catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			try {
				reader.close();
				br.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}

}
