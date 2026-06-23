
package ArraysQuestion.practics;
import java.util.*;

import practic_Questions.c;
public class dis {
         public static void main(String[] args) {
            int[] nums = {4,3,2,7,8,2,3,1};
            System.out.println(findDisappearedNumbers(nums));
         }
           public static List<Integer> findDisappearedNumbers(int[] nums) {
             ArrayList<Integer> list = new ArrayList<>();
             for (int j = 0; j < nums.length; j++) {
             int index = Math.abs(nums[j]) -1;
             if(nums[index] > 0){
                nums[index] = -nums[index];
             }
            }
             for (int i = 0; i < nums.length; i++) {
                if (nums[i]>0) {
                    list.add(i+1);
                }
             }
            return list;
    }
}