package Lessons.Week6.L621_Watcher.Bi.version1;

public class Student {
    private String name0;

    public Student(String name) {
        this.name0 = name;
    }

    public String getName0() {
        return name0;
    }

    public void setName0(String name0) {
        this.name0 = name0;
    }

    public void update(String newState) {
        if (newState.equals("tn")) {
            System.out.println("There is no teacher, " + this.name0 + " is playing games.");
        }
        if (newState.equals("ty")) {
            System.out.println("There is a teacher, " + this.name0 + " is study English.");
        }
    }
}
