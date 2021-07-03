package Lessons.Week5.L511_Thread;

public class RunThread implements Runnable {
    @Override
    public void run() {
        String name0 = Thread.currentThread().getName();
        long id0 = Thread.currentThread().getId();
        int sum = 0;
        for (int i = 0; i <= 100; i += 1) {
            sum += i;
            System.out.println("id: "+id0+" name: "+name0+"sum i:"+i);
        }
    }

    public static void main(String[] args) {
        String name0 = Thread.currentThread().getName();
        long id0 = Thread.currentThread().getId();
        Thread t0 = new Thread(new RunThread());
        t0.start();
        for (int i = 0; i <= 100; i += 1) {
            System.out.println("id: "+id0+" name: "+name0+"main i:"+i);
        }
    }
}
