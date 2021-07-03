package Advanced.Lessons.Week4.L411Database.src.Database;

import java.util.ArrayList;

public class Database {
    private ArrayList<CD> listCD = new ArrayList<CD>();

    public void add(CD cd) {
        listCD.add(cd);
    }

    public void list() {
        for (CD cd : listCD) {
            cd.print();
        }
    }

    public static void main(String[] args) {
        Database db = new Database();
        db.add(new CD("Mine", "Ill", 1, 200, "Rock"));
        db.add(new CD("Hero", "Kelson", 1, 190, "Rock"));
        db.list();
    }
}
