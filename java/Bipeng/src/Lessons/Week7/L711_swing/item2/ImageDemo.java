package Lessons.Week7.L711_swing.item2;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ImageDemo extends JFrame{
	ImageIcon icon,icon2;
	
	public ImageDemo(){
		icon = new ImageIcon("images//logo.png");
		this.setIconImage(icon.getImage());
		this.setTitle("图片");//设置窗口名字！
		this.setSize(300, 300);
		this.setLocation(100, 100);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	
	public void paint(Graphics g){
		icon2 = new ImageIcon("images//books.jpg");
		JPanel p = new JPanel();
		JButton  b = new JButton(new ImageIcon("images//qst.png"));
		g.drawImage(icon2.getImage(), 0, 50, p);
		this.setLayout(null);
		
		b.setBounds(100, 100, 100, 100);//按钮照片！最好能够适应button
		this.add(p);
		this.add(b);
		g.setColor(Color.BLUE);
		g.drawString("java高级编程", 100, 100);
	}
	
	public static void main(String[] args){
		new ImageDemo();
	}
}
