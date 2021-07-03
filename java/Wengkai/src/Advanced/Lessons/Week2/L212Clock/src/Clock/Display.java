package Advanced.Lessons.Week2.L212Clock.src.Clock;

public class Display {
    int value;
    int limit = 0;

    Display() {
        value = -1;
        this.limit = 60;
    }

    Display(int limit) {
        value = -1;
        this.limit = limit;
    }

    void increase() {
        value += 1;
        if (this.value == this.limit) {
            this.value = 0;
        }
    }

    int getValue() {
        return value;
    }

    public static void main(String[] args) {
        Display dh = new Display(24);
        Display dm = new Display();

        while (true) {
            dm.increase();
            if (dm.value == 00) {
                dh.increase();
            }
            System.out.printf("%02d:%02d\n", dh.getValue(), dm.getValue());
        }
    }
}
