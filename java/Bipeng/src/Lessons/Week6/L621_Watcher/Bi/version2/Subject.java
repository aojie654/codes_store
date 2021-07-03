package Lessons.Week6.L621_Watcher.Bi.version2;

import java.util.ArrayList;
import java.util.List;

//Subject负责对Observer通知更新
public abstract class Subject {
    private List<Observer> list0 =
            new ArrayList<Observer>();

    private String state;

    public void attach(Observer stu) {
    }

    public void dettach(Observer stu) {
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void inform(String newState) {
        for (Observer stu0:list0){
            stu0.update(newState);
        }
    }
}
