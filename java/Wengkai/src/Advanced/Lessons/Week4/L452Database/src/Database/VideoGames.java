package Advanced.Lessons.Week4.L452Database.src.Database;

public class VideoGames extends Item {
    private int numberOfPlayers;

    public VideoGames() {
        super();
    }

    public VideoGames(String title, int playingTime, boolean gotIt, String comment, int numberOfPlayers) {
        super(title, playingTime, gotIt, comment);
        this.numberOfPlayers = numberOfPlayers;
    }

    @Override
    public void print() {
        System.out.print("Video games:");
        super.printTitle();
        System.out.print(" " + numberOfPlayers);
        super.printElse();
    }

    public static void main(String[] args) {
        VideoGames vg0 = new VideoGames("Tank War", 0,false,"...",2);
        vg0.print();
    }
}
