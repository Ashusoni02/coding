package JAVA_Collection.map;

import java.util.HashMap;
import java.util.TreeMap;

public class treemap {
     public static void main(String[] args) {
          TreeMap<Integer,String> map = new TreeMap<>();  // mainly use for arraning in sorted order the keys.
        map.put(5,"ashu");
        map.put(4,"rahul");
        map.put(3,"ll");
        map.putIfAbsent(4, "hello");
        map.remove(2);
     System.out.println(map.get(1)); // for getting the key value.
     System.out.println(map.containsKey(1)); // for getting the key is present ornot in t/f ..
        System.out.println(map);
     }
}
