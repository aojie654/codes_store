package thread2;

//TicketTest线程进行购票！
public class TicketTest implements Runnable{

	private int ticketNum =5;//定义票数！
	
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
	
	//购票方法！
	@Override
	public void run() {
		String name = Thread.currentThread().getName();
		//黄牛疯狂买票！买一百次，争取把所有票都买到！
		for(int i=0;i<100;i++){
			
			if(ticketNum>0){
				//耽搁一会。 
				ticketNum--;//买票票数减少！
				System.out.println(name+"买票！" +ticketNum);
			}
			
		}
	}

}
