package JAVA_Collection.set;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class treeset {
    public static void main(String[] args) {
         Set<Integer> set = new TreeSet<>(); //  this is mainly use for maining the sorted order of the element.
    
    
    set.add(2);   
    set.add(1);   
    set.add(5);   
    set.add(4);  
    System.out.println(set.contains(2));
    System.out.println(set.isEmpty());
    System.out.println(set.remove(10));
    System.out.println(set.size());

    System.out.println(set);
    }
}
