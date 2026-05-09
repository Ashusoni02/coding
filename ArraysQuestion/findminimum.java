package ArraysQuestion;

class findminimum {
    public static void main(String[] args) {
        int[] arr = { 2, 2, 2, 0, 1 };
        System.out.println(findMin(arr));
    }

    static int findMin(int[] arr) {
        int pivot = findpivot(arr);
        // if we dont find the pivot.
        if (pivot == -1) {
            // just do normal binary search.
            return arr[0];
        }
        return arr[pivot + 1];
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
            else if (arr[start] < arr[mid] || (arr[start] == arr[mid] && arr[mid] > arr[end])) {

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