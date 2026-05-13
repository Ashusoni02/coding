package ArraysQuestion.two_Pointer;

import java.util.Arrays;

public class Question {
    public static void main(String[] args) {
        int[] arr = { 2, 2, 4, 5 };
        int target = 9;
        System.out.println(Arrays.toString(find(arr, target)));
    }

    static int[] find(int[] arr, int target) {
        int i = 0;
        // int res = 1;
        int j = arr.length - 1;
        while (i < j) {
            int sum = arr[i] + arr[j];
            if (sum == target) {
                return new int[] { arr[i], arr[j] };
            }
            if (sum < target) {
                i++;
            }

            else {
                j--;
            }
        }
        return new int[] { -1, -1 };
    }
}
