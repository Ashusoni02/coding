package ArraysQuestion;

public class Floor {
     public static void main(String[] args) {
        int[] arr = {2,3,4,5,7,8};
        int target = 6 ;
        int ans =floor(arr, target);
        System.out.println(ans);
    }
    // retrun the index of the biggest no. <=to the target'
    static int floor(int[] arr,int target){
        int start = 0;
        int end = arr.length-1;
        if (target<arr[arr.length-1]) {
            return -1;
            
        }
        while (start<=end) {
            int mid = start + (end -start)/2;   
            if (target>arr[mid]) {
                start = mid +1;
            }
            else if (target<arr[mid]) {
             end = mid-1;
            }
            else{
                return mid;
            }
        }

        return end;
    }
}
