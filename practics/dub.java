package practics;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

import JAVA_Collection.list.stack;

public class dub {
    public static void main(String[] args) {
        int[] nums = {5, 2, 1, 4};
  System.out.println(missingNumber(nums));
    }
     public static int missingNumber(int[] nums) {
        int xor1 = 0;
        int xor2 = 0;
        int N= nums.length+1;
        int n = N-1;
        for (int i = 0; i < n; i++) {
            xor2 ^= nums[i] ;
            xor1 ^= (i+1); 
        }
      xor1 = xor1^N;
      return xor1^xor2;
    }
}