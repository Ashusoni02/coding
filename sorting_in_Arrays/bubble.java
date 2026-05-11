package sorting_in_Arrays;

import java.util.Arrays;

public class bubble {
    public static void main(String[] args) {
        // int[]  nums = {1,2,5,4,3};
        int[]  nums = {1,2,3,4,5};

        System.out.println(Arrays.toString(bubblesort(nums)));
    }
    static int[]  bubblesort(int[] nums){
        boolean swapped;
       for(int i = 0; i < nums.length;i++ ){
        swapped = false;
        for(int j = 1; j < nums.length -i ;j++){
            if (nums[j] < nums[j - 1]) {
                int temp = nums[j];
               nums[j] = nums[j-1];
               nums[j-1] = temp;
               swapped = true;
            }
        }
        if (!swapped) {
            break;
        }
       }
       return nums;
    }
}
