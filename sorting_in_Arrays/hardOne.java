package sorting_in_Arrays;
 // https://leetcode.com/problems/first-missing-positive/description/

public class hardOne {
    public static void main(String[] args) {
        int[] nums = {-1,1,3,4};
            System.out.println(finding(nums));
    }
    static int finding(int[] nums){
     int i = 0;
        while (i<nums.length) {
            
            int correct = nums[i] -1;
            if ( nums[i] > 0 && nums[i] <= nums.length && nums[i] != nums[correct]) {
                swapping(nums, i, correct);
            }else{
                i++;
            }
        }

        //  List<Integer> ans = new ArrayList<>();
         for (int index = 0; index < nums.length; index++) {
            if (nums[index] != index +1) {
            //    ans.add(nums[index], index +1);
              return index  +1; 
            }
         }
         return nums.length +1;
    }

     static void swapping(int[] nums, int first, int second) {
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
}
}