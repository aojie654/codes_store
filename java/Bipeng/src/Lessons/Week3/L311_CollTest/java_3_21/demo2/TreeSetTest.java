package Lessons.Week3.L311_CollTest.java_3_21.demo2;

import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<Integer> tree =new TreeSet<>();
		tree.add(10);//�Զ�װ�䣡10-��Integer
		tree.add(8);
		tree.add(12);
		tree.add(14);
		tree.add(17);
		tree.add(20);
		tree.add(5);
		System.out.println(tree.ceiling(7));//�컨�巽����
		System.out.println(tree.floor(11));//�ذ�
		System.out.println(tree.first());//��С��
		System.out.println("last"+tree.last());//;
		System.out.println("lower:"+tree.lower(20));
		//treeSet������ʵ���˶����ֵ���Ȼ���������С����
		for(Integer i :tree){
			System.out.println(i);
		}
		
		System.out.println("------------------");
		SortedSet<Integer> sort=tree.headSet(10);//head ������10 ��10С
		for(Integer i :sort){
			System.out.println(i);
		}

		System.out.println("------------------");
		sort=tree.tailSet(10);//tail ����10 ��10��
		for(Integer i :sort){
			System.out.println(i);
		}
		
	}

}
