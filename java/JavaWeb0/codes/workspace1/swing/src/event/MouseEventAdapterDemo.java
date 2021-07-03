package event;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class MouseEventAdapterDemo extends JFrame {
	private JPanel p;
	// 鼠标上一次的坐标
	int pre_x = -1, pre_y = -1;
	// 鼠标当前坐标
	int x, y;

	public MouseEventAdapterDemo() {
		super("画板");
		p = new JPanel();
		// 注册鼠标监听
		p.addMouseMotionListener(new PaintListener());
		p.addMouseListener(new ResetListenter());

		// 将面板添加到窗体中
		this.add(p);

		// 设定窗口大小
		this.setSize(400, 300);
		// 设定窗口左上角坐标
		this.setLocation(200, 100);
		// 设定窗口默认关闭方式为退出应用程序
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// 设置窗口可视（显示）
		this.setVisible(true);
	}

	// 重写JFrame的paint()方法，此方法用于在窗体中画图
	public void paint(Graphics g) {
		// 设置画笔的颜色
		g.setColor(Color.red);
		// 历史坐标>0
		if (pre_x > 0 && pre_y > 0) {
			// 绘制一条线段，从上一次鼠标拖动事件点到本次鼠标拖动事件点
			g.drawLine(pre_x, pre_y, x, y);
		}
		// 保存当前鼠标坐标，称为上一次的历史坐标
		pre_x = x;
		pre_y = y;
	}

	// 定义鼠标拖动监听类
	class PaintListener extends MouseMotionAdapter{
		// 鼠标拖动的处理方法，负责画画工作
		public void mouseDragged(MouseEvent e) {
			// 获取鼠标当前的坐标
			x = e.getX();
			y = e.getY();
			// 重画，repaint()触发paint()
			MouseEventAdapterDemo.this.repaint();
		}
	}

	// 定义鼠标监听类
	class ResetListenter extends MouseAdapter {
		// 鼠标按下事件处理
		public void mousePressed(MouseEvent e) {
			// 获取鼠标按键，判断是否是右键
			if (e.getButton() == MouseEvent.BUTTON3) {
				// 重画面板（擦除原来的轨迹）
				MouseEventAdapterDemo.this.p.repaint();
			}
		}

		// 鼠标松开事件处理，重置历史坐标
		public void mouseReleased(MouseEvent e) {
			// 鼠标松开时，将历史坐标重设为-1（重置）
			pre_x = -1;
			pre_y = -1;
		}
	}

	public static void main(String[] args) {
		new MouseEventAdapterDemo();
	}
}
