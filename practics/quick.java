package practics;

import java.lang.reflect.Array;
import java.util.Arrays;

import ArraysQuestion.two_Pointer.q;

public class quick {
    public static void main(String[] args) {
        int [] arr = {4,6,2,5,7,9,1,3};
        int n = arr.length;
        qc(arr, 0, n-1);
        System.out.println(Arrays.toString(arr));
    }
    public static void qc(int[] arr, int low ,int high){
        if(low<high){
            int findpivot = pivot(arr,low, high);
            qc(arr, low, findpivot-1);
            qc(arr, findpivot+1,high);
        }
    }
    public static int pivot(int[] arr, int low ,int high){
         int piv = arr[low];
         int i = low;
         int j  = high;
         while (i<j) {
            while (arr[i]<=arr[piv] && i<high) {
                i++;
            }
            while (arr[j]>arr[piv] && j>low) {
                j--;
            }
            if (i<j) {
                swap(arr, i, j);
            }
         }
         swap(arr, j, piv);
         return j;
    }
    public static void swap (int[] arr, int low ,int high ){
        int temp = arr[low];
        arr[low] = arr[high];
        arr[high] = temp;
    }
}
