package sorting_in_Arrays;
 // https://leetcode.com/problems/set-mismatch/submissions/2001981903/
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class finderrornum {
    public static void main(String[] args) {
          int[] nums = {1,2,2,4};
        System.out.println(Arrays.toString(solving(nums)));
        
        
    }
    static int[] solving(int[] nums) {

        int i = 0;
        while (i<nums.length) {
            
            int correct = nums[i] -1;
            if (nums[i] != nums[correct]) {
                swapping(nums, i, correct);
            }else{
                i++;
            }
        }

        //  List<Integer> ans = new ArrayList<>();
         for (int index = 0; index < nums.length; index++) {
            if (nums[index] != index +1) {
            //    ans.add(nums[index], index +1);
              return new int[]{nums[index], index +1}; 
            }
         }
         return new int[]{-1,-1};
    }

     static void swapping(int[] nums, int first, int second) {
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }
}
