package JAVA_Collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class index {
    public static void main(String[] args) {
        // int[] arr = {22,33,11,4,3,7};
        // Arrays.sort(list);
        // int n = Arrays.binarySearch(arr, 33);
        
        // System.out.println("the index of the key is :" + n);
        // System.out.println(Arrays.toString(arr));
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(2);
        list.add(6);
        list.add(5);
        list.add(7);
        Collections.sort(list,Comparator.reverseOrder());
        System.out.println(list);
        System.out.println("max element: " + Collections.max(list));
        System.out.println("the frequency of element is : " + Collections.frequency(list, 2));

    }
}
