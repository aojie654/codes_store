package Advanced.Lessons.Week8.L852Serializable.Serializable.src;import java.io.*;

class Student implements Serializable {
    private String name;
    private int age;
    private int grade;

    public Student(String name, int age, int grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    @Override
    public String toString() {
        return name + " " + age + " " + grade;
    }
}

public class Serializable0 {
    public static void main(String[] args) {
        try {
            Student s1 = new Student("Jhon", 18, 5);
            System.out.println(s1);
            ObjectOutputStream out = new ObjectOutputStream(
                    new FileOutputStream("./obj.dat")
            );
            out.writeObject(s1);
            out.close();
            ObjectInputStream in = new ObjectInputStream(
                    new FileInputStream("./obj.dat")
            );
            Student s2 = (Student)in.readObject();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}
