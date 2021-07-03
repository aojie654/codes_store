package Lessons.Week1.L101_ExtendAnimalDemo04.src.ExtendAnimalDemo04;

public abstract class Animal {
    private String sound;

    public String getName() {
        return name;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }

    public String getSound() {
        return sound;
    }

    private String name;
    private int shoutNum;

    public int getShoutNum() {
        return shoutNum;
    }

    public void setShoutNum(int shoutNum) {
        this.shoutNum = shoutNum;
    }

    public Animal() {
        name = "����";
        this.shoutNum = 3;
        this.sound = "~";
    }

    public Animal(String name, String sound) {
        this.name = name;
        this.shoutNum = 3;
        this.sound = sound;

    }

    public void shout() {
        System.out.println("���Ƕ��");
    }
}
