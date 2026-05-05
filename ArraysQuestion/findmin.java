package ArraysQuestion;

public class findmin {
    public static void main(String[] args) {
        int[] arr = {5, 6, 7, 8, 9, 1, 2, 3, 4};
        int result = minimum(arr);
        System.out.println("The minimum element in the rotated sorted array is: " + result);
    }
    static int minimum(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }
}
   