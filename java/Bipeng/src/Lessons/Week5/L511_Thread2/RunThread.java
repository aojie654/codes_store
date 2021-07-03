package Lessons.Week5.L511_Thread2;

public class RunThread extends Thread {
    @Override
    public void run() {
        String name0 = Thread.currentThread().getName();
        long id0 = Thread.currentThread().getId();
        for (int i = 0; i <= 100; i += 1) {
            if (i % 2 != 0) {
                System.out.println("name： " + name0 + " id: " + id0 + " run: " + i);
            }
        }
    }

    public static void main(String[] args) {
        Thread t0 = new RunThread();
        t0.setName("Thread0");
        t0.setPriority(10);
        t0.setDaemon(true);
        Thread t1 = new RunThread();
        t1.setName("Thread1");
        t1.setPriority(Thread.MIN_PRIORITY);
        t0.start();
        t1.start();
        int p0 = Thread.currentThread().getPriority();
        System.out.println("main method priority: "+ p0);
    }
}
