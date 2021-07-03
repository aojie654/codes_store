package Lessons.Week7.L711_swing.item;

import java.awt.GridLayout;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class JLabelDemo extends JFrame {
	// �������
	private JPanel p;
	private JLabel lblTxt, lblImg, lblTxtImg;

	public JLabelDemo() {
		super("JLabel��");

		// ʵ����������p����岼�������񲼾֣�3��1�У�
		p = new JPanel(new GridLayout(3, 1));

		// ʵ����һ����ǩ������ʾ����
		lblTxt = new JLabel("����һ���ı���ǩ");
		// ʵ����һ����ǩ������ʾͼ��
		lblImg = new JLabel(new ImageIcon("images\\logo.png"));
		// ʵ����һ����ǩ������ʾ�ı��ͱ�ǩ
		lblTxtImg = new JLabel("�̱�", new ImageIcon("images\\logo.png"),
				SwingConstants.CENTER);

		// ����ť��ӵ������
		p.add(lblTxt);
		p.add(lblImg);
		p.add(lblTxtImg);

		// �������ӵ�������
		this.add(p);

		// �趨���ڴ�С
		this.setSize(400, 300);
		// �趨�������Ͻ�����
		this.setLocation(200, 100);
		// �趨����Ĭ�Ϲرշ�ʽΪ�˳�Ӧ�ó���
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// ���ô��ڿ��ӣ���ʾ��
		this.setVisible(true);
	}

	public static void main(String[] args) {
		new JLabelDemo();
	}
}