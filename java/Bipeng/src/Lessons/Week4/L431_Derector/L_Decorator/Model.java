package Lessons.Week4.L431_Derector.L_Decorator;
public class Model implements Show {

    private final String name0;

    public Model(String name) {
        this.name0 = name;
    }

    @Override
    public void show() {
        System.out.println(name0+" is walking on T.");
    }
}
