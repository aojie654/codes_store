package event1;

import java.awt.GridLayout;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
// mouse 鼠标的响应！
public class KeyMove {
	JPanel p;
	JButton btn;
	JFrame f;
	JTextArea ta;
	//MoveCar写在 KeyMove类中。是个内部类。实现对keyListener的监听 
	class MoveCar implements KeyListener{
		@Override
		public void keyTyped(KeyEvent e) {
			
		}
		@Override
		public void keyPressed(KeyEvent e) {
			// 获取按下键盘的码值		
			int key = e.getKeyCode();
			// 获得按钮当前的x,y轴坐标
			int x = btn.getX();
			int y = btn.getY();
			
			if (key == KeyEvent.VK_RIGHT) {
				// 向右，x轴坐标增加
				btn.setLocation(x + 5, y);
				ta.setText(ta.getText()+"1");
			} else if (key == KeyEvent.VK_LEFT) {
				// 向右，x轴坐标减少
				btn.setLocation(x - 5, y);
				ta.setText(ta.getText()+"2");
			} else if (key == KeyEvent.VK_UP) {
				// 向右，x轴坐标减少
				btn.setLocation(x, y-5);
				ta.setText(ta.getText()+"3");
			} else if (key == KeyEvent.VK_DOWN) {
				// 向右，x轴坐标减少
				btn.setLocation(x, y+5);
				ta.setText(ta.getText()+"4");
			} 
		}
		@Override
		public void keyReleased(KeyEvent e) {
			// TODO Auto-generated method stub	
		}
	}
	//构造函数没有返回值！且与类名一样。
	public KeyMove(){
		//可以移动的button
		ta = new JTextArea(5,20);
		
		btn = new JButton("小车");
		JPanel p2 = new JPanel(null);//改成null布局！
		//---------------------------------------------------------------
		btn.addKeyListener(new MoveCar());//给按钮btn注册了MoveCar监听器
		btn.setLocation(100,30 );
		btn.setSize(60, 30);
		//btn.setBounds(x, y, width, height);
		//--------------------------------------------------------------
		p = new JPanel();
		f = new JFrame("移动小车");
		p.setLayout(new GridLayout(2,1));//两行1列
		
		p2.add(btn);
		p.add(p2);//第一行一个
		p.add(ta);//第二行第一个
		f.add(p);	
		f.setSize(500,600);
		f.setLocation(300,300);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
	}	
	public static void main(String[] args){
		new KeyMove();
	}
	
}