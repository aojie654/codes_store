package Lessons.Week4.L431_Derector.L_Decorator;

public class TestDecorator {
    public static void main(String[] args) {
        Model model0 = new Model("Zhang Liang");
        Sunglass sunGlass0 = new Sunglass();
        Bra bra0 = new Bra();
        TPaints tPaints0 = new TPaints();
        Shoes shoes0 = new Shoes();

        shoes0.decorate(model0);
        tPaints0.decorate(shoes0);
        bra0.decorate(tPaints0);
        sunGlass0.decorate(bra0);

        sunGlass0.show();
    }
}
