package Lessons.Week4.L431_Derector.L_Decorator;

public class Shoes extends ClothDecorator {
    @Override
    public void show() {
        super.show();
        System.out.println("There has no shoes!");
    }
}
