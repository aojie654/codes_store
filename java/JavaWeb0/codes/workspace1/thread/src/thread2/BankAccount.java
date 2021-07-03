package thread2;

//银行帐户
public class BankAccount {
	// 银行账号
	private String bankNo;
	// 银行余额
	private double balance;

	// 构造方法
	public BankAccount(String bankNo, double balance) {
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
}

