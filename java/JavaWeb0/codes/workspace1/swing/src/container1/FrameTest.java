package container1;

import java.awt.Dimension;
import java.awt.Point;

import javax.swing.JFrame;

public class FrameTest {
	//窗口
	private JFrame frame;
	
	//构造函数中构造窗口！
	public FrameTest(){
		//学习如何初始化一个窗口！
		//1构造函数
		frame = new JFrame("我的小窗口");
		//2 设置大小
		frame.setSize(new Dimension(300,400));
		frame.setSize(300,400);//两种方式都可以。宽300，长400
        //窗口显示的初始位置
		frame.setLocation(200, 100);//x,y 
		frame.setLocation(new Point(200,100));
		//使用默认退出行为
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//显示窗口
		frame.setVisible(true);		
	}
	public static void main(String[] args){
		new FrameTest();//显示窗口
	}
	
}
