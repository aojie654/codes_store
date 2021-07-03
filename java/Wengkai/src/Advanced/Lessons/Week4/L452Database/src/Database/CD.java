package Advanced.Lessons.Week4.L452Database.src.Database;

public class CD extends Item {
    private String artist;
    private int numOfTracks;

    public CD() {
        super();
    }

    public CD(String title, String artist, int numOfTracks, int playingTime, String comment) {
        super(title, playingTime, false, comment);
        this.artist = artist;
        this.numOfTracks = numOfTracks;
    }


    public static void main(String[] args) {

    }

    public void print() {
        System.out.print("CD:");
        super.printTitle();
        System.out.print(" " + artist + " " + numOfTracks);
        super.printElse();
    }
}
