package JAVA_Collection.Queue;

import java.util.ArrayDeque;

public class arrdeq {
    public static void main(String[] args) {
        ArrayDeque<Integer> apq = new ArrayDeque<>();
          apq.offer(4);
        apq.offer(2);
       apq.offer(1);
        apq.offer(11);
        System.out.println(apq);
        apq.offerFirst(12);
        apq.offerLast(13);
        System.out.println(apq);
    }
}
