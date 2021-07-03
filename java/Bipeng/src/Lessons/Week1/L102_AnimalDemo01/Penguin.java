package Lessons.Week1.L102_AnimalDemo01;

public class Penguin extends Bird {

    private Climate climate;

    public void setClimate(Climate climate) {
        this.climate = climate;
    }

    public Penguin(Climate climate) {
        super();
        this.climate = climate;
    }

    @Override
    public void layEggs() {
        System.out.println("This is a penguin.");
        if (this.climate.intro.equals("South")) {
            System.out.println("Introduce is cold enough, penguins is laying eggs! Ying Ying Ying~~~");
        } else {
            System.out.println("Introduce is not cold enough to lay eggs.");
        }
    }
}
