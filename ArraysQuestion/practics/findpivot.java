package ArraysQuestion.practics;

public class findpivot {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        System.out.println(pivotIndex(arr));
    }
        public static int pivotIndex(int[] arr) {
        int leftsum = 0;
        int rightsum = 0;
        // int ans =0;
        for (int i = 0; i < arr.length; i++) {
            rightsum += arr[i];
            // if (rightsum == 0){
            // //   ans =-1;
            // }
        }
        // int i = 0;
        // int j = arr.length-1;
        for (int i = 0; i < arr.length; i++) {
            rightsum -= arr[i];
            if (leftsum == rightsum){
               return i;
            }
            leftsum += arr[i];
        }
        return -1;
    }
}
