package ArraysQuestion.two_Pointer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.lang.Math;

public class closestsum {
    public static void main(String[] args) {
        int[] arr = { 0,0,0 };
        System.out.println(threeSum(arr, 1));
    }

    public static int threeSum(int[] arr, int target) {
        // List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(arr);
        int mindiff = Integer.MAX_VALUE;   //
        int closetsum = 0;
        for (int i = 0; i < arr.length - 2; i++) {
            // if (0 < i && arr[i] == arr[i - 1]) {
            //     continue;
            // }
            int left = i + 1;
            int right = arr.length - 1;

            // int sum = -1*arr[i];
            while (left < right) {
                int sum = arr[i] + arr[left] + arr[right];
                int diff = sum - target;
                int absdiff = Math.abs(sum - target);

                if (absdiff < mindiff) {
                    closetsum = sum;
                    mindiff =absdiff  ;
                }

                if (diff == 0) {
                    return sum;
                } else if (diff < 0) {

                    left++;
                } else {
                    right--;
                }

            }

        }
        return closetsum;
    }
}
