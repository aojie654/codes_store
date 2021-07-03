package demo2;

import java.util.HashSet;
import java.util.Set;

public class HaseSetTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a1 = new A();
		A a2 = new A();
		Set<A> set = new HashSet<>();
		set.add(a1);
		set.add(a2);//a2与a1相等！所以没放进去！
		
		for(A a:set){
			System.out.println(a);
		}
		
		B b1 = new B();
		B b2 = new B();
		Set<B> set1 = new HashSet<>();
		set1.add(b1);
		set1.add(b2);//b1与b2不相等！存到同一个位置！
		//如果位置冲突，那么就是用链表连接！
		
		for(B b:set1){
			System.out.println(b);
		}

		C c1 = new C();
		C c2 = new C();
		Set<C> set2 = new HashSet<>();
		set2.add(c1);
		set2.add(c2);//c1与c2相等！但hashcode不同。
		
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
//如果自己开发设计类需要用到Set集合进行管理。要考虑好hashCode方法和equals方法的设计。
class A{
	public int hashCode(){
		return 1001;
	}
	
	public boolean equals(Object A){
		return true;
	}
}