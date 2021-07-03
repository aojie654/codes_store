package thread2;

//TicketTest线程进行购票！
public class TicketSynTest1 implements Runnable{
	//非基本变量，只要是对象就可以使用同步关键字
	private Num ticketNum =null;//定义票数！
	
	//测试代码！
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Num num =new Num(new Integer(200));
		//注意1
		TicketSynTest1 huangniu1 = new TicketSynTest1();
		huangniu1.setTicketNum(num);
		Thread t1 = new Thread(huangniu1);
		t1.setName("黄牛1");
		TicketSynTest1 huangniu2 = new TicketSynTest1();
		huangniu2.setTicketNum(num);
		Thread t2 = new Thread(huangniu2);
		t2.setName("黄牛2");
		TicketSynTest1 huangniu3 = new TicketSynTest1();
		huangniu3.setTicketNum(num);
		Thread t3 = new Thread(huangniu3);
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
		for(int i=0;i<50;i++){
			//注意2 对this同步就是对本TicketSynTest1的同一个实例对象同步
			synchronized (this.ticketNum){//同步代码块！对this同步就是对本TicketSynTest1的
				if(ticketNum.num>0){
					//耽搁一会。 
					ticketNum.num--;//买票票数减少！
					System.out.println(name+"买票！" +ticketNum.num);
				}
			}
		}
	}

	public Num getTicketNum() {
		return ticketNum;
	}

	public void setTicketNum(Num ticketNum) {
		this.ticketNum = ticketNum;
	}

}
