package thread2;
//实现线程的第二种方式 继承Thread
public class ThreadDemo extends Thread{//继承Thread类。
	//重写run方法！
	public void run(){
		String name = Thread.currentThread().getName();
		long id =  Thread.currentThread().getId();
		int priority =Thread.currentThread().getPriority();//优先级默认是5
		System.out.println("name: "+name+" id:"+id+" priority:"+priority);
		for(int i=1;i<=1000;i++){//打印1~100之间的奇数
			if(i%2!=0){
				System.out.println("name: "+name+" id:"+id+" num:"+i);
			}
		}
	}
	
	public static void main(String[] args) {
		//测试线程！两个线程交替执行！
		Thread thread1 = new ThreadDemo();//定义并实例化一个新线程！
		thread1.setName("线程1");
		thread1.setPriority(10);
		//thread1设置成为后台线程，其他线程结束，此线程就结束。
		//比如垃圾回收线程就是一个守护线程也叫后台线程
		thread1.setDaemon(true);		
		thread1.start();//运行起来
		
		Thread thread2 = new ThreadDemo();//定义并实例化一个新线程！
		thread2.setName("线程2");
		thread2.setPriority(Thread.MIN_PRIORITY);
		thread2.start();//运行起来！
		
		//优先级！
		int priority =Thread.currentThread().getPriority();
		System.out.println("main method priority "+priority);
		//线程优先级 1~10 。1最小。10最大。默认5. JVM让程序员可以设置的优先级。
		
	}

}
