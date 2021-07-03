package Lessons.Week4.L431_Derector.H_SunWuKong;

public class Monkey extends Description {
    private String name0;

    public Monkey(String name0) {
        this.name0 = name0;
    }

    @Override
    public void function() {
        System.out.println("A monkey that named " + name0 + " was born!");
    }
}
