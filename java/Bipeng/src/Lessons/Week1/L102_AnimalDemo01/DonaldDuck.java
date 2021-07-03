package Lessons.Week1.L102_AnimalDemo01;

public class DonaldDuck extends Duck {
    private String[] words;

    public void setWords(String[] words) {
        this.words = words;
    }

    public void walkOut() {
        System.out.println("Donald Duck is walking out and coming for a joke.");
        System.out.println();
    }

    public void speak() {
        for (int i =0; i<words.length;i+=1){
            System.out.println(words[i]);
        }
    }

    @Override
    public void layEggs() {
        System.out.println("Mr.Bi:\t\t\t\"Lay a chicken eggs please.");
        System.out.println("Donald Duck: \t\"I can't lay a chicken egg for I'm a MALE DUCK!!!\"");
    }

    @Override
    public void breed() {
        if (isAlive) {
            System.out.println("Donald Duck is alive.");
        } else {
            System.out.println("����Ѽ�ںͱ���ʦ��̸���б������ˡ�");
//            System.out.println("Donald Duck was died for his angry in talk to MR.Bi.");
        }
    }
}
