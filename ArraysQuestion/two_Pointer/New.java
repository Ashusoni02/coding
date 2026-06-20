package ArraysQuestion.two_Pointer;
 //  https://leetcode.com/problems/maximum-average-subarray-i/submissions/2039728156/
public class New {
    public static void main(String[] args) {
       int[] arr = {1,12,-5,-6,50,3};
       System.out.println(findUnsortedSubarray(arr, 4));
    }

    static double findUnsortedSubarray(int[] arr,int k) {
        int left  = 0;
        int right  = 0;
        int sum = 0;
       double maxValue = Double.NEGATIVE_INFINITY;       // intially the value is -infinity.
        while(right < arr.length){
          sum+= arr[right];
          if (right-left+1 == k) {
        maxValue = Math.max(maxValue, (double) sum / k);
        sum-= arr[left];
        left++;
          }
          right++;
        }
        return maxValue;
    }
}
