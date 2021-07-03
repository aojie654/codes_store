package Lessons.Week6.L621_Watcher.TrafficLight;

public abstract class Observer
{

    protected Subject subject;
    private String direction;

    public abstract void update();

    public Observer(String direction)
    {
        this.direction = direction;
    }

    public String getDirection()
    {
        return direction;
    }
}
