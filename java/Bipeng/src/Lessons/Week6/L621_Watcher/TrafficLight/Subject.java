package Lessons.Week6.L621_Watcher.TrafficLight;

import java.util.ArrayList;
import java.util.List;

public abstract class Subject
{
    List<Observer> observers = new ArrayList<>();
    private String state;

    public abstract void notifyAllObservers(String state);

    public void attach(Observer o)
    {
        observers.add(o);
    }

    public String getState()
    {
        return state;
    }

    public void setState(String state)
    {
        this.state = state;
        notifyAllObservers(state);
    }
}
