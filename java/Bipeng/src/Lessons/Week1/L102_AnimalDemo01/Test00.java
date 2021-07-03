package Lessons.Week1.L102_AnimalDemo01;

public class Test00 {
    public static void main(String[] args) {
        Duck duck0 = new Duck();
        duck0.inAndOut(new O2(), new Water());
        duck0.layEggs();
        System.out.println();

        Penguin pg0 = new Penguin(new Climate("South"));
        pg0.layEggs();
        System.out.println();

        Goose goose0 = new Goose();
        goose0.layEggs();
        goose0.fly();
        System.out.println();



//      HOMEWORK SPACE
//      HOMEWORK 1. More goose, fly by 1 and V.
        System.out.println("========================HOMEWORK SPACE====================================");
        System.out.println("==HOMEWORK 1. More goose, fly by 1 and V.==");
        GooseGroup gooses0 = new GooseGroup(); //��ô��ʼ����
        Goose[] gooses1 = new Goose[5];
        for (int i =0;i<gooses1.length;i+=1){
            gooses1[i] = new Goose();
        }
        gooses0.setGoose(gooses1);
        gooses0.flyOne();
        gooses0.flyV();
        System.out.println();

//      HOMEWORK 2. Let penguins go to Mid of Earth.
        System.out.println("==HOMEWORK 2. Let penguins go to Mid of Earth.==");
        Penguin pg1 = new Penguin(new Climate("North"));
        pg1.layEggs();
        System.out.println();

//      HOMEWORK 3. Int a interface:speak, int a DongDuck to implements the interface. Let DongDuck come out and tell a joke.
        System.out.println("==HOMEWORK 3. Int a interface:speak, int a DongDuck to implements the interface. Let DongDuck come out and tell a joke.==");
        DonaldDuck dd0 = new DonaldDuck();
        String[] joke0 = new String[2];
        dd0.breed();
        joke0[0] = "Mr.Bi:\t\t\t\"How cold was it at Disney World?\"";
        joke0[1] = "Donald Duck: \t\"For I were seen wearing pants!\"";
        dd0.setWords(joke0);
        dd0.walkOut();
        dd0.speak();
        dd0.layEggs();
        dd0.isAlive = false;
        dd0.breed();
    }
}
