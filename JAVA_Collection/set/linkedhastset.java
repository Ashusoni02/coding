package JAVA_Collection.set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class linkedhastset {
    public static void main(String[] args) {
         Set<Integer> set = new LinkedHashSet<>();   // this is mainly use for maining the order of inserting and removing the element.
    
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
