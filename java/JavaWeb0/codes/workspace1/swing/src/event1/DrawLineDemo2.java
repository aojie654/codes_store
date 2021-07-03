package event1;

import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;

public class DrawLineDemo2 extends JFrame{
	//将两个点坐标保留
	int x =-1;
	int y = -1;
	int prex=-1;
	int prey=-1;
	public DrawLineDemo2(){
		super("画线");//窗口
		
		this.addMouseListener(new DrawLine());
		
		this.setSize(500, 600);
		this.setLocation(100, 100);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	
	public static void main(String[] args){
		new DrawLineDemo2();
	}
 //重新绘制线条。	
 public void paint(Graphics g){
	 if(prex>0 && prey>0){
		 g.drawLine(prex, prey, x, y);
	 }
 }
 class 	DrawLine extends  MouseAdapter{
	  public void mouseClicked(MouseEvent e) {
		  if (e.getButton() == MouseEvent.BUTTON1) {
				x = e.getX();
				y = e.getY();
			}
			if (e.getButton() == MouseEvent.BUTTON3) {
			x = e.getX();
			y = e.getY();
			DrawLineDemo2.this.repaint();
			}
		  
	  }
	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		//button3 鼠标右键
		
	}
	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		//重新绘制线条

	}
 }
}
