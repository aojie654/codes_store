package demo;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class BufferedTest {

	public static void main(String[] args) {
		
		//使用buffered效率更高！减少IO访问次数！
		BufferedInputStream bi=null;
		InputStream input = null;
		try {//"src//demo//InputStreamTest.java"
			input = new FileInputStream("poem.txt");//相对路径！绝对
			//处理流包装 节点流，或其他流 bi是带缓冲区的输入字节流！
			bi = new BufferedInputStream(input);
			//通常你看到的bi的初始化如下！
			//bi = new BufferedInputStream(new FileInputStream("poem.txt"));
			
			bi.mark(0);//定义数据指针的位置。
			bi.reset();//将数据指针指向mark的初始位置！
	
			int readNum=0;//读的数据的数量！
			byte [] bottle = new byte[1024];//数据放到水壶里！
			//使用input流，从poem.txt中读数据！
			//尽可能多的读数据。将数据放到bottle中。
			//读了多少数据返回给readNum。这样就知道bottle有多少数据！	
			while((readNum=bi.read(bottle))>0){
			//要把缸中的水都摇出来。那就要一瓢一瓢不停的摇，知道摇完。
			System.out.println("readNum"+readNum);
			System.out.println(new String(bottle,0,readNum));
			}//poem 文档有1024+1024+83个字节！
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
			try {
				input.close();//关闭input输入流资源！ 先关先打开的。
				bi.close();//后关后打开的。
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
				
	}

}
