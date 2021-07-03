package Lessons.Week1.L102_AnimalDemo01;

public class Duck extends Bird {
    public Duck() {
        System.out.println("This is a duck!");
    }

    @Override
    public void layEggs() {
        System.out.println("Duck is laying eggs, Gay Gay Gay!!!");
    }
}
