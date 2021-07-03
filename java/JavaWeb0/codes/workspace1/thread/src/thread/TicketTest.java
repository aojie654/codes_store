package thread;

//此对象为线程1 方法1 Runnable
public class TicketTest implements Runnable{
	private int ticketNum=20;//200张票！每张票票号就是顺序号！

	@Override
	public void run() {
		String name=Thread.currentThread().getName();

		for(int i=0;i<100;i++){
			if(ticketNum>0){
				System.out.println(name+"买票，票号："+ticketNum);
				ticketNum = ticketNum -1;//票数变少！
			}
		}
	}
	
	public static void main(String[] args){
		Thread 黄牛1 = new Thread(new TicketTest(),"黄牛1");
		Thread 黄牛2 = new Thread(new TicketTest(),"黄牛2");
		Thread 黄牛3 = new Thread(new TicketTest(),"黄牛3");
		黄牛1.start();
		黄牛2.start();
		黄牛3.start();
	}
	
	
	
	
}
