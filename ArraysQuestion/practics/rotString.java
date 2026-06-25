package ArraysQuestion.practics;
import java.util.*;
// import java.util.String;
public class rotString {
    public static void main(String[] args) {
      int[] nums1 = {1,2,3};
      int[] nums2 = {2,4};
        System.out.println(getCommon(nums1, nums2));
    }
    static int getCommon(int[] nums1, int[] nums2) {
        int i = 0;
        int j = 0;
        // int ans =0;
      while (i<nums1.length && j<nums2.length) {
        
        if(nums1[i] != nums2[j]){
            if (nums1[i] < nums2[j]) {
                i++;
            }else{
                j++;
            }
        }else{

            return nums1[i];
        }
    }
    return -1;
    }
}
