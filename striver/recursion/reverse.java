package recursion;

import java.util.Arrays;

public class reverse {
    public static void main(String[] args) {
        int arr[] = { 12, 4, 5, 3, 6 };
        System.out.println(Arrays.toString(re(arr, 0)));
    }

    public static int[] re(int[] arr, int i) {
        if (i >= arr.length/2) {
           return arr;
        }
         swapping(arr, i,arr.length-i-1);
        // int temp = arr[i];
        // arr[i] = arr[r];
        // arr[r] = temp;
        return re(arr, i + 1);
    }

    public static void swapping(int[] arr, int i, int r) {
        int temp = arr[i];
        arr[i] = arr[r];
        arr[r] = temp;
    }
}
