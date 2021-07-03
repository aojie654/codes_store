package Homework.Week2.AbstractFactoryProduce.src.AbstractFactoryProduce;

public class AbstractFactoryProduce {
    public static void main(String[] args) {
//使用简单工厂模式或抽象工厂模式。
// 1 生产蛋糕/球鞋
// 2 黑森林，草莓蛋糕，芝士蛋糕/跑鞋，篮球鞋，网球鞋，登山靴
// 3 蛋糕接口 （）  蛋糕店（蛋糕工厂生产不同种类蛋糕），
// 球鞋接口。鞋厂类生产不同种类球鞋
// 4 在测试类中，使用工厂方法或抽象工厂模式生产不同种类蛋糕或跑鞋
        Cake c0 = new ProduceCake();
        Product p0 = c0.cakeProduce();
        p0.produced();

        Cake c1 = new ProduceCake();
        Product p1 = c1.cakeProduce("b");
        p1.produced();

        Cake c2 = new ProduceCake();
        Product p2 = c2.cakeProduce("c");
        p2.produced();

        Cake c3 = new ProduceCake();
        Product p3 = c3.cakeProduce("s");
        p3.produced();

        Cake c4 = new ProduceCake();
        Product p4 = c4.cakeProduce("a");
        p4.produced();

        System.out.println("=============================================");

        Shoes s0 = new ProduceShoes();
        Product p5 = s0.shoesProduce();
        p5.produced();

        Shoes s1 = new ProduceShoes();
        Product p6 = s1.shoesProduce("b");
        p6.produced();

        Shoes s2 = new ProduceShoes();
        Product p7 = s2.shoesProduce("r");
        p7.produced();

        Shoes s3 = new ProduceShoes();
        Product p8 = s3.shoesProduce("t");
        p8.produced();

        Shoes s4 = new ProduceShoes();
        Product p9 = s4.shoesProduce("a");
        p9.produced();
    }
}
