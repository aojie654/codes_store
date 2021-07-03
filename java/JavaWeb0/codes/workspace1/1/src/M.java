import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class M extends JFrame {

	public M() {
		// 设置大小
		setSize(600, 300);
		// 设置坐标位置
		setLocation(300, 200);
		// 创建菜单栏
		JMenuBar bar = new JMenuBar();
		// 创建菜单
		JMenu m1 = new JMenu("文件");
		JMenu m2 = new JMenu("编辑");
		JMenu m3 = new JMenu("格式");
		JMenu m4 = new JMenu("帮助");
		JMenu m5 = new JMenu("版本");
		// 将菜单添加到菜单栏中
		bar.add(m1);
		bar.add(m2);
		bar.add(m3);
		bar.add(m4);
		bar.add(m5);
		// 创建菜单项
		JMenuItem i1 = new JMenuItem("打招呼");
		JMenuItem i2 = new JMenuItem("退出");
		JMenuItem i3 = new JMenuItem("红色");
		JMenuItem i4 = new JMenuItem("蓝色");
		JMenuItem i5 = new JMenuItem("白色");
		// 将菜单项，添加到菜单当中
		m1.add(i1);
		m1.add(i2);
		m2.add(i3);
		m2.add(i4);
		m2.add(i5);
		// 将菜单栏添加到窗体中
		getContentPane().add(bar, BorderLayout.NORTH);
		// 创建一个文本域
		final JTextArea a1 = new JTextArea();
		// 将文本域添加到窗体中
		getContentPane().add(a1);
		// 添加i1的监听事件
		i1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(getContentPane(), a1.getText());
			}
		});
		i2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		i3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				a1.setBackground(Color.PINK);
			}
		});
		i4.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				a1.setBackground(Color.CYAN);
			}
		});
		i5.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				a1.setBackground(Color.WHITE);
			}
		});

		// 设置显示
		setVisible(true);
	}

	public static void main(String[] args) {
		new M();
	}

}
