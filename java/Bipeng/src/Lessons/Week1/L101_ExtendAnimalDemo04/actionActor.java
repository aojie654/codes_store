package Lessons.Week1.L101_ExtendAnimalDemo04.src.ExtendAnimalDemo04;

public class actionActor extends Animal implements IChange {
    @Override
    public void changeThing() {
        System.out.println("�����������ڴ�����Ǯ\n����ͱ��������ڴ���");
    }

    private static String type = "Action Actor";

    public actionActor(String name) {
        super(name, "~");
    }

    public actionActor() {
        super();
        this.setSound("���Ű���ѽ���~");
    }

    public void shout() {
        System.out.println("��Һã�����" + type + "��"+"�ҽ�"+this.getName() + this.getSound());
        this.changeThing();
    }

}

