package Advanced.Lessons.Week4.L411Database.src.Database;

public class CD {
    private String title;
    private String artist;
    private int numOfTracks;
    private int playingTime;
    private boolean gotIt = false;
    private String comment;

    @Override
    public String toString() {
        return "CD{" +
                "title='" + title + '\'' +
                ", artist='" + artist + '\'' +
                ", numOfTracks=" + numOfTracks +
                ", playingTime=" + playingTime +
                ", gotIt=" + gotIt +
                ", comment='" + comment + '\'' +
                '}';
    }

    public CD(String title, String artist, int numOfTracks, int playingTime, String comment) {
        this.title = title;
        this.artist = artist;
        this.numOfTracks = numOfTracks;
        this.playingTime = playingTime;
        this.comment = comment;
    }

    @Override
    public boolean equals(Object obj) {
        CD cc = (CD)obj;
        return artist.equals(cc.artist);
    }

    public static void main(String[] args) {
        CD cd0 = new CD("Hero", "Alex", 1, 190, "Rock");
        CD cd1 = new CD("Hero", "Alex", 1, 190, "Rock");
        System.out.println(cd0.toString());
        System.out.println(cd0.toString());
        System.out.println();
        System.out.println(cd0.equals(cd1));
    }

    public void print() {
        System.out.println(title+":"+artist);
    }
}
