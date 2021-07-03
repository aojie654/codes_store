package item1;

import java.awt.Graphics;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class ImageDemo extends JFrame{
	private ImageIcon icon,icon2;//图标
	public ImageDemo(){
		
		super("图标");
		icon = new ImageIcon("images\\logo.png");
		this.setIconImage(icon.getImage());//设置窗口照片
		this.setSize(400, 400);
		
		this.setLocation(200, 200);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	//重载JFrame中的paint方法。重画frame中的内容
	public void paint(Graphics g){
		icon2 = new ImageIcon("images\\books.jpg");
		g.drawImage(icon2.getImage(), 50, 50, this);
		g.drawLine(0, 0, 100, 100);
		g.drawString("java高级编程", 100, 100);
		g.draw3DRect(150, 150, 50, 50, false);
	}
	public static void main(String[] args){
		new ImageDemo();
	}
	
}
