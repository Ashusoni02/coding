package ArraysQuestion.two_Pointer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class q {
  // https://leetcode.com/problems/running-sum-of-1d-array/   
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
  System.out.println(Arrays.toString(runningSum(nums)));
    }
    static int[] runningSum(int[] nums){
        //  List<Integer> list = new ArrayList<>();
         for (int i = 1; i < nums.length; i++) {
            // list.add(nums[i]);
            nums[i] += nums[i-1];
         }
         return nums;
        //  return new int[]{list.get(i)};
    }
}
