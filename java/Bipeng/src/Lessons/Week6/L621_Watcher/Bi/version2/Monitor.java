package Lessons.Week6.L621_Watcher.Bi.version2;

public class Monitor extends Subject {
    public void change(String newStatus){
        this.setState(newStatus);
        System.out.println("New status is: "+newStatus);

    }
}
