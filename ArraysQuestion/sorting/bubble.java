package ArraysQuestion.sorting;

import java.util.Arrays;

import JAVA_Collection.list.stack;

public class bubble {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void sort(int[] arr){
       boolean swapped = false;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length-i; j++) {
                if (arr[j]<arr[j-1]) {
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                     arr[j-1]  = temp ;
                     swapped= true;
                 }
            }
            if (!swapped) {
                break;
            }
        }
    }
}
