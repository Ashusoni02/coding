package ArraysQuestion;
// https://leetcode.com/problems/find-peak-element/description/

public class peakelement {
    public static void main(String[] args) {
        int[] arr ={1,2,3,1};
        System.out.println(findPeakElement(arr));
    }
    static int findPeakElement(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] > arr[mid + 1]) {
                end = mid-1;
            } else {
                start = mid + 1;
            }
        }

        return arr[start];
    }
}

