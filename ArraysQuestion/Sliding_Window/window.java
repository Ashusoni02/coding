package ArraysQuestion.Sliding_Window;

import java.util.Arrays;
  // https://leetcode.com/problems/minimum-size-subarray-sum/description/
public class window {
    public static void main(String[] args) {
        int[] arr = { 10, 20, 30, 40 ,7,5};
        System.out.println(sum(arr));   // we have to return the sum two no. of highest in the arr . 
        // System.out.println(Arrays.toString(sum(arr)));
    }

    static int sum(int[] arr) {
        // Arrays.sort(arr);
        int low = 0;
        int high = 1;
        int result = 0;
        // int[] result = new int[]{-1,-1};
        int sum = 0;
        for (int i = low; i <= high; i++) {     // loof for thw two ele in the arr list .

            sum += arr[i];    // sum of two first element in the arr. 
        }
        while (high < arr.length) {         // recusiveely cjheck the high doesnt go out of the length. 
            // result= new int[] {low,high};
            if (sum > result) {
               result = sum;
            }
            low++;
            high++;
            if (high == arr.length)   {    // checking the high doent go out of the bound
                break;   
            }
            sum = sum - arr[low - 1];
            sum = sum + arr[high];
        }
        return result;
    }
}
