package sorting_in_Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class disappearing {
    public static void main(String[] args) {
        int[] nums = {4,3,2,7,8,2,3,1};
        // List<Integer> answIntegers = findmissingno(nums);
         System.out.println( (findmissingno(nums))); 
    }
    static  List<Integer> findmissingno(int[] nums){
        int  i =0;
        while (i<nums.length) {
         int corect = nums[i] -1; 
         if (nums[i] != nums[corect]) {
            swapping(nums, i, corect);
         }else{
            i++;
         }
            
        }
        List<Integer> ans = new ArrayList<>();
        for (int index = 0; index < nums.length; index++) {
            if (nums[index] != index+1) {
                ans.add(index+1);
            }
        }
        return ans;
    }
      static void swapping(int[] nums, int first, int second) {
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }
}
