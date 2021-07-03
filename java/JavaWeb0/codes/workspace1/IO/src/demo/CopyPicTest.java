package demo;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class CopyPicTest {

	public static void main(String[] args) {
		//输入和输出都带缓冲区！
		BufferedInputStream input = null;
		BufferedOutputStream output=null;//1
		try {//"src//demo//InputStreamTest.java"
			//初始化输入流！ 处理流包装普通流。实现缓冲！
			input =new BufferedInputStream( new FileInputStream("123.jpg"));//相对路径！绝对
			//初始化输出流！处理流包装普通流。实现缓冲！
			output =new BufferedOutputStream( new FileOutputStream("copy.jpg"));//2
			int readNum=0;//读的数据的数量！
			byte [] bottle = new byte[1024];//数据放到水壶里！
			//使用input流，从poem.txt中读数据！
			//尽可能多的读数据。将数据放到bottle中。
			//读了多少数据返回给readNum。这样就知道bottle有多少数据！
			while((readNum=input.read(bottle))>0){
			//要把缸中的水都摇出来。那就要一瓢一瓢不停的摇，知道摇完。
			System.out.println("readNum"+readNum);
			System.out.println(new String(bottle,0,readNum));
			output.write(bottle, 0, readNum);//3    将bottle中的内容输出到output中！
			output.flush();//冲一下缓冲区！否则当缓冲区满了才flush。或关闭前会flush
			}//poem 文档有1024+1024+83个字节！
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
			try {
				input.close();//关闭input输入流资源！
				output.close();//4        关闭output输出流！
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		
	}

}
