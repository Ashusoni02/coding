package sorting_in_Arrays;

import java.util.Arrays;

public class misssingnumber {
    public static void main(String[] args) {
        int[] nums = {3,0,1};
        int ans = missing(nums);
          System.out.println(ans);
    }
   static  int missing(int[] nums) {
         int i = 0;
        while (i<nums.length) {
            int correct = nums[i];
            if (nums[i]<nums.length && nums[i]!= nums[correct]) {
                swapping(nums, i, correct);
            }else{
                i++;
            }
        } 
        for (int index = 0; index < nums.length; index++) {
            if (nums[index] != index) {
                return index;
            }
        }
        return nums.length;
    }
     static void swapping(int[] nums, int first, int second) {
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }
    }

