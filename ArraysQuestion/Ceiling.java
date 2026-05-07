package ArraysQuestion;

public class Ceiling {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,7,8};
        int target = 6;
        int ans =ceiling(arr, target);
        System.out.println(ans);
    }
     // retrun the index of the smallest no. >=to the target'
    static int ceiling(int[] arr,int target){
        int start = 0;
        int end = arr.length-1;
        if (target>arr[arr.length-1]) {
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

        return start;
    }
}

