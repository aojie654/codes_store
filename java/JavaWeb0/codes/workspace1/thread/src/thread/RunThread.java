package thread;
//方法1 。实现Runnable接口
public class RunThread implements Runnable{

	
	//定义好一个线程后，让线程运行起来！
	public static void main(String[] args) {
		//定义一个线程！Thread类的实例，
		//将实现了Runnable接口的本类实例作为参数传入！
		Thread thread1 = new Thread(new RunThread());
		thread1.start();//活了！执行run方法！能够作为线程自己运行了！
		for(int i=0;i<100;i++){
			System.out.println("Main method :"+ i);
		}
	}

	@Override
	public void run() {
	//线程的工作任务全在run方法中！
		//计算1+2+3加到100
		int sum =0;
		for(int i=1;i<=100;i++){
			sum = sum+i;
			System.out.println("thread run: sum"+i+"="+sum);
		}
	}

}
