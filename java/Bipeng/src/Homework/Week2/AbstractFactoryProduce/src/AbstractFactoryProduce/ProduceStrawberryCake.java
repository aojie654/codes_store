package Homework.Week2.AbstractFactoryProduce.src.AbstractFactoryProduce;

public class ProduceStrawberryCake extends ProduceCake implements Product {
    public ProduceStrawberryCake() {
        super();
    }

    @Override
    public void produced() {
        System.out.println("A strawberry cake was produced.");
    }
}
