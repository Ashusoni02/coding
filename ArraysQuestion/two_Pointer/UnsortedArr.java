package ArraysQuestion.two_Pointer;

import java.util.Arrays;

public class UnsortedArr {
    public static void main(String[] args) {
        int[] arr = {3,2,4}; 
        int target = 6;
        System.out.println(Arrays.toString(twoSum(arr,target)));
    }
     public static int[] twoSum(int[] arr, int target) {
     for (int i = 0; i < arr.length; i++) {
        for (int j = i+1; j < arr.length; j++) {
            if (arr[i] == target - arr[j]) {
                return new int [] {i,j};
            }
        }
     }
     return new int [] {-1,-1};
    }
}
