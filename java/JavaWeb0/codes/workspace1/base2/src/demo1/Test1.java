package demo1;

public class Test1 {
    //non-static 方法，调用方式是使用对象实例来调用！
	public  void shout(){	
		System.out.println("汪~");
	}
	
	public static void main(String[] args){
		Test1 t1= new Test1();
		t1.shout();
		Test1 t2= new Test1();
		t2.shout();
		//Test1.shout();
	}

	//内部类！ 考试容易考！
	public class Test2 {
	}
}

