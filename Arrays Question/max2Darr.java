package Coding;

import java.util.Arrays;

public class max2Darr {
       public static void main(String[] args) {
        int[][] arr = { { 1, 2, 3 },
                { 4, 5, 8, 4 },
                { 5, 9, } };
        // int target = 8;
        int result = search(arr);
        System.out.println(result);
    }
 static int search(int[][] arr){
    int max=Integer.MIN_VALUE;
    for(int row= 0;row<arr.length;row++){
        for (int col= 0;col<arr[row].length;col++){
            if(arr[row][col]>max){
             max = arr[row][col];
            }
        }
    }
    return max;
}
}
