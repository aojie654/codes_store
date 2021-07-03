package Lessons.Week3.L311_CollTest.demo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class ListTest {
    private static List list0 = new ArrayList();

    public static void main(String[] args) {
        list0.add(0,"Apple");
        list0.add(1,"Watermelon");
        list0.add(2,"Banana");
        list0.add(3,"Grape");
        list0.add(4,"Pear");
        list0.add(3,"Pi");

        Iterator iterator0 = list0.iterator();
        while (iterator0.hasNext()) {
            String str0 = (String) iterator0.next();
            System.out.println(str0);
        }
        System.out.println(list0.toString());
    }

    public static Collection move(String place) {
        System.out.println("Move to " + place + ".");
        return list0;
    }
}