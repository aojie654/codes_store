package event;

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

		// 使用匿名监听类的方式注册监听
		btnRed.addActionListener(new ActionListener() {
			// 重写ActionListener接口中的事件处理方法actionPerformed()
			public void actionPerformed(ActionEvent e) {
				// 设置面板的背景颜色是红色Color.red
				p.setBackground(Color.red);
			}
		});

		btnGreen.addActionListener(new ActionListener() {
			// 重写ActionListener接口中的事件处理方法actionPerformed()
			public void actionPerformed(ActionEvent e) {
				// 设置面板的背景颜色是绿色Color.green
				p.setBackground(Color.green);
			}
		});

		btnYellow.addActionListener(new ActionListener() {
			// 重写ActionListener接口中的事件处理方法actionPerformed()
			public void actionPerformed(ActionEvent e) {
				// 设置面板的背景颜色是黄色Color.yellow
				p.setBackground(Color.yellow);
			}
		});

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

	public static void main(String[] args) {
		new ChangeColor2();
	}
}
