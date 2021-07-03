package event;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ChangeColor extends JFrame {
	JPanel p;
	JButton btnRed, btnGreen, btnYellow;

	public ChangeColor() {
		super("事件测试-改变颜色");

		// 创建组件
		p = new JPanel();
		btnRed = new JButton("红色");
		btnGreen = new JButton("绿色");
		btnYellow = new JButton("黄色");

		//2. 创建一个监听对象
		ButtonListener btnListener = new ButtonListener();

		//3. 注册监听
		btnRed.addActionListener(btnListener);
		btnGreen.addActionListener(btnListener);
		btnYellow.addActionListener(btnListener);

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
	class ButtonListener implements ActionListener {
		// 重写ActionListener接口中的事件处理方法actionPerformed()
		public void actionPerformed(ActionEvent e) {
			// 获取事件源
			Object source = e.getSource();
			// 判断事件源，进行相应的处理
			if (source == btnRed) {
				// 设置面板的背景颜色是红色Color.red
				p.setBackground(Color.red);
			} else if (source == btnGreen) {
				// 设置面板的背景颜色是绿色Color.green
				p.setBackground(Color.green);
			} else {
				// 设置面板的背景颜色是黄色Color.yellow
				p.setBackground(Color.yellow);
			}
		}
	}

	public static void main(String[] args) {
		new ChangeColor();
	}
}
