package Lessons.Week1.L101_ExtendAnimalDemo04.src.ExtendAnimalDemo04;

public class Monkey extends Animal {
    private static String type = "С��";

    public Monkey(String name) {
        super(name, "~");
    }

    public Monkey() {
        super();
        this.setSound("֨~");
    }

    public void shout() {
        System.out.println("��Һã�����" + type + "," + this.getSound());
    }
}
