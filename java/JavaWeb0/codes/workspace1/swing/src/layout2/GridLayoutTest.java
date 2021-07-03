package layout2;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class GridLayoutTest {
	//窗口
	private JFrame frame;
	//panle面板
	private JPanel panel;
	//构造函数中构造窗口！
	public GridLayoutTest(){
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
		panel.setLayout(new GridLayout(3,2,15,15));//使用BorderLayout布局管理器
		
		JButton b1 =new JButton("肉");
		b1.addActionListener(new ButtonListener());
		panel.add(b1);
		panel.add(new JButton("菜"));
		panel.add(new JButton("米"));//默认是BorderLayout.CENTER
		panel.add(new JButton("汤"));
		panel.add(new JButton("果"));
		panel.add(new JButton("盐"));
		
		//将panel放到frame中
		frame.add(panel);

		
		//------------------------------------------------------显示窗口
		frame.setVisible(true);			
		
	}
	class ButtonListener implements ActionListener {
		// 重写ActionListener接口中的事件处理方法actionPerformed()
		public void actionPerformed(ActionEvent e) {
			JOptionPane.showMessageDialog(null, "二斤牛肉 ", "肉 ", JOptionPane.INFORMATION_MESSAGE);
		}
	}
	public static void main(String[] args){
		new GridLayoutTest();//显示窗口
	}
	
}
