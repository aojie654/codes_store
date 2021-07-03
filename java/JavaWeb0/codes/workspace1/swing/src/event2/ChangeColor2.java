package event2;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ChangeColor2 {

	//Frame Panel Button
	
	JFrame f;
	public JPanel p;
	JButton b1,b2,b3;
	
	//构造函数没有返回值！
	public ChangeColor2(){
		b1 = new JButton("红色");
		b2 = new JButton("绿色");
		b3 = new JButton("黄色");
		p = new JPanel();
		f = new JFrame("窗口");
		p.add(b1);
		p.add(b2);
		p.add(b3);
		f.add(p);
		f.setSize(200, 300);
		f.setLocation(50, 200);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);//初始化好后，显示窗口！
		//给组件添加上监听器 
		b1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				p.setBackground(Color.red);
			}});
		b2.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				p.setBackground(Color.green);
			}});
		b3.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				p.setBackground(Color.YELLOW);
			}});
	}
	public static void main(String[] args){
		new ChangeColor2();
	}
	
}