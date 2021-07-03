package Lessons.Week5.L511_Thread2;

public class BankAccount {
    private double balance0;
    private String id;

    public BankAccount(String s, double i) {
        balance0 = i;
    }

    public double getBalance() {
        return balance0;
    }

    public void setBalance(double d0) {
        balance0 = d0;
    }
}
