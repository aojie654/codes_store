package Lessons.Week6.L621_Watcher.TrafficLight;

public class TL_main
{
    private static final String Straight = "straight";
    private static final String Right = "right";
    private static final String Left = "left";

    public static void main(String[] args)
    {
        Subject tl = new TrafficLight();
        new RightWardVehicle(tl, Right);
        new RightWardVehicle(tl, Right);
        new StraightWardVehicle(tl, Straight);
        new StraightWardVehicle(tl, Straight);
        new LeftWardVehicle(tl, Left);
        new LeftWardVehicle(tl, Left);

        System.out.println("The Straight Light is green:");
        tl.setState(Straight);
        System.out.println();
        System.out.println("The Left Light is green");
        tl.setState(Left);
    }
}
