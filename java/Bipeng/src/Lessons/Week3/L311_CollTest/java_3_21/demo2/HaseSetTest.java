package Lessons.Week3.L311_CollTest.java_3_21.demo2;

import java.util.HashSet;
import java.util.Set;

public class HaseSetTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a1 = new A();
		A a2 = new A();
		Set<A> set = new HashSet<>();
		set.add(a1);
		set.add(a2);//a2��a1��ȣ�����û�Ž�ȥ��
		
		for(A a:set){
			System.out.println(a);
		}
		
		B b1 = new B();
		B b2 = new B();
		Set<B> set1 = new HashSet<>();
		set1.add(b1);
		set1.add(b2);//b1��b2����ȣ��浽ͬһ��λ�ã�
		//���λ�ó�ͻ����ô�������������ӣ�
		
		for(B b:set1){
			System.out.println(b);
		}
		
		C c1 = new C();
		C c2 = new C();
		Set<C> set2 = new HashSet<>();
		set2.add(c1);
		set2.add(c2);//c1��c2��ȣ���hashcode��ͬ��
		
		for(C c:set2){
			System.out.println(c);
		}
		
		
	}

}

class C{

	public boolean equals(Object B){
		return true;
	}
}

class B{
	public int hashCode(){
		return 1001;
	}
	
	public boolean equals(Object B){
		return false;
	}
}
//����Լ������������Ҫ�õ�Set���Ͻ��й���Ҫ���Ǻ�hashCode������equals��������ơ�
class A{
	public int hashCode(){
		return 1001;
	}
	
	public boolean equals(Object A){
		return true;
	}
}