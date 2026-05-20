package ArraysQuestion.two_Pointer;
import java.util.Arrays;
public class Dutch_National {
  
    public static void main(String[] args) {
   int[] arr = {2,0,1};
   udnvd(arr);
   System.out.println(Arrays.toString((arr)));
   
    }
    static void udnvd(int[] arr){
        int mid = 0;
        int low = 0;
        int high = arr.length-1;
        while (mid <= high) {
         if (arr[mid]==0) {
            swapping(arr, low, mid);
            low++;
            mid++;
         }else if (arr[mid]==1) {
        //    swapping(arr, low, high);
        //    low++;
           mid++;
         }else  {
            swapping(arr, mid, high);
            high--;
         }
    }
}

   static void  swapping(int[] arr, int start,int end){
    int temp = arr[start];
    arr[start] = arr[end];
    arr[end] = temp;
    }
}

