package ArraysQuestion.two_Pointer;

import java.util.Arrays;

public class twopointer {
    public static void main(String[] args) {
        int[] arr = { 1, 1, 1, 2, 2, 3, 3, 4, 4, };
        // int ans = sol(arr);
        System.out.println(sol(arr));
    }

    static int sol(int[] arr) {
        int i = 0;
        int res = 1;
        int j = 1;
        while (j < arr.length) {
            if (arr[j] == arr[j - 1]) {

                j++;
            } else {
                arr[i + 1] = arr[j];
                i++;
                res++;
                j++;
            }

        }
        return res;
    }
}
