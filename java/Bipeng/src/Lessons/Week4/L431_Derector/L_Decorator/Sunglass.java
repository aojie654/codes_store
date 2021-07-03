package Lessons.Week4.L431_Derector.L_Decorator;

public class Sunglass extends ClothDecorator {
    @Override
    public void show() {
        super.show();
        System.out.println("Cool Armani glass");
    }
}
