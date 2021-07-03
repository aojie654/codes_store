package Lessons.Week1.L102_AnimalDemo01;

public abstract class Animal {
    public boolean isAlive;

    public Animal() {
        isAlive = true;
        System.out.println("A new life was born.");
    }

    public void inAndOut(O2 o2, Water water) {
        if (o2 == null || water == null) {
            isAlive = false;
            System.out.println("Animals can't live without O2 and water");
        }
        System.out.println("Animals is living with O2 and water.");
    }

    //    Have life or not;
    public void breed() {
        if (isAlive) {
            System.out.println("Life is going on.");
        } else {
            System.out.println("Life was gone.");
        }
    }
}
