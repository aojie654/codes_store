package Homework.Week2.AbstractFactoryProduce.src.AbstractFactoryProduce;

public class ProduceShoes implements Shoes{
    @Override
    public Product shoesProduce() {
        String type = null;
        return new ProducedShoesError(type);
    }

    @Override
    public Product shoesProduce(String type) {
        switch (type) {
            case "b": {
            }
            case "B": {
                return new ProduceBasketShoes();
            }
            case "r": {
            }
            case "R": {
                return new ProduceRunningShoes();
            }
            case "t": {
            }
            case "T": {
                return new ProduceTennisShoes();
            }
            default: {
                return new ProducedShoesError(type);
            }
        }
    }
}
