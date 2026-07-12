package practics;

import java.util.Arrays;

public class bubble {
    public static void main(String[] args) {
        int nums[] = {2, 4, 5, 9, 12, 67 };
        int n = nums.length;
        System.out.println(Arrays.toString(sort(nums,n)));
    }

    static int[] sort(int[] nums,int n) {
        for (int i = n-1; i>=1; i--) {
            int didntswap = 0;;
            for (int j = 0; j <= i-1; j++) {
                if (nums[j] > nums[j+1]) {
                        int temp =  nums[j];
                        nums[j] = nums[j+1];
                        nums[j+1] = temp;
                    didntswap = 1;
                   
                }
                if(didntswap == 0){
                break;
                }
            }
        }
        return nums;
    }
}
    
    
    
    