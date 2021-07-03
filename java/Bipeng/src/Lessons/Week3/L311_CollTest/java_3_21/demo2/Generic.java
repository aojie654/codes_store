package Lessons.Week3.L311_CollTest.java_3_21.demo2;

import java.util.Date;

public class Generic {

	//���Ϳ��Զ����ڷ����ϣ� show�����������κ�����в�����
	public <T>  void show(T t){
		System.out.println(t.getClass().toString());
	}
	//���ͷ��������ж��������T V ���ֲ�ͬ���͡�����ʱ����������֮���ö��Ÿ�����
	public <T,V,E>  void showAll(T t,V v ){
		//E e1=new E(); ���Ͳ�����ʵ������ Ҳ������ʹ�����飡
		//System.out.println(e1.getClass().toString());
		System.out.println(t.getClass().toString());
		System.out.println(v.getClass().toString());
	}
	
	//�˷����Ƿ��ͷ���������ʹ���ַ�����Ϊ������
	public void showNormal(String str){
		System.out.println(str.getClass().toString());
	}
	public static void main(String[] args){
		Generic g = new Generic();
		g.show("abc");
		g.show(new Date());
		g.show(123);
		g.showAll("aaa", "bbb");
		g.showAll("aaa", 345);
		//g.showNormal(123);//��������ַ��������Ƿ��ͷ�����
	}
}
