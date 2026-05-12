package sorting_in_Arrays;

import java.util.Arrays;

public class insertion {
    public static void main(String[] args) {
        int[] nums = { 1, 2, 5, 4, 3 };
        sorting(nums);
        System.out.println(Arrays.toString(nums));
    }

    static void sorting(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i+1; j < 0; j--) {
                if (nums[j] < nums[j - 1]) {
                    swapping(nums, j, j - 1);
                }
            }
        }
    }

    static void swapping(int[] nums, int first, int second) {
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }
}