package Coding;

public class linearsearch {
    public static void main(String[] args) {
       int[] arr = {18, 12, -7, 3, 15 ,28};
       int target = 3;
       // Searching for the target element in the array using linear search algorithm.
         int result = search(arr, target ,1, 4);
         System.out.println("Target found at index: " + result);
        
        
    }
    // Linear search algorithm to find the index of the target element in the array.
    static int search(int[] arr, int target, int start, int end) {
        if (arr.length == 0) {
            return -1;
        }
        // Loop through the array from the specified start index to the end index and check if the target element is found.
        for (int i = start; i <= end; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }
}
