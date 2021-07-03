package thread2;
//线程实现两种方式1 
//让定义的类实现Runnable接口
public class RunThread implements Runnable{
     
	public static void main(String[] args) {
		//实例化线程！ 并让线程运行起来！
		//实例化Thread类对象，调用构造函数，并将实现了Runnable接口的
		//本类作为参数传递进Thread构造函数！
		Thread thread = new Thread(new RunThread());
		//thread.run();//简单的执行run方法而已！
		thread.start();//让线程运行起来，执行run方法！
		String name = Thread.currentThread().getName();//得到当前线程也就是main线程名字
		long id = Thread.currentThread().getId();//得到当前线程也就是main线程id
		for(int i=0;i<=1000;i++){
			System.out.println("id:"+id+" name:"+name+" main i:"+i );
		}	
	}
	
	@Override
	public void run() {
		//线程执行的具体方法！它的主要任务都在里面。
		String name = Thread.currentThread().getName();//得到当前线程实例名字
		long id = Thread.currentThread().getId();//得到当前线程实例id
		int sum = 0;
		
		for(int i=0;i<=1000;i++){
			sum = sum + i;
			System.out.println("id:"+id+" name:"+name+" thread sum : i:"+i+" "+sum);
		}
		
	}

}
