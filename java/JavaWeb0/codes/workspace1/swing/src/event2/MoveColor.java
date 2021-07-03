package event2;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MoveColor {

	//Frame Panel Button
	
	JFrame f;
	public JPanel p;
	JButton b1,b2,b3;
	
	//构造函数没有返回值！
	public MoveColor(){
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
		addListener();
	}
	public static void main(String[] args){
		new MoveColor();
	}
	//添加监听器
	public void addListener(){
		this.b1.addActionListener(new b1Listener() );//给b1注册监听器
		this.b2.addActionListener(new b2Listener() );//给b2注册监听器
		this.b3.addActionListener(new b3Listener() );//给b3注册监听器
		this.b1.addKeyListener(new MoveListener());
		this.b2.addKeyListener(new MoveListener());
		this.b3.addKeyListener(new MoveListener());
	}
	//内部类 构造监听器！实现接口
	class b1Listener implements ActionListener{
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		p.setBackground(Color.RED);
	}
	}
	class b2Listener implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			p.setBackground(Color.GREEN);
		}
	}
	class b3Listener implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			p.setBackground(Color.YELLOW);
		}
	}
	
	class Move2Listener extends KeyAdapter{
		public void keyPressed(KeyEvent e) {
			
		}
	}
	class MoveListener implements KeyListener{
		@Override  //this.b1.addKeyListener(new MoveListener());
		public void keyTyped(KeyEvent e) {//
		}
		@Override //当键盘按下去后
		public void keyPressed(KeyEvent e) {
			int key =e.getKeyCode();//得到按键号码
			Object o= e.getSource();
			int x =((JButton)o).getX();
			int y =((JButton)o).getY();
			if(key==KeyEvent.VK_LEFT){//如果是向左
				((JButton)o).setLocation(x-5, y);//按钮绘制到左
			}
			if(key==KeyEvent.VK_RIGHT){
				((JButton)o).setLocation(x+5, y);//按钮绘制到右				
			}
			if(key==KeyEvent.VK_UP){
				((JButton)o).setLocation(x, y-5);
			}
			if(key==KeyEvent.VK_DOWN){
				((JButton)o).setLocation(x, y+5);
			}
		}
		@Override
		public void keyReleased(KeyEvent e) {
		}
	}
}