package Lessons.Week6.L621_Watcher.Bi.version1;

import java.util.ArrayList;
import java.util.List;

public class Monitor {
    private List<Student> list0 = new ArrayList<Student>();
    private String status0;

    public String getStatus0() {
        return status0;
    }

    public void setStatus0(String status0) {
        this.status0 = status0;
    }

    public void attach(Student stu0) {
        list0.add(stu0);
        System.out.println(stu0.getName0() + " is friends of mine, I will call him.");
    }

    public void dettach(Student stu0) {
        list0.remove(stu0);
        System.out.println(stu0.getName0() + " is not friends of mine anymore, I don't care.");
    }

    public void inform(String newState) {
        this.setStatus0(newState);
        for (Student stu0 : list0) {
            stu0.update(newState);
        }
    }
}
