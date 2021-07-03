package event1;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ChangeColor {

	private JButton b1,b2,b3;
	private JPanel p1;
	private JFrame f1;
	
	public ChangeColor(){
		b1 = new JButton("红色");
		b2 = new JButton("绿色");
		b3 = new JButton("蓝色");
		
		p1 = new JPanel();
		f1 = new JFrame("颜色窗口");
		
		//b1注册一个匿名监听器
		b1.addActionListener(new ActionListener(){
			//重载ActionListener对象的 actionPerformed方法
			//处理方法！
			public void actionPerformed(ActionEvent e){
				p1.setBackground(Color.RED);//面板p1背景色边红
				
			}
		});//b2注册一个匿名监听器
		b2.addActionListener(new ActionListener(){
			//重载ActionListener对象的 actionPerformed方法
			//处理方法！
			public void actionPerformed(ActionEvent e){
				p1.setBackground(Color.GREEN);
			}
		});//b3注册一个匿名监听器 
		b3.addActionListener(new ActionListener(){
			//重载ActionListener对象的 actionPerformed方法
			//处理方法！
			public void actionPerformed(ActionEvent e){
				p1.setBackground(Color.YELLOW);
			}
		});
		
		p1.add(b1);
		p1.add(b2);
		p1.add(b3);
		f1.add(p1);
		f1.setSize(500,600);
		f1.setLocation(300,300);
		f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f1.setVisible(true);
	}
	

	public static void main(String[] args) {
		new ChangeColor();
	}

}
