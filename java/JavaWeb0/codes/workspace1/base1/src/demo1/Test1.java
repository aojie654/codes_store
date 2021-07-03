package demo1;

import demo2.Cat;
             //类
public class Test1 extends Cat {
	//non static方法属于实体对象 Test1类的对象比如t1
	/*public void  shout(){
		System.out.println("喵~");
		
	}*/
	
	
	public static void main(String[] args){
		//t1是对象
		Test1 t1 = new Test1();
		//t1.shout();
		Cat cat1 =new Cat();

	}
	//考试的时候会考！
	/*public class Test2 {//内部类。一般定义内部类只能被外层类使用。

	}*/
	
}
