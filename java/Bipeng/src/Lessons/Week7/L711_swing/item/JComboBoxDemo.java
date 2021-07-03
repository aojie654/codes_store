package Lessons.Week7.L711_swing.item;

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
		super("��Ͽ�����");
		p = new JPanel();

		lblProvince = new JLabel("ʡ��");
		lblCity = new JLabel("����");

		// ������Ͽ򣬲�ʹ���ַ��������ʼ����ѡ���б�
		cmbProvince = new JComboBox(new String[] { "����", "�Ϻ�", "ɽ��", "����" });
		// ����һ��û��ѡ�����Ͽ�
		cmbCity = new JComboBox();

		// ע�����
		cmbProvince.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				// ��ȡ�û�ѡ�е�ѡ���±�
				int i = cmbProvince.getSelectedIndex();
				// �����Ͽ��е�ѡ��
				cmbCity.removeAllItems();
				// �����û�ѡ��Ĳ�ͬʡ�ݣ���Ͽ�����Ӳ�ͬ�ĳ���
				switch (i) {
				case 0:
					cmbCity.addItem("����");
					break;
				case 1:
					cmbCity.addItem("�Ϻ�");
					break;
				case 2:
					cmbCity.addItem("����");
					cmbCity.addItem("�ൺ");
					cmbCity.addItem("��̨");
					cmbCity.addItem("Ϋ��");
					cmbCity.addItem("����");
					break;
				case 3:
					cmbCity.addItem("�Ϸ�");
					cmbCity.addItem("�ߺ�");
					cmbCity.addItem("����");
					cmbCity.addItem("����");
					break;
				}
			}
		});

		p.add(lblProvince);
		p.add(cmbProvince);
		p.add(lblCity);
		p.add(cmbCity);

		// �������ӵ�������
		this.add(p);

		// �趨���ڴ�С
		this.setSize(300, 200);
		// �趨�������Ͻ�����
		this.setLocation(200, 100);
		// �趨����Ĭ�Ϲرշ�ʽΪ�˳�Ӧ�ó���
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// ���ô��ڿ��ӣ���ʾ��
		this.setVisible(true);
	}

	public static void main(String[] args) {
		new JComboBoxDemo();
	}
}
