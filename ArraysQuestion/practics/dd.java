package ArraysQuestion.practics;

public class dd {
    public static void main(String[] args) {
        int [] nums = {3,0,1};
        System.out.println(missingNumber(nums));
    }
     static int missingNumber(int[] nums) {
        int len = nums.length;
        int sum = len*(len+1)/2;
        int numsum = 0;
        for(int i = 0; i < nums.length; i++) {
          numsum += nums[i];
            // if (rightsum == 0){
            // //   ans =-1;
            // }
        }
        return sum - numsum;
    }
}
