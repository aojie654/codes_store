package thread;
//方法2 通过继承Thread类。覆盖run方法实现线程！
public class ThreadDemo extends Thread{

	//run方法中完成线程主要任务！打出100以内的偶数！
	public void run() {
		String name = Thread.currentThread().getName();
		for(int i=0;i<=100;i++){
			if(i%2==0){
				System.out.println(name+" thread run:" +i);
			}
		}
	}
	//主函数中，让线程实例化并运行！
	public static void main(String[] args) throws InterruptedException {
		String name =Thread.currentThread().getName();//名字
		long id =Thread.currentThread().getId();//id
		int pri = Thread.currentThread().getPriority();//优先级
		System.out.println("当前运行的线程是"+name+" id:"+id+" 优先级： "+pri);
		Thread thread1 = new ThreadDemo();
		thread1.setName("线程1");
		thread1.setPriority(1);//优先级最大10 最小1 
		thread1.start();//线程1 运行！
		Thread.sleep(1000);
		///thread1.sleep(5000);//睡上0.1秒。万事休！
		Thread thread2 = new ThreadDemo();
		thread2.setName("线程2");
		thread2.start();//线程2 运行！
		//thread2.start();//线程2 运行！
	}
}
