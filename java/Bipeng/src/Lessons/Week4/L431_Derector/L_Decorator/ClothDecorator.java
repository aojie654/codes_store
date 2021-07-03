package Lessons.Week4.L431_Derector.L_Decorator;

public class ClothDecorator implements Show {
    private Show component0;

    public void decorate(Show show) {
        this.component0 = show;
    }

    @Override
    public void show() {
        if (component0 != null) {
            component0.show();
        }
    }
}
