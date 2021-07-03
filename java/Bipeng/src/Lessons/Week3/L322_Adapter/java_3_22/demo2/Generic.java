package Lessons.Week3.L322_Adapter.java_3_22.demo2;

import java.util.Date;

public class Generic {

	//泛型可以定义在方法上！ show方法可以用任何类进行操作！
	public <T>  void show(T t){
		System.out.println(t.getClass().toString());
	}
	//泛型方法可以有多个参数！T V 两种不同类型。声明时，两个类型之间用逗号隔开！
	public <T,V,E>  void showAll(T t,V v ){
		//E e1=new E(); 泛型不可以实例化！ 也不可以使用数组！
		//System.out.println(e1.getClass().toString());
		System.out.println(t.getClass().toString());
		System.out.println(v.getClass().toString());
	}
	
	//此方法非泛型方法，必须使用字符串作为参数！
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
		//g.showNormal(123);//必须放入字符串！不是泛型方法！
	}
}
