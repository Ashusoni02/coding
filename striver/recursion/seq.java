package recursion;

import java.util.ArrayList;

public class seq {
    public static void main(String[] args) {
         int arr[] = { 12, 4, 5};
         int n = 3;
         ArrayList<Integer>  list = new ArrayList<>();
      te(0, list, arr, n);
    }
     static void te(int ind,ArrayList<Integer> list ,int[] arr, int n) {
        if(ind >= n){
            System.out.println(list);
            return;
        }
        list.add(arr[ind]);
        te(ind+1, list, arr,n); 
        list.remove(list.size() - 1);
        te(ind+1, list, arr,n); 
     }
}
