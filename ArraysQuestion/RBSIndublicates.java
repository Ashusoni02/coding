package ArraysQuestion;

import java.util.Arrays;

public class RBSIndublicates {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,2,1};
        int target = 5;
        System.out.println(search(arr,target));
    }

    static int search(int[] arr, int target) {
        int pivot = findpivot(arr);
        // if we dont find the pivot.
        if (pivot == -1) {
            // just do normal binary search.
            return Binarysearch(arr, target, 0, arr.length -1);
        }
        // if pivot is found
        if (arr[pivot] == target) {
            return pivot;
        }
        if (target >= arr[0]) {
            return Binarysearch(arr, target, 0, pivot - 1);
        }
        return Binarysearch(arr, target, pivot + 1, arr.length - 1);
    }

    static int Binarysearch(int[] arr, int target, int start, int end) {
        
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

    static int findpivot(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            }
            if (mid > start && arr[mid] < arr[mid - 1]) {
                return mid - 1;
            }
        
           if(arr[mid]==arr[start] &&arr[mid]==arr[start]){
            if (arr[start]>arr[start+1]) {
                return start;
            }
            start++;
            if ( arr[end] < arr[end - 1]) {
                return end-1;
            }
             end -- ;
              } 
             else if(arr[start]<arr[mid] || arr[mid]==arr[start] && arr[mid]>arr[end]){
               start = mid + 1;
             }else{
                end = mid-1;
             }

            
             
        }
        return -1;
    }

}
