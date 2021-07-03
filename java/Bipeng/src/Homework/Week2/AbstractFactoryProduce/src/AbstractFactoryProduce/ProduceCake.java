package Homework.Week2.AbstractFactoryProduce.src.AbstractFactoryProduce;

public class ProduceCake implements Cake {
    @Override
    public Product cakeProduce() {
        String type=null;
        return new ProducedCakeError(type);
    }

    @Override
    public Product cakeProduce(String type) {
        switch (type) {
            case "b": {
            }
            case "B": {
                return new ProduceBlackCake();
            }
            case "s": {
            }
            case "S": {
                return new ProduceStrawberryCake();
            }
            case "c": {
            }
            case "C": {
                return new ProduceCheeseCake();
            }
            default: {
                return new ProducedCakeError(type);
            }
        }
    }
}