package Lessons.Week1.L102_AnimalDemo01;

public abstract class Bird extends Animal {
    public String feather = "feather";
    public String beak = "beak";
    private Wing wing1;
    private Wing wing2;

    public Bird() {
        super();
        wing1 = new Wing();
        wing2 = new Wing();
    }

    public abstract void layEggs();
}
