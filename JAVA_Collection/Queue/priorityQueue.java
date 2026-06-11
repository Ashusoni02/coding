package JAVA_Collection.Queue;

import java.util.PriorityQueue;
import java.util.Comparator;
// import java.util.reverseOrder;

public class priorityQueue{
    public static void main(String[] args) {
    PriorityQueue<Integer> pq = new PriorityQueue<>();    
    // PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());    
    
        pq.offer(4);
        pq.offer(2);
        pq.offer(1);
        pq.offer(11);
        System.out.println(pq);
        System.out.println(pq.peek());
        System.out.println(pq.poll());
        System.out.println(pq);

    }

}