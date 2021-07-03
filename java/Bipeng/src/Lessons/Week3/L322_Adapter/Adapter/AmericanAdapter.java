package Lessons.Week3.L322_Adapter.Adapter;

public class AmericanAdapter extends Adapter implements Adaptee {
    public AmericanAdapter(Adaptee adapter0) {
        super(adapter0);
    }

    @Override
    public void socket02() {
        System.out.println("This is AmericanAdapter2");
    }

    @Override
    public void socket3() {
        System.out.println("This is AmericanAdapter3.");
    }
}
