class Solution {

    public static boolean search(int[] arr, int target) {
        int pivot = findpivot(arr);

        // If no pivot found, normal binary search
        if (pivot == -1) {
            return Binarysearch(arr, target, 0, arr.length - 1);
        }

        // If pivot itself is target
        if (arr[pivot] == target) {
            return true;
        }

        // Search in first half
        if (target >= arr[0]) {
            return Binarysearch(arr, target, 0, pivot - 1);
        }

        // Search in second half
        return Binarysearch(arr, target, pivot + 1, arr.length - 1);
    }

    static boolean Binarysearch(int[] arr, int target, int start, int end) {

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target > arr[mid]) {
                start = mid + 1;

            } else if (target < arr[mid]) {
                end = mid - 1;

            } else {
                return true;
            }
        }

        return false;
    }

    static int findpivot(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {

            int mid = start + (end - start) / 2;

            // Case 1
            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            }

            // Case 2
            if (mid > start && arr[mid] < arr[mid - 1]) {
                return mid - 1;
            }

            // Duplicates
            if (arr[mid] == arr[start] && arr[mid] == arr[end]) {

                if (start < end && arr[start] > arr[start + 1]) {
                    return start;
                }

                start++;

                if (end > start && arr[end] < arr[end - 1]) {
                    return end - 1;
                }

                end--;
            }

            // Left side sorted
            else if (arr[start] < arr[mid] ||
                    (arr[start] == arr[mid] && arr[mid] > arr[end])) {

                start = mid + 1;
            }

            // Right side sorted
            else {
                end = mid - 1;
            }
        }

        return -1;
    }
}
