package demo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

public class CollTest2 {
	//��������ֻ�ܷ�����ʵ�����󡣲��ܷŻ������͡�int 
	private static Collection coll;
	public static void main(String[] args) {
		//���岢��ʼ��Collection �����
		coll =new HashSet();
		//Set �ص��ǲ��ܷ��ظ��Ķ��������ܱ���˳��
		//����ˮ��
		coll.add("����");//�Զ�װ����̡�
		coll.add(new String("ƻ��"));
		coll.add("����");
		coll.add("������");
		coll.add("����");
		coll.add("����");
		coll.add("����");//Set�в�������ͬ�Ķ�������������
		//coll.add(12);//�Զ�װ�䡣int->Integer
		//���˵���Զ�ĵط���
		coll=move("����");
		//ȡ������ʹ�õ�����ȡ������һ��ȡ�����ķ���
		Iterator  iterator =coll.iterator();
		while(iterator.hasNext()){//һ��һ��������
			String str = (String)iterator.next();
			System.out.println(str);
		}
		//ƻ�� -������ -������ -������ -������ -��������
		//���ݽ����֪��Set �ص��ǲ��ܷ��ظ��Ķ��������ܱ���˳��
		
	}
	public static Collection move(String difang){
		System.out.println("�����Ӱᵽ��"+difang);
		return coll;
	}

}