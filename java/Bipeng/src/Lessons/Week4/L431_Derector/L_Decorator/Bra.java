package Lessons.Week4.L431_Derector.L_Decorator;

public class Bra extends ClothDecorator {
    @Override
    public void show() {
        super.show();
        System.out.println("This is a sexy bra!");
    }
}
