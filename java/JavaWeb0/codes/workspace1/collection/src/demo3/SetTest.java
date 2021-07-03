package demo3;

import java.util.HashSet;
import java.util.Set;

public class SetTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    //不一样的东西不可以放进去！Set如何判断
		Set set = new HashSet();
		A a1 = new A();
		A a2 = new A();
		set.add(a1);
		set.add(a2);// 当equals方法true和hashcode 相等说明同一个对象
		//遍历set集合，里面有几个A对象a1,a2?
		B b1 = new B();
		B b2 = new B();//hashcode不一样就可以放进去！虽然equals为true
		
		set.add(b1);
		set.add(b2);
		
		C c1 = new C();
		C c2 = new C();//hashcode一样,equals为false ,也可以放入set！
		//如果hashCode一样，出现了冲突！
		//则java 使用链表将新对象进行链接！如果链表过长，则影响性能。
		set.add(c1);
		set.add(c2);
		for(Object o:set){
			System.out.println(o);
		}
	}

}
class A{
	//重载hashCode方法。此方法决定存放的位置！
	public int hashCode(){
		return 1002;
	}
	//重载equals方法。
	public boolean equals(Object obj){
		return true;
	}
}

class B{
	//不重载hashCode方法。
	//重载equals方法。
	public boolean equals(Object obj){
		return true;
	}
}
class C{
	    //重载hashCode方法。此方法决定存放的位置！
		public int hashCode(){
			return 1002;
		}
		//重载equals方法。
		public boolean equals(Object obj){
			return false;
		}
}
