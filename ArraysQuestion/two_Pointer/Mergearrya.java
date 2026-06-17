// leetcode.com/problems/squares-of-a-sorted-array/submissions/2003022415/
package ArraysQuestion.two_Pointer;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.Arrays;


class Solution {
    public static void main(String[] args) {
          int[] nums = {-4,-1,0,3,10};
      // int[] arr = {-4,-1,-1,0,1,2};
// int[] posg = ;
System.out.println(Arrays.toString(sortedSquares(nums)));
  
  
    }
    public static int[] sortedSquares(int[] nums) {
        int left = 0;
        int right = nums.length-1;
        int id = nums.length-1;
          int[] res = new int[nums.length];
          
          while (left<=right) {
            int leftsqa = nums[left]*nums[left];
            int rightsqa = nums[right]*nums[right];
            if (leftsqa>rightsqa) {
                res[id] = leftsqa;
                id--;
                left++;
            }else{
                res[id] = rightsqa;
                id--;
            right--;
                
            }
        }
       return res; 


}
}
