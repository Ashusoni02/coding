<<<<<<< HEAD
package ArraysQuestion.sorting;

public class binarysearch {
    public static void main(String[] args) {
        int[] arr = { 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int target = 6;
        int ans = Binarysearch(arr, target);
        System.out.println(ans);
    }

    static int Binarysearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target > arr[mid]) {
                start = mid + 1;

            } else if (target < arr[mid]) {
                end = mid - 1;

            } else {
                return mid;
            }
        }

        return -1;
    }
}
=======
package ArraysQuestion.sorting;

public class binarysearch {
    public static void main(String[] args) {
        int[] arr = { 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int target = 6;
        int ans = Binarysearch(arr, target);
        System.out.println(ans);
    }

    static int Binarysearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target > arr[mid]) {
                start = mid + 1;

            } else if (target < arr[mid]) {
                end = mid - 1;

            } else {
                return mid;
            }
        }

        return -1;
    }
}
>>>>>>> 1e38293c51807b9b4f87dc3a451d7b63fe2e7fbb
