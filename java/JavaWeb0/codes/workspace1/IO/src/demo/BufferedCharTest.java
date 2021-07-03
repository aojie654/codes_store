package demo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;

public class BufferedCharTest {

	public static void main(String[] args) {
		//BufferedReader 与 BufferedInputStream区别是有了readLine方法。可以一行一行的读！
		//使用buffered效率更高！减少IO访问次数！
		BufferedReader bi=null;
		Reader input = null;
		BufferedWriter writer =null;
		try {//"src//demo//InputStreamTest.java"
			input = new FileReader("poem.txt");//相对路径！绝对
			//处理流包装 节点流，或其他流 bi是带缓冲区的输入字节流！
			bi = new BufferedReader(input);//高级的BufferedReader包装了低级的输入流！只能输入流包装输入流。
			
			//只能输入流包装输出流！包装后的还是个输出流
			//通常你看到的bi的初始化如下！
			//bi = new BufferedReader(new FileReader("poem.txt"));
			writer = new BufferedWriter(new FileWriter("poem2.txt"));
			String line =null;
			while((line=bi.readLine())!=null){
				System.out.println(line);
				writer.write(line);
				writer.flush();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
			try {
				input.close();//关闭input输入流资源！ 先关先打开的。
				bi.close();//后关后打开的。
				writer.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
				
	}

}
