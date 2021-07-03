package Advanced.Lessons.Week4.L421Database.src.Database;

public class Item {
    private String title;
    private int playingTime;
    private boolean gotIt;
    private String comment;

    public Item(){

    }
    public Item(String title, int playingTime, boolean gotIt,String comment) {
        this.title = title;
        this.playingTime = playingTime;
        this.gotIt = gotIt;
        this.comment = comment;
    }

    public void printTitle() {
        System.out.print(" "+title);
    }
    public void printElse(){
        System.out.println(" "+gotIt+" "+comment);
    }

    public void print() {
    }
}
