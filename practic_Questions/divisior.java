package practic_Questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class divisior {
    public static void main(String[] args) {
        int n = 36;
        System.out.println(Arrays.toString(divisors(n)));
    }
        public static int[] divisors(int n) {
         List<Integer> list = new ArrayList<>();
         for(int i = 1; i <= Math.sqrt(n); i++){
             list.add(i);
             if((n/i)!= i){
                 list.add(n/i);
                }
            }
            Collections.sort(list);      
            int[] ans = new int[list.size()]; 
      for(int i = 0; i < list.size(); i++){
      ans[i] = list.get(i);
      }
      return ans;
    }
}
