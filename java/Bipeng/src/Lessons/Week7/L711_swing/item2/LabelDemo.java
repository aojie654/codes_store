package Lessons.Week7.L711_swing.item2;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
//作业ui设计3选1
//1 开发一个聊天室界面！最好是Chat绑定 
//2 开发一个计算器界面。 GridBagLayout
//3 开发一个记事本页面！学习菜单栏的如何开发
public class LabelDemo extends JFrame{
	
	
	JLabel l1,l2,l3;
	JTextField  t1,t2 ,t3;
	JTextArea ta;
	JButton b1,b2;
	public LabelDemo(){
	
		l1 = new JLabel("你好啊");
		
		l2 = new JLabel(new ImageIcon("images//logo.png"));
		l3 = new JLabel("早饭吃了没");
		l3.setForeground(Color.BLUE);
		
		t1 = new JTextField(10);
		t2 = new JTextField(10);
		t3 = new JTextField(10);
		ta = new JTextArea(2,20);
		
		b1 =new JButton("按钮1");
		b2 =new JButton("按钮2");
		
		this.setLayout(new FlowLayout());
		this.add(l1);
		this.add(l2);
		this.add(l3);
		this.add(t1);
		this.add(t2);
		this.add(t3);
		this.add(ta);
		this.add(b1);
		this.add(b2);
		this.setTitle("标签");//设置窗口名字！
		this.setSize(300, 300);
		this.setLocation(100, 100);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		
		b1.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String str="t1:"+t1.getText()+
						" t2:"+t2.getText()+" t3:"+t3.getText();
				ta.setText(ta.getText()+str);
			}
		});
		
		b2.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				JOptionPane.showMessageDialog(
						b2, "刚才你点击了按钮2", "消息", JOptionPane.INFORMATION_MESSAGE);
		}});
	}
	
	
	
	public static void main(String[] args){
		new LabelDemo();
	}
}
