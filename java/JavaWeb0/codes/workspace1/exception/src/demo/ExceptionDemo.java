package demo;

public class ExceptionDemo {
	//JVM 调用main 。异常抛出给jvm jvm如何处理？打印异常堆栈信息。e.printStackTrace();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hello everyone!");
		
		System.out.println("lets play basketball!");
		int score =0;
		try{
		//1 投篮1！
		int a=0,b=1;
		int c=b/a;//RuntimeException 可处理可不处理！
	
		//如果你是一个优秀的程序员，你的代码是不会抛出runtimeexception的！所以不需要一定处理！
		}catch(ArithmeticException e){//算术异常！
			System.out.println("投进了！加2分");
			score +=2;
		}finally{
			System.out.println("投球一次！");
		}
		
		try{//试一试可能会抛出异常！
			//1 投篮2！
			int n= Integer.parseInt("abc");
			
		}catch(NumberFormatException e){//接住异常，能不能接住和抛到异常类型一致才可以接住！算术异常！
			System.out.println("投进了！加2分");
			score +=2;
		}finally{//无论是否出现异常，finally都会执行。finally 可以不写。
			System.out.println("投球一次！");
		}
		
		System.out.println("总分是"+score);
	}

}
