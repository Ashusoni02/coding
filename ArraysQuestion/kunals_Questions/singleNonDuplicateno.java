package ArraysQuestion;

public class singleNonDuplicateno {
    public static void main(String[] args) {
        int[] arr = { 1, 1, 2, 3, 3, 4, 4, 8, 8 };
  System.out.println(singleNonDuplicate(arr));
    }

    static int singleNonDuplicate(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            if (arr[start] == arr[start + 1]) {
                start = start + 1;
            }
        }
        return arr[start + 1];
    }
}
