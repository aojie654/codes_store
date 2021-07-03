package event1;

import java.awt.FlowLayout;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class CopyOfKeyMove {
	JPanel p;
	JButton btn;
	JFrame f;
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
				} else if (key == KeyEvent.VK_LEFT) {
					// 向右，x轴坐标减少
					btn.setLocation(x - 5, y);
				} 
			}
			@Override
			public void keyReleased(KeyEvent e) {
				// TODO Auto-generated method stub	
			}
		}
	//构造函数没有返回值！且与类名一样。
	public CopyOfKeyMove(){
		//可以移动的button
		btn = new JButton("小车");
		//---------------------------------------------------------------
		btn.addKeyListener(new MoveCar());//给按钮btn注册了MoveCar监听器
		//--------------------------------------------------------------
		p = new JPanel();
		f = new JFrame("移动小车");
		p.setLayout(new FlowLayout(FlowLayout.LEFT));
		p.add(btn);
		f.add(p);	
		f.setSize(500,600);
		f.setLocation(300,300);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
	}	
	public static void main(String[] args){
		new CopyOfKeyMove();
	}
	
}

