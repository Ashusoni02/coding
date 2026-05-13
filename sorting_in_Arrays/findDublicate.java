package sorting_in_Arrays;

import java.util.ArrayList;

import java.util.List;

public class findDublicate {
    public static void main(String[] args) {
        int[] nums = {4,3,2,7,8,3,2,1};
        System.out.println(find(nums));
    }
    static List<Integer> find(int[] nums){
        int i = 0;
        while (i<nums.length) {
            
            int correct = nums[i] -1;
            if (nums[i] != nums[correct]) {
                swapping(nums, i, correct);
            }else{
                i++;
            }
        }

         List<Integer> ans = new ArrayList<>();
         for (int index = 0; index < nums.length; index++) {
            if (nums[index] != index +1) {
               ans.add(nums[index]);
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
