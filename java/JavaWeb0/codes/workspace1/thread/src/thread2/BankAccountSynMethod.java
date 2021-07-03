package thread2;

//银行帐户
public class BankAccountSynMethod {
	// 银行账号
	private String bankNo;
	// 银行余额
	private double balance;

	// 构造方法
	public BankAccountSynMethod(String bankNo, double balance) {
		this.bankNo = bankNo;
		this.balance = balance;
	}

	// getter/setter方法
	public String getBankNo() {
		return bankNo;
	}

	public void setBankNo(String bankNo) {
		this.bankNo = bankNo;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public synchronized void access(double money){
		String name = Thread.currentThread().getName();
		//如果取钱或者钱不够，则操作不能执行！
		if(money<0&&balance+money<0){//d+money
			System.out.println(name+"操作失败，余额不足！");
		}else{//可以操作
			balance=balance+money;
			System.out.println(name+"操作成功，目前账户余额为："+balance);
		}
	}
}

