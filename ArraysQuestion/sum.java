package ArraysQuestion;

import java.util.Arrays;

public class sum {
    public static void main(String[] args) {
        int[] arr = { 2, 7, 11, 15 };
        int target = 9;

        System.out.println(Arrays.toString(sums(arr, target)));
    }

    static int[] sums(int[] arr, int target) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] == target - arr[i]) {
               return new int[] { i, j };
                }
            }
        }
        return new int[] {};

    }
}
