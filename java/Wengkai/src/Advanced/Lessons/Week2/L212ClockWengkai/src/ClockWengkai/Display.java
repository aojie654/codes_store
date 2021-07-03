package Advanced.Lessons.Week2.L212ClockWengkai.src.ClockWengkai;
public class Display {
    int value;
    int limit = 0;

    Display(int limit) {
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
}
