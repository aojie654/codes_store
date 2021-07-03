package layout2;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Point;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class BorderLayoutTest {
	//窗口
	private JFrame frame;
	//panle面板
	private JPanel panel;
	//构造函数中构造窗口！
	public BorderLayoutTest(){
		//学习如何初始化一个窗口！
		//1构造函数
		frame = new JFrame("我的小窗口");
		//2 设置大小
		frame.setSize(300,400);//两种方式都可以。宽300，长400
        //窗口显示的初始位置
		frame.setLocation(200, 100);//x,y 
		//使用默认退出行为
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//-----------------------------------------------------frame
		//初始化panel 默认布局流式Flow
		panel = new JPanel();//此是显示的写出来了！
		panel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
		panel.setLayout(new BorderLayout(10,10));//使用BorderLayout布局管理器
		//panel.add(new JButton("肉"),BorderLayout.EAST);
		panel.add(new JButton("菜"),BorderLayout.WEST);
		panel.add(new JButton("米"));//默认是BorderLayout.CENTER
		panel.add(new JButton("汤"),BorderLayout.SOUTH);
		panel.add(new JButton("果"),BorderLayout.NORTH);
		
		//将panel放到frame中
		frame.add(panel);

		
		//------------------------------------------------------显示窗口
		frame.setVisible(true);			
		
	}
	public static void main(String[] args){
		new BorderLayoutTest();//显示窗口
	}
	
}
