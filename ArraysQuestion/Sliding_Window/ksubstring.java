package ArraysQuestion.Sliding_Window;

import java.util.HashMap;
import java.util.*;

public class ksubstring {
   public static void main(String[] args) {
      String st = "aabacbebebe";
      System.out.println(longestKSubstr(st, 3));
   }

   static int longestKSubstr(String st, int k) {
      // code here
      int low = 0;
      int res = -1;
      int n = st.length();
      HashMap<Character, Integer> map = new HashMap<>();
      for (int high = 0; high < n; high++) {
         char c = st.charAt(high);
         map.put(c, map.getOrDefault(c, 0) + 1);
         while (map.size() > k) {
            char leftchar = st.charAt(low);
            map.put(leftchar, map.get(leftchar) - 1);
            if (map.get(leftchar) == 0) {
               map.remove(leftchar);
            }
            low++;
         }
         if (map.size() == k) {
            res = Math.max(res, high - low + 1);
         }
      }
      return res;
   }

}
