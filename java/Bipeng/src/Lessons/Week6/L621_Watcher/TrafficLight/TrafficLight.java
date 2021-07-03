package Lessons.Week6.L621_Watcher.TrafficLight;

public class TrafficLight extends Subject
{
    @Override
    public void notifyAllObservers(String state)
    {
        switch (state)
        {
            case "straight":
            {
                for (Observer o : observers)
                {
                    if (o.getDirection().equals("straight") || o.getDirection().equals("right"))
                    {
                        o.update();
                    }

                }
                break;
            }

            case "left":
            {
                for (Observer o : observers)
                {
                    if (o.getDirection().equals("left") || o.getDirection().equals("right"))
                    {
                        o.update();
                    }

                }
                break;
            }
        }
    }
}
