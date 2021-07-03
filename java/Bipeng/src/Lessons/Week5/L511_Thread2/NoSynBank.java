package Lessons.Week5.L511_Thread2;

public class NoSynBank extends Thread {
    private BankAccount account0;
    private double money0;

    @Override
    public void run() {
        synchronized (this) {
            double d0 = this.account0.getBalance();
            if (money0 < 0 && d0 - money0 < 0) {
                System.out.println(this.getName() + " operate failed.");
            } else {
                d0 += money0;
                System.out.println(this.getName() + " operate success.");
            }
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                System.out.println("InterruptedException!");
            }
            this.account0.setBalance(d0);
        }
    }

    public static void main(String[] args) throws InterruptedException{
        BankAccount myAccount0 = new BankAccount("60001002",5000);
//        SynBlockBank t1
    }
}
