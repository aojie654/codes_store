package Lessons.Week3.L322_Adapter.Adapter;

public class ChineseAdapter extends Adapter implements Adaptee {
    public ChineseAdapter(Adaptee adapter0) {
        super(adapter0);
    }

    public ChineseAdapter() {
        super();
    }

    @Override
    public void socket02() {
        System.out.println("This is ChineseAdapter2");
    }

    @Override
    public void socket3() {
        System.out.println("This is ChineseAdapter3.");
    }
}
