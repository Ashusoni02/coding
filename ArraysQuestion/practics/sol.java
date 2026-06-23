package ArraysQuestion.practics;
import java.util.*;

import practic_Questions.c;
public class sol {
    public static void main(String[] args) {
       int[] nums = {3,2,3};
       System.out.println(majorityElement(nums)); 
    }
        public static int majorityElement(int[] nums) {
//    ArrayList<Integer> list = new ArrayList<>();
        int majority = nums[0];
        int count = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == majority) {
                count++;
            }else{
                count--;
            }
            if (count==0) {
                 majority =nums[i];
                 count =1;
            }
        }
        return majority;
    }
}
