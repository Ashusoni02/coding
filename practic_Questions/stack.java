package practic_Questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

public class stack {
    public static void main(String[] args) {
        int[] arr = { 1,2,1 };
        System.out.println(Arrays.toString(nextGreaterElements(arr)));
    }

    public static int[] nextGreaterElements(int[] arr) {
         Stack<Integer> sta = new Stack<>();
        int[] ans = new int[arr.length];
        Arrays.fill(ans, -1);
          int n = arr.length;
        for (int i = 0; i < n; i++) {
            int index = i % n;
            while (!sta.isEmpty() && arr[i] > arr[sta.peek()]) {
                ans[sta.pop()] = arr[i];
            }
            if (i < n) {
        sta.push(index);
          }
        }

        return ans;
    }
}
