package Lessons.Week6.L621_Watcher.TrafficLight;

public class RightWardVehicle extends Observer
{
    RightWardVehicle(Subject subject, String direction)
    {
        super(direction);
        this.subject=subject;
        subject.attach(this);
    }

    @Override
    public void update()
    {
        System.out.println("RightWardVehicle turn right");
    }
}
