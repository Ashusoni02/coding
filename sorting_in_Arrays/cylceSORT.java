package sorting_in_Arrays;

import java.util.Arrays;

public class cylceSORT {
    public static void main(String[] args) {
        //   int[] nums = { 1, 2, 5, 4, 3 };
         int[] nums = {3,5,2,1,4};
          sorting(nums);
           System.out.println(Arrays.toString(nums));
    }
    static void sorting(int[] nums){
        int i = 0;
        while (i<nums.length) {
            int correct = nums[i] -1;
            if (nums[i]!= nums[correct]) {
                swapping(nums, i, correct);
            }else{
                i++;
            }
        } 
    }
     static void swapping(int[] nums, int first, int second) {
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }
}
