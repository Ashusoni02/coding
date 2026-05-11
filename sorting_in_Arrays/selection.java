package sorting_in_Arrays;

import java.util.Arrays;

public class selection {
    public static void main(String[] args) {
        int[]  nums = {1,2,5,4,3};
        // sortarray(nums);
        System.out.println(Arrays.toString(sortarray(nums)));
    }
    static int[]  sortarray(int[] nums){
      for(int i = 0; i < nums.length;i++ ){
        int last  = nums.length - i -1;
       int max =  maxindex(nums,0,last);
      swapping(nums,max,last);
      }
      return nums;
    }

    static void swapping(int[] nums, int first, int second){
        int  temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }
    static int maxindex(int[] nums, int start, int end){
       int max = start;
       for(int i = start; i <= end; i++){
        if(nums[max]< nums [i]){
             max = i;
        }
       }
       return max;
    }
}
