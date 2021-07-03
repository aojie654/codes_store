package item;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class JComboBoxDemo extends JFrame {
	private JPanel p;
	private JLabel lblProvince, lblCity;
	private JComboBox cmbProvince, cmbCity;

	public JComboBoxDemo() {
		super("组合框联动");
		p = new JPanel();

		lblProvince = new JLabel("省份");
		lblCity = new JLabel("城市");

		// 创建组合框，并使用字符串数组初始化其选项列表
		cmbProvince = new JComboBox(new String[] { "北京", "上海", "山东", "安徽" });
		// 创建一个没有选项的组合框
		cmbCity = new JComboBox();

		// 注册监听
		cmbProvince.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				// 获取用户选中的选项下标
				int i = cmbProvince.getSelectedIndex();
				// 清空组合框中的选项
				cmbCity.removeAllItems();
				// 根据用户选择的不同省份，组合框中添加不同的城市
				switch (i) {
				case 0:
					cmbCity.addItem("北京");
					break;
				case 1:
					cmbCity.addItem("上海");
					break;
				case 2:
					cmbCity.addItem("济南");
					cmbCity.addItem("青岛");
					cmbCity.addItem("烟台");
					cmbCity.addItem("潍坊");
					cmbCity.addItem("威海");
					break;
				case 3:
					cmbCity.addItem("合肥");
					cmbCity.addItem("芜湖");
					cmbCity.addItem("淮北");
					cmbCity.addItem("蚌埠");
					break;
				}
			}
		});

		p.add(lblProvince);
		p.add(cmbProvince);
		p.add(lblCity);
		p.add(cmbCity);

		// 将面板添加到窗体中
		this.add(p);

		// 设定窗口大小
		this.setSize(300, 200);
		// 设定窗口左上角坐标
		this.setLocation(200, 100);
		// 设定窗口默认关闭方式为退出应用程序
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// 设置窗口可视（显示）
		this.setVisible(true);
	}

	public static void main(String[] args) {
		new JComboBoxDemo();
	}
}
