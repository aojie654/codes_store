package Lessons.Week3.L311_CollTest.demo;

import java.util.Iterator;
import java.util.Set;

public class SetTest {
    private static Set set0;

    public static void main(String[] args) {
        set0.add("Apple");
        set0.add("Watermelon");
        set0.add("Onion");
        set0.add("Banana");
        set0.add("Grape");
        set0.add("Pear");

        Iterator iterator0 = set0.iterator();
        while (iterator0.hasNext()) {
            String str0 = (String) iterator0.next();
            System.out.println(str0);
        }
    }

}

