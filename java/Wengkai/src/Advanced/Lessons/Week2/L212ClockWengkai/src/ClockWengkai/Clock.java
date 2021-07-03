package Advanced.Lessons.Week2.L212ClockWengkai.src.ClockWengkai;

public class Clock {
    private Display hour = new Display(24);
    private Display minite = new Display(60);

    public void start() {
        while (true) {
            minite.increase();
            if (minite.getValue() == 0) {
                hour.increase();
            }
            System.out.printf("%02d:%02d\n", hour.getValue(), minite.getValue());
        }
    }

    public static void main(String[] args) {
        Clock clock = new Clock();
        clock.start();
    }
}
