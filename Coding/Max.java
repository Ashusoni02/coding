package Coding;

public class Max {
 public static void main(String[] args) {
    int[] arr = {1, 2, 3, 4, 5};
    int maximum = maxrange(arr,0, 3);
    System.out.println("Maximum element in the array is: " +    maximum);
 }
 static int maxrange(int[] arr, int start, int end) {
    int max = arr[start];
    for (int i = start + 1; i <= end; i++) {
        if (arr[i] > max) {
            max = arr[i];
        }
    }
    return max;
 }   
}
