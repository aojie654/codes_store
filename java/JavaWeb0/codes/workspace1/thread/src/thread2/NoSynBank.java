package thread2;
//线程 方法1 
public class NoSynBank extends Thread{
	//银行帐户是变量
	private BankAccount account;
	
	private double money;
	
	public NoSynBank(String name,BankAccount account,double money){
		super(name);//给线程起名字
		this.account=account;
		this.money=money;
	}
	//去自己的账户存钱或者取钱
	public void run(){
		double d = this.account.getBalance();//得到帐户金额
		//如果取钱或者钱不够，则操作不能执行！
		if(money<0&&d-money<0){
			System.out.println(this.getName()+"操作失败，余额不足！");
		}else{//可以操作
			d=d+money;
			System.out.println(this.getName()+"操作成功，目前账户余额为："+d);
			this.account.setBalance(d);//设置余额！
		}
	}
	
	public static void main(String[] args){
		//Bankid balance
		BankAccount myAccount = new BankAccount("60001002",5000); 
		NoSynBank t1 = new NoSynBank("T1",myAccount,-3000);
		NoSynBank t2 = new NoSynBank("T2",myAccount,-3000);
		NoSynBank t3 = new NoSynBank("T3",myAccount,1000);
		NoSynBank t4 = new NoSynBank("T4",myAccount,-2000);
		NoSynBank t5 = new NoSynBank("T5",myAccount,2000);
		
		//启动！
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
		
		try {
			t1.join();
			t2.join();
			t3.join();
			t4.join();
			t5.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
