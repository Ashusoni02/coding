<<<<<<< HEAD
package JAVA_Collection.Queue;
import java.util.Queue;
import java.util.Collections;
// import java.util.Collections.sort;
import java.util.LinkedList;

public class Queuelinkedlist {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.offer(4);
        q.offer(2);
        q.offer(1);
        q.offer(11);
    //   Collections.sort(q);     not allowed in Queue for sorting .
         System.out.println(q.peek());
        q.poll();
        System.out.println(q);
    }
}
=======
package JAVA_Collection.Queue;
import java.util.Queue;
import java.util.Collections;
// import java.util.Collections.sort;
import java.util.LinkedList;

public class Queuelinkedlist {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.offer(4);
        q.offer(2);
        q.offer(1);
        q.offer(11);
    //   Collections.sort(q);     not allowed in Queue for sorting .
         System.out.println(q.peek());
        q.poll();
        System.out.println(q);
    }
}
>>>>>>> 1ebe1489f399ebf33b4926e6611630739940bb88
