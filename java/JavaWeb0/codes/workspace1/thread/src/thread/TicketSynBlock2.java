package thread;

//此对象为线程1 方法1 Runnable  多线程通讯。wait notify 用在同步代码块中！
public class TicketSynBlock2 implements Runnable{
	//int 等基本类型没有锁！ synchronized(this.ticketNum) 错误的！
	private Integer ticketNum=500;//200张票！每张票票号就是顺序号！
	private String str = "abc";//String str对象有锁  多个对象对应字符串池中的同一个字符串
	private Integer tNum=500;//tNum有锁，
	private TicketNum ticketNumber;//有锁！
	//但！tNum是final的，不能改变，一变就成新的对象了，有了新锁！
	public TicketSynBlock2 (TicketNum tnum ,Integer num){
		this.ticketNumber =tnum;
		this.tNum = num;
	}
	
	@Override
	public void run() {
		String name=Thread.currentThread().getName();
		//()圆括号中对象锁，指定对象就可以！
		synchronized(this.ticketNumber){//下面的代码同一时刻只能有一个线程访问！
			System.out.println(name+" come in");
			for(int i=0;i<100;i++){
				if(ticketNumber.ticketNum>0){
					System.out.println(name+"买票，票号："+ticketNumber.ticketNum);
					ticketNumber.ticketNum = ticketNumber.ticketNum -1;//票数变少！
				}
				
			}
		}
	}
	
	public static void main(String[] args){
		TicketNum tn1 =new TicketNum();
		TicketNum tn2 =new TicketNum();
		TicketNum tn3 =new TicketNum();
		Integer num0= 100;
		Thread 黄牛1 = new Thread(new TicketSynBlock2(tn1,num0),"黄牛1");
		Thread 黄牛2 = new Thread(new TicketSynBlock2(tn1,num0),"黄牛2");
		Thread 黄牛3 = new Thread(new TicketSynBlock2(tn1,num0),"黄牛3");
		黄牛1.start();
		黄牛2.start();
		黄牛3.start();
	}

}
