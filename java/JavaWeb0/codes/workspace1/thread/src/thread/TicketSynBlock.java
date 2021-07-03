package thread;

//此对象为线程1 方法1 Runnable
public class TicketSynBlock implements Runnable{
	private Integer ticketNum=200;//200张票！每张票票号就是顺序号！
	//Integer 是final的。
	//synchronized()圆括号中只能放对象！
	//java中每个对象都有一把对象锁。int num；//基本类型对象没有锁！ 
	//String str
	@Override
	public void run() {
		String name=Thread.currentThread().getName();
		//()圆括号中对象锁，指定对象就可以！
		synchronized(this.ticketNum){//希望下面的代码同一时刻只能有一个线程访问！互斥的
			//通过拿this对象的对象锁实现互斥！
			System.out.println(name+" come in");
			for(int i=0;i<100;i++){
				if(ticketNum>0){
					System.out.println(name+"买票，票号："+ticketNum);
					ticketNum = ticketNum -1;//票数变少！
				}				
			}
		}
	}
	
	public static void main(String[] args){
		TicketSynBlock o1 = new TicketSynBlock();
		//三个黄牛公用o1这把锁！
		Thread 黄牛1 = new Thread(o1,"黄牛1");
		Thread 黄牛2 = new Thread(o1,"黄牛2");
		Thread 黄牛3 = new Thread(o1,"黄牛3");
		黄牛1.start();
		黄牛2.start();
		黄牛3.start();
	}
	
}
