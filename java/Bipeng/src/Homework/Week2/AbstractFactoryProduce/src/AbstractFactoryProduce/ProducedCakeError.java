package Homework.Week2.AbstractFactoryProduce.src.AbstractFactoryProduce;

public class ProducedCakeError implements Product {
    private String type;
    public ProducedCakeError(String type) {
        this.type = type;
    }

    @Override
    public void produced() {
        if (type!= null){
            System.out.println("There is no "+type+" cake.");
        }else{
            System.out.println("You must enter a type of cake to produce.");
        }
    }
}
