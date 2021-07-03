package Advanced.Lessons.Week3.L331Container.src.Container.Set;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

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
        ArrayList<String> nb0 = new ArrayList<String>();
        nb0.add("1st");
        nb0.add("2nd");
        nb0.add("1st");
        System.out.println(nb0);
        System.out.println("==============");
        HashSet<String> s = new HashSet<String>();
        s.add("1st");
        s.add("2nd");
        s.add("1st");
        System.out.println(s);
    }
}
