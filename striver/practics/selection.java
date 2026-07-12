package practics;

import java.util.Arrays;

public class selection {
    public static void main(String[] args) {
           int nums[] = {2, 12, 67 , 4, 5, 9,};
        int n = nums.length;
        System.out.println(Arrays.toString(sort(nums,n)));
    }
    public static int[] sort (int[] arr ,int n){
        for (int i = 0; i < arr.length; i++) {
                int j =i;
                while (j>0 && arr[j-1]>arr[j]) {
                    int temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                    j--; 
                }
        }
        return arr;
    }
}
