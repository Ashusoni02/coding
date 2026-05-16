package ArraysQuestion.two_Pointer;
import java.util.Arrays;
public class sum_smaller_than_target {
    public static void main(String[] args) {
          int[] arr = {5, 1, 3, 4, 7};
        System.out.println(sum(arr, 12));
    }
    static int sum(int[] arr, int target){
        Arrays.sort(arr);
        int ans =0;
    for (int i = 0; i < arr.length - 2; i++) {
            if (0 < i && arr[i] == arr[i - 1]) {
                continue;
            }
            int left = i + 1;
            int right = arr.length - 1;
            while (left<right){
                
                int sum = arr[i] + arr[left] + arr[right];
             if (sum>= target) {
                 right--;
                 
             }else{
                     ans = ans +(right-left);
                     left++;
             }
            }
    }
    return ans;
}
}
