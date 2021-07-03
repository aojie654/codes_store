package Lessons.Week5.L511_Thread2;

public class SynBlockBank implements Runnable {
    private int tickets0 = 5;

    public static void main(String[] args) {
        Thread t1 = new Thread(new TicketTest());
        t1.setName("number 1");
        Thread t2 = new Thread(new TicketTest());
        t2.setName("number 2");
        Thread t3 = new Thread(new TicketTest());
        t3.setName("number 3");
        t1.run();
        t2.run();
        t3.run();
    }

    @Override
    public void run() {
        String name0 = Thread.currentThread().getName();
        synchronized (this) {
            for (int i = 0; i < 100; i += 1) {
                if (tickets0 > 0) {
                    try {
                        Thread.sleep(300);
                    } catch (InterruptedException e) {
                        System.out.println("InterruptedException!");
                    }
                    tickets0 -= 1;
                    System.out.println(name0 + " buy a ticket.");
                }
            }
        }
    }
}
