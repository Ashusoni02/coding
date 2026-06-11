package JAVA_Collection.map;

import java.util.HashMap;

public class hashmap {
    public static void main(String[] args) {
        HashMap<Integer,String> map = new HashMap<>();  
        map.put(1,"ashu");
        map.put(2,"rahul");
        map.put(3,"ll");
        map.putIfAbsent(4, "hello");
        map.remove(2);
     System.out.println(map.get(1)); // for getting the key value.
     System.out.println(map.containsKey(1)); // for getting the key is present ornot in t/f ..
        System.out.println(map);
    }
}
