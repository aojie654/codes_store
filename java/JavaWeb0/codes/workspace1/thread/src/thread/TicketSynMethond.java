package thread;

//此对象为线程1 方法1 Runnable
public class TicketSynMethond implements Runnable{
	//int 等基本类型没有锁！ synchronized(this.ticketNum) 错误的！
	private Integer ticketNum=500;//200张票！每张票票号就是顺序号！
	private String str = "abc";//String str对象有锁
	private Integer tNum=500;//tNum有锁，
	private TicketNum ticketNumber;//有锁！
	//但！tNum是final的，不能改变，一变就成新的对象了，有了新锁！
	public TicketSynMethond (TicketNum tnum){
		this.ticketNumber =tnum;
	}
	//synchronized同步方法，将关键字放到public 和void 中间！
	public synchronized void buy(String name){
		System.out.println(name+" come in");
		for(int i=0;i<100;i++){
			if(ticketNumber.ticketNum>0){
				System.out.println(name+"买票，票号："+ticketNumber.ticketNum);
				ticketNumber.ticketNum = ticketNumber.ticketNum -1;//票数变少！
				if(i%10==0){
					try {
						Thread.sleep(1000);//即使睡着，钥匙还拿着！
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		}
	}
	
	@Override
	public void run() {
		String name=Thread.currentThread().getName();
		this.buy(name);//调用同步方法！注意同步方法的对象锁只能是this对象！
		
	}
	
	public static void main(String[] args){
		TicketNum tn1 =new TicketNum();
		TicketNum tn2 =new TicketNum();
		TicketNum tn3 =new TicketNum();
		TicketSynMethond tm=new TicketSynMethond(tn1);
		Thread 黄牛1 = new Thread(tm,"黄牛1");
		Thread 黄牛2 = new Thread(tm,"黄牛2");
		Thread 黄牛3 = new Thread(tm,"黄牛3");
		黄牛1.start();
		黄牛2.start();
		黄牛3.start();
	}
	
	
	
	
}
