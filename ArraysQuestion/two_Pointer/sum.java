package ArraysQuestion.two_Pointer;
import java.util.ArrayList;
import java.util.List; // <--- This fixes the "cannot be resolved" error
import java.util.Arrays;
public class sum{
    public static void main(String[] args) {
      int[] arr = {-1,0,1,2,-1,-4};
      // int[] arr = {-4,-1,-1,0,1,2};
     List<List<Integer>> ans = threeSum(arr);
     System.out.println(ans);
    }
    public static List<List<Integer>> threeSum(int[] arr) {
      List<List<Integer>> ans = new ArrayList<>();
      Arrays.sort(arr);
      for (int i = 0; i < arr.length-2; i++) {
        if (0<i && arr[i] == arr[i-1]) {
        continue;
        }
        int left = i+1;
        int right = arr.length-1;
        int sum = -1*arr[i];
        while (left<right) {
          int s = arr[left] + arr[right];
          if (sum==s) {
             ans.add(Arrays.asList(arr[i], arr[left],  arr[right]));
             while (left < right && arr[left] == arr[left+1]) {
               left++;
              }
              while (left < right && arr[right] == arr[right-1]) {
                right--;
              }
              left++;
              right--;
            }else if (sum>s) {
              left++;
            } else {
              right--;
            }
          }  
        }
        return ans;



    }

}
