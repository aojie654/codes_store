package Lessons.Week6.L621_Watcher.TrafficLight;

public class StraightWardVehicle extends Observer
{
    public StraightWardVehicle(Subject subject,String direction)
    {
        super(direction);
        this.subject=subject;
        subject.attach(this);
    }

    @Override
    public void update()
    {
        System.out.println("StraightWardVehicle go straight");
    }
}
