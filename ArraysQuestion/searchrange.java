package ArraysQuestion;

import java.util.Arrays;

public class searchrange {
    public static  void main(String[] args) {
     int[] arr ={1,2,2,2,3,3,4,5,6};
     int target =2;
     System.out.println(Arrays.toString(searchRange(arr,target)));
    }
    public static int[] searchRange(int[] arr, int target) {
        int[] ans = { -1, -1 };
        int start = search(arr, target,true);
        int end = search(arr, target,false);
        ans[0] =start;
        ans[1] =end;

        return ans;
    }
 

       static int  search(int[] arr, int target, boolean firststartindex) {
        int ans = -1;
        int start = 0;
        int end = arr.length - 1;
        // check for first occurance.
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target > arr[mid]) {
                start = mid + 1;

            } else if (target < arr[mid]) {
                end = mid - 1;

            } else {
                ans = mid;
                if (firststartindex) {
                    end = mid - 1;
                } else {
                    start = mid + 1;

                }
            }
        }
        return ans;
    }
}
