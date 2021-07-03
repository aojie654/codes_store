package Lessons.Week7.L711_swing.item;

import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;


public class RadioCheckDemo  extends JFrame {
	private JPanel p1, p2;
	private JLabel lblSex, lblLike;
	private JRadioButton rbMale, rbFemale;
	private ButtonGroup bg;
	private JCheckBox ckbRead, ckbNet, ckbSwim, ckbTour;
	public RadioCheckDemo() {
		super("��ѡ�͸�ѡ");
		this.setLayout(new GridLayout(2, 1));
		
		p1 = new JPanel(new FlowLayout(FlowLayout.LEFT));
		p2=new JPanel(new FlowLayout(FlowLayout.LEFT));
		
		lblSex = new JLabel("�Ա�:");
		lblLike = new JLabel("����:");
		// ������ѡ��ť
		rbMale = new JRadioButton("��", true);
		rbFemale = new JRadioButton("Ů");
		// ������ť��
		bg = new ButtonGroup();
		// ��rb1��rb2������ѡ��ť��ӵ���ť����,��������ѡ��ťֻ��ѡ����һ
		bg.add(rbMale);
		bg.add(rbFemale);
		// ������ѡ��
		ckbRead = new JCheckBox("�Ķ�");
		ckbNet = new JCheckBox("����");
		ckbSwim = new JCheckBox("��Ӿ");
		ckbTour = new JCheckBox("����");
	
		// �Ա���ص������ӵ�p1�������
		p1.add(lblSex);
		p1.add(rbMale);
		p1.add(rbFemale);
		this.add(p1);
		
		// ������ص������ӵ�p2�������
		p2.add(lblLike);
		p2.add(ckbRead);
		p2.add(ckbNet);
		p2.add(ckbSwim);
		p2.add(ckbTour);
		this.add(p2);		
		
		// �趨���ڴ�С
		this.setSize(300, 100);
		// �趨�������Ͻ�����
		this.setLocation(200, 100);
		// �趨����Ĭ�Ϲرշ�ʽΪ�˳�Ӧ�ó���
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// ���ô��ڿ��ӣ���ʾ��
		this.setVisible(true);
	}
	public static void main(String[] args) {
		new RadioCheckDemo();
	}
}
