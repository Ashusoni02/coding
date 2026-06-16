package ArraysQuestion.two_Pointer;

import java.util.Arrays;

public class tsum {
    public static void main(String[] args) {
        int[] arr = {2,7,11,15};
        int target = 9;
        System.out.println(Arrays.toString(sum(arr, target)) );
    }
    static int[] sum(int[] arr, int target ){
          int i = 0;
        int j = arr.length - 1;

        while (i < j) {
            int sum = arr[i] + arr[j];

            if (sum == target) {
                return new int[]{i+1, j+1};
            } else if (sum < target) {
                i++;
            } else {
                j--;
            }
        }

        return new int[]{-1, -1};
    }
}
