package thread2;
//线程 方法1 
public class SynMethodBank2 extends Thread{
	//银行帐户是变量
	private BankAccount account;
	
	private double money;
	
	public SynMethodBank2(String name,BankAccount account,double money){
		super(name);//给线程起名字
		this.account=account;
		this.money=money;
	}
	
	public synchronized void access(double money){
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
	//去自己的账户存钱或者取钱
	public void run(){
			this.access(money);
	}
	
	public static void main(String[] args) throws InterruptedException{
		//Bankid balance
		BankAccount myAccount = new BankAccount("60001002",5000); 
		SynMethodBank2 t1 = new SynMethodBank2("T1",myAccount,-3000);
		SynMethodBank2 t2 = new SynMethodBank2("T2",myAccount,-3000);
		SynMethodBank2 t3 = new SynMethodBank2("T3",myAccount,1000);
		SynMethodBank2 t4 = new SynMethodBank2("T4",myAccount,-2000);
		SynMethodBank2 t5 = new SynMethodBank2("T5",myAccount,2000);
		
		//启动！
		//如何做？
		
		
	}
}
