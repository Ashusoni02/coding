<<<<<<< HEAD
package JAVA_Collection.list;

import java.util.Collections;
import java.util.Comparator;
// import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;


public class linkedlist {
    public static void main(String[] args) {
            List<Integer> list = new LinkedList<>();
        list.add(1);   // for adding
        list.add(2);
        list.add(2);
        list.add(6);
        list.add(5);
        list.add(7);
        
          list.add(2,22);                       // for sorting
        Collections.sort(list);       // for sorting
        list.set(1, 11);                     // for replace the value
        System.out.println(list.contains(1));        // for checking present or not in the arr (give in boolean value)
        System.out.println(list.isEmpty());            // for checking the arr is empty or not. (give in boolean value)
        System.out.println(list.get(1));        // for getting the value.
        System.out.println(list);
    }
}
=======
package JAVA_Collection.list;

import java.util.Collections;
import java.util.Comparator;
// import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;


public class linkedlist {
    public static void main(String[] args) {
            List<Integer> list = new LinkedList<>();
        list.add(1);   // for adding
        list.add(2);
        list.add(2);
        list.add(6);
        list.add(5);
        list.add(7);
        
          list.add(2,22);                       // for sorting
        Collections.sort(list);       // for sorting
        list.set(1, 11);                     // for replace the value
        System.out.println(list.contains(1));        // for checking present or not in the arr (give in boolean value)
        System.out.println(list.isEmpty());            // for checking the arr is empty or not. (give in boolean value)
        System.out.println(list.get(1));        // for getting the value.
        System.out.println(list);
    }
}
>>>>>>> 1ebe1489f399ebf33b4926e6611630739940bb88
