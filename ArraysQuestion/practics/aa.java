package ArraysQuestion.practics;

import java.util.Arrays;

public class aa {
    public static void main(String[] args) {
        int[] arr = { 1, 1, 2 };
        System.out.println((removeDuplicates(arr)));
    }

    static int removeDuplicates(int[] arr) {
        int uniqe = 0;
      for (int i = 1; i < arr.length; i++) {
            if (arr[i] !=arr[uniqe]) {
                uniqe++;
                arr[uniqe] = arr[i];
            }
      }
      return uniqe + 1;
    }
}
