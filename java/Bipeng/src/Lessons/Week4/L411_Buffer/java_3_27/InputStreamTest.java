package Lessons.Week4.L411_Buffer.java_3_27;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class InputStreamTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InputStream input=null;//输入流的使用！
		//让输入流指向一个文件！
		//对程序来说input。也就是从文件读取数据！
		try {//"d://poem.txt"绝对路径 "src/demo1/InputStreamTest.java"相对路径！
			input = new FileInputStream("code.txt");
			
			int readNum;//从文件中读了多少字节！
			//水壶用来舀水！从文件poem中舀水。（水就是数据）
			byte[] bottle = new byte[12];//水壶大小1024字节
			//输入流读取数据。read方法。
			while((readNum=input.read(bottle))>0){//抛出IO异常。非运行时异常所以要处理
				//readNum>0说明还有数据！1024+481字节！
				System.out.println("readNum:"+readNum);
				System.out.println(new String(bottle,0,readNum));
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			//无论如何都要关闭水龙头！
			try {
				input.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

}
