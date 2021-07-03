package event;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class KeyEventDemo extends JFrame {
	private JPanel p;
	private JButton btnMove;

	public KeyEventDemo() {
		super("键盘事件-方向控制");
		// 创建组件
		p = new JPanel();
		btnMove = new JButton("走动");

		// 注册键盘监听
		btnMove.addKeyListener(new MyListener());

		// 将组件添加到面板中
		p.add(btnMove);

		// 将面板添加到窗体中
		this.add(p);

		// 设定窗口大小
		this.setSize(300, 300);
		// 设定窗口左上角坐标
		this.setLocation(200, 100);
		// 设定窗口默认关闭方式为退出应用程序
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// 设置窗口可视（显示）
		this.setVisible(true);
	}

	// 定义一个监听类，实现键盘监听接口KeyListener
	class MyListener implements KeyListener {

		// 敲击键盘的事件处理方法
		public void keyTyped(KeyEvent e) {
		}

		// 键盘按下的事件处理方法
		public void keyPressed(KeyEvent e) {
			// 获取按下键盘的码值		
			int key = e.getKeyCode();
			// 获得按钮当前的x,y轴坐标
			int x = btnMove.getX();
			int y = btnMove.getY();
			if (key == KeyEvent.VK_RIGHT) {
				// 向右，x轴坐标增加
				btnMove.setLocation(x + 5, y);
			} else if (key == KeyEvent.VK_LEFT) {
				// 向右，x轴坐标减少
				btnMove.setLocation(x - 5, y);
			} else if (key == KeyEvent.VK_UP) {
				// 向右，y轴坐标减少
				btnMove.setLocation(x, y - 5);
			} else if (key == KeyEvent.VK_DOWN) {
				// 向右，y轴坐标增加
				btnMove.setLocation(x, y + 5);
			}
		}

		// 键盘松开的事件处理方法
		public void keyReleased(KeyEvent e) {
		}
	}

	public static void main(String[] args) {
		new KeyEventDemo();
	}
}
