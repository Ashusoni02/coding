
package ArraysQuestion.Sliding_Window;

public class Solution {
        public static void main(String[] args) {
          int[] arr = { 2,3,1,2,4,3 };
    
        System.out.println(minSubArrayLen(7,arr));
    }


static int minSubArrayLen(int target, int[] arr) {

        int low = 0;
        int high = 0;
        int sum = 0;

        int INF = Integer.MAX_VALUE;

        while (high < arr.length){ // compair for high not go out side the array.

            sum += arr[high];

            while (sum >= target) { // comparision the sum is greater than or equal  to the target 

                int len = high - low + 1;  // here we find the length of arr list.

                INF = Math.min(INF, len);

                sum = sum - arr[low];
                low++;
            }

            high++;
        }

        return INF == Integer.MAX_VALUE ? 0 : INF;
    }
}
