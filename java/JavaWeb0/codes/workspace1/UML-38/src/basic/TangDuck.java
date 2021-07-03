package basic;

public class TangDuck extends Duck implements Speak{
	
	public static String name= "唐老鸭";
	@Override
	public void speak() {
		// TODO Auto-generated method stub
		System.out.println("大家好，我是"+name+"，说作业不认真做，人生可以成功！");
	}

}
