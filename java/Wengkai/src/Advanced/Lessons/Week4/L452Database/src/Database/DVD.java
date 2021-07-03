package Advanced.Lessons.Week4.L452Database.src.Database;

public class DVD extends Item {
    private String director;

    public DVD() {
        super();
    }

    public DVD(String title, String director, int playingTime, String comment) {
        super(title, playingTime, false, comment);
        this.director = director;
    }

    public void print() {
        System.out.print("DVD:");
        super.printTitle();
        System.out.print(" " + director);
        super.printElse();
    }
}
