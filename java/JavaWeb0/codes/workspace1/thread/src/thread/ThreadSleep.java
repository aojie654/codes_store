package thread;

public class ThreadSleep extends Thread {

	//主函数中，让线程实例化并运行！
	public static void main(String[] args) throws InterruptedException {
		String name =Thread.currentThread().getName();//名字
		long id =Thread.currentThread().getId();//id
		int pri = Thread.currentThread().getPriority();//优先级
		System.out.println("当前运行的线程是"+name+" id:"+id+" 优先级： "+pri);
		Thread thread1 = new ThreadSleep();
		thread1.start();//线程1 运行！
		Thread.currentThread();
		Thread thread2 = new ThreadSleep();
		thread2.start();//线程2 运行！ 
		

	}

	//run方法中完成线程主要任务！打出100以内的偶数！
	public void run() {
		String name = Thread.currentThread().getName();
		
		for(int i=0;i<=100;i++){
			System.out.println(name +" for");
			if(i%2==0){
				System.out.println(name+" thread run:" +i);
				System.out.println(name +" sleep");
				try {
					Thread.sleep(10);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}//睡觉1秒
				System.out.println(name +" up");
			}
		}
	}
}
