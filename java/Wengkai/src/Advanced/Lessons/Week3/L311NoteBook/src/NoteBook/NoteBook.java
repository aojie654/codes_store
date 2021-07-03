package Advanced.Lessons.Week3.L311NoteBook.src.NoteBook;

import java.util.ArrayList;

public class NoteBook {
    public ArrayList<String> notes = new ArrayList<String>();

    public void add(String s) {
        notes.add(s);
    }

    public int getSize() {
        return notes.size();
    }

    public void insertnote(String s, int location) {
        notes.add(location, s);
    }

    public String getNote(int index) {
        return notes.get(index);
    }

    public void removeNote(int index) {
        notes.remove(index);
    }

    public String[] list() {
        String[] a = new String[notes.size()];
//        for (int i = 0; i < notes.size(); i += 1) {
//            a[i] = notes.get(i);
//        }
        notes.toArray(a);
        return a;
    }

    public static void main(String[] args) {
        NoteBook nb0 = new NoteBook();
        nb0.add("1st");
        nb0.add("2nd");
        nb0.insertnote("3rd", 1);
        System.out.println(nb0.getSize());
        System.out.println(nb0.getNote(1));
        System.out.println();
        nb0.removeNote(1);
        String[] a = nb0.list();
        for (String s : a) {
            System.out.println(s);
        }
    }
}
