package Lessons.Week3.L311_CollTest.demo;

import java.util.ArrayDeque;
import java.util.Queue;

public class QueueTest0 {
    public static void main(String[] args) {
        Queue<String> que0 = new ArrayDeque<>();
//      In Queue
        que0.offer("Q");
        que0.offer("M");
        que0.offer("X");
        que0.offer("J");
//      Out Queue
        String v0 = que0.poll();
        System.out.println(v0);
//      Out but not delete.
        v0 = que0.peek();
        System.out.println(v0);
        System.out.println("===============================================");
        System.out.println(que0.toString());

    }
}
