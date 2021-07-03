package thread2;
//线程 方法1 
public class SynBlockBank extends Thread{
	//银行帐户是变量
	private BankAccount account;
	
	private double money;
	
	public SynBlockBank(String name,BankAccount account,double money){
		super(name);//给线程起名字
		this.account=account;
		this.money=money;
	}
	//去自己的账户存钱或者取钱
	public void run(){
		synchronized (this.account){//对account进行同步！
			System.out.println(this.getName()+" come in");
			double d = this.account.getBalance();//得到帐户金额
			//如果取钱或者钱不够，则操作不能执行！
			if(money<0&&d+money<0){
				System.out.println(this.getName()+"操作失败，余额不足！");
			}else{//可以操作
				d=d+money;
				System.out.println(this.getName()+"操作成功，目前账户余额为："+d);
				this.account.setBalance(d);//设置余额！
			}
		}
	}
	
	public static void main(String[] args) throws InterruptedException{
		//Bankid balance
		BankAccount myAccount = new BankAccount("60001002",5000); 
		SynBlockBank t1 = new SynBlockBank("T1",myAccount,-3000);
		SynBlockBank t2 = new SynBlockBank("T2",myAccount,-3000);
		SynBlockBank t3 = new SynBlockBank("T3",myAccount,1000);
		SynBlockBank t4 = new SynBlockBank("T4",myAccount,-2000);
		SynBlockBank t5 = new SynBlockBank("T5",myAccount,2000);
		
		//启动！
		t2.start();
		t3.start();
		t4.start();
		t5.start();
		t1.start();

		
		
	}
}
