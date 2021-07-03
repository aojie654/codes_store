package event1;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ChangeColor2 extends JFrame {
	JPanel p;
	JButton btnRed, btnGreen, btnYellow;

	public ChangeColor2() {
		super("事件测试-改变颜色");

		// 创建组件
		p = new JPanel();
		btnRed = new JButton("红色");
		btnGreen = new JButton("绿色");
		btnYellow = new JButton("黄色");

		//2. 创建一个监听对象
		Button1Listener btn1Listener = new Button1Listener();
		Button2Listener btn2Listener = new Button2Listener();
		Button3Listener btn3Listener = new Button3Listener();

		//3. 注册监听
		btnRed.addActionListener(btn1Listener);
		btnGreen.addActionListener(btn2Listener);
		btnYellow.addActionListener(btn3Listener);

		// 将按钮添加到面板中
		p.add(btnRed);
		p.add(btnGreen);
		p.add(btnYellow);

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

	// 1. 创建扩展ActionListener的监听类
	// 该监听类是一个内部类，以便可以直接对外部类中的资源进行访问
	class Button1Listener implements ActionListener {
		// 重写ActionListener接口中的事件处理方法actionPerformed()
		public void actionPerformed(ActionEvent e) {
		// 设置面板的背景颜色是红色Color.red
		p.setBackground(Color.red);	
		}
	}
	
	class Button2Listener implements ActionListener {
		// 重写ActionListener接口中的事件处理方法actionPerformed()
		public void actionPerformed(ActionEvent e) {
		// 设置面板的背景颜色是红色Color.red
		p.setBackground(Color.GREEN);
		}
	}
	class Button3Listener implements ActionListener {
		// 重写ActionListener接口中的事件处理方法actionPerformed()
		public void actionPerformed(ActionEvent e) {
		// 设置面板的背景颜色是黄色Color.yellow
		p.setBackground(Color.yellow);

		}
	}

	public static void main(String[] args) {
		new ChangeColor();
	}
}
