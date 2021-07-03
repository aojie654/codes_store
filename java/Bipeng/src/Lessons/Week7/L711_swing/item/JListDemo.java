package Lessons.Week7.L711_swing.item;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.ListSelectionModel;

public class JListDemo extends JFrame {
	private JPanel p;
	private JList listLeft, listRight;
	private JButton btnOk, btnCancel;
	DefaultListModel model;

	public JListDemo() {
		super("JList�б�");
		this.setLayout(new GridLayout(1, 3));
		// �������
		p = new JPanel(new GridLayout(2, 1));

		// �����б���ʹ��һ���ַ��������ʼ����ѡ���б�
		listLeft = new JList(
				new String[] { "����", "д��", "����", "��ɽ", "�ܲ�", "��Ӿ" });
		// �����б��ѡ��ģʽΪ��ѡ
		listLeft.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		// ����һ���յ��б�
		listRight = new JList();
		// ����һ��Ĭ�ϵ��б�ֵģ��
		model = new DefaultListModel();
		// �����б��ֵģ��
		listRight.setModel(model);

		btnOk = new JButton("����>");
		btnCancel = new JButton("<����");

		// ע�����
		btnOk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// ��ȡ�û�������б���ѡ�е�ѡ��
				String strSelect = listLeft.getSelectedValue().toString();
				// ��ӵ��Ҳ�
				model.addElement(strSelect);
			}
		});
		
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// �Ƴ��û����Ҳ��б�ѡ�е�ѡ��
				model.remove(listRight.getSelectedIndex());
			}
		});

		// �������ӵ�������
		p.add(btnOk);
		p.add(btnCancel);
		this.add(listLeft);
		this.add(p);
		this.add(listRight);
		
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
		new JListDemo();
	}
}
