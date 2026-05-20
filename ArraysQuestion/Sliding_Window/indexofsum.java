package ArraysQuestion.Sliding_Window;

import java.util.Arrays;

public class indexofsum {
    public static void main(String[] args) {
          int[] arr = { 10, 20, 30, 40 };
    
        System.out.println(Arrays.toString(sum(arr)));
    }

    static int[] sum(int[] arr) {
        // Arrays.sort(arr);
        int low = 0;
        int high = 1;
     
        int[] result = new int[]{-1,-1};
        int sum =0; 
        for (int i = low; i <= high; i++) {

            sum = sum + arr[i];
        }
        while (high < arr.length) {
      
            
           
             result= new int[] {low,high}; 
            
            low++;
            high++;
            if (high == arr.length) {
                break;
            }
            sum = sum - arr[low - 1];
            sum = sum + arr[high];
        }
        return result;
    }
}
