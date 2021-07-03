package Lessons.Week1.L102_AnimalDemo01;

public class Goose extends Bird implements IFly{
    public Goose() {
        System.out.println("This is a goose.");
    }

    @Override
    public void layEggs() {
        System.out.println("Goose is laying eggs, Hia hia hia~~~");
    }

    @Override
    public void fly() {
        System.out.println("Groose is flying on the sky.");
    }
}
