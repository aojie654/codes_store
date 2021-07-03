package Homework.Week2.AbstractFactoryProduce.src.AbstractFactoryProduce;

public class ProducedShoesError implements Product {
    private String type;
    public ProducedShoesError(String type) {
        this.type = type;
    }

    @Override
    public void produced() {
        if (type!= null){
            System.out.println("There is no "+type+" shoes.");
        }else{
            System.out.println("You must enter a type of shoes to produce.");
        }
    }
}
