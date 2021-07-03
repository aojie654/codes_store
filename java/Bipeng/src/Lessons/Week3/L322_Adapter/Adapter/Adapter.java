package Lessons.Week3.L322_Adapter.Adapter;

public class Adapter implements Target{
    private Adaptee adapter0;

    public Adapter(Adaptee adapter0) {
        this.adapter0 = adapter0;
    }

    public Adapter() {

    }

    @Override
    public void socket02(){
        System.out.println("Use socket to 3;");
        adapter0.socket3();
        System.out.println("Using American socket3!");
    }
}
