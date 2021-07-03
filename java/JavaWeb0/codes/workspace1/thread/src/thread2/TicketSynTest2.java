package thread2;

//TicketTest线程进行购票！
public class TicketSynTest2 implements Runnable{

	private int ticketNum =100;//定义票数！
	
	//测试代码！
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t1 = new Thread(new TicketTest());
		t1.setName("黄牛1");
		Thread t2 = new Thread(new TicketTest());
		t2.setName("黄牛2");
		Thread t3 = new Thread(new TicketTest());
		t3.setName("黄牛3");
		t1.start();
		t2.start();
		t3.start();
	}
	//同步方法 使用synchronized修饰 方法！
	public synchronized void buyTicket(String name){
		if(ticketNum>0){
			//耽搁一会。 
			ticketNum--;//买票票数减少！
			System.out.println(name+"买票！" +ticketNum);
		}
	}
	
	//购票方法！
	@Override
	public void run() {
		String name = Thread.currentThread().getName();
		//黄牛疯狂买票！买一百次，争取把所有票都买到！
		for(int i=0;i<50;i++){
			//对this同步就是对本TicketSynTest1的同一个实例对象同步
			this.buyTicket(name);
		}
	}

}
