package ArraysQuestion;

import java.util.Arrays;

public class InfiniteArray {
    public static void main(String[] args) {
        int[] arr= {3,5,7,9,10,90,00,130,140,160,170};
        int target = 10;
        System.out.println(ans(arr, target));
    }
    static int ans(int[] arr, int target){
        int start =0;
        int end = 1;

        while (target>arr[end]) {
            int news= end+1;
            end = end + (end-start+1)*2;
            start =news;
        }
        return Binarysearch(arr, target, start, end);
    }
     static int Binarysearch(int[] arr, int target, int start,int end) {
      
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target > arr[mid]) {
                start = mid + 1;

            } else if (target < arr[mid]) {
                end = mid - 1;

            } else {
                return mid;
            }
        }

        return -1;
    }
}
