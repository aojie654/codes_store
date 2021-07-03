package Lessons.Week3.L311_CollTest.demo;

import java.util.Collection;
import java.util.Iterator;

public class CollTest {
    private static Collection coll;

    public static void main(String[] args) {
        coll.add("Apple");
        coll.add("Watermelon");
        coll.add("Onion");
        coll.add("Grape");
        coll.add("Pear");

        coll = move("Xi'An");

        Iterator iterator0 = coll.iterator();
        while(iterator0.hasNext()){
            String str0 = (String) iterator0.next();
            System.out.println(str0);
        }
    }

    public static Collection move(String place) {
        System.out.println("Move to " + place + ".");
        return coll;
    }
}
