package Lessons.Week3.L322_Adapter.java_3_22.adapter1;

public class AmericanSocket implements Adaptee {

    @Override
    public void socket3() {
        // TODO Auto-generated method stub
        System.out.println("美国的三孔插座！");
    }

    @Override
    public String voltage() {
        return "美国的110V电压";
    }
}
