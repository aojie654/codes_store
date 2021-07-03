package Advanced.Lessons.Week4.L421Database.src.Database;

import java.util.ArrayList;

public class Database {
    private ArrayList<Item> listItem = new ArrayList<Item>();

    public void add(Item item) {
        listItem.add(item);
    }

    public void list() {
        for (Item item : listItem) {
            item.print();
        }
    }

    public static void main(String[] args) {
        Database db = new Database();
        db.add(new CD("Mine", "Ill", 1, 200, "Rock"));
        db.add(new CD("Hero", "Alex", 1, 190, "Rock"));
        db.add(new DVD("Great Wall", "Yimou Zhang", 12000, "Garbage"));
        db.list();
    }
}
