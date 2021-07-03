package Lessons.Week3.L322_Adapter.Adapter;

public class Laptop {
    private String brand;
    private Target plug2;

    public Laptop(String brand, Target plug) {
        this.brand = brand;
        this.plug2 = plug;
    }

    public void work(){
        System.out.println("Plug in now!");
        plug2.socket02();
        System.out.println("The laptop is running!");
    }

    public static void main(String[] args) {

//        Test in china.
        Target cs0 = new ChineseAdapter();

    }
}
