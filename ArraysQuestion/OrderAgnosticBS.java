 package ArraysQuestion;
 
 public class OrderAgnosticBS{
    public static void main(String[] args) {
        //for accending order.
        // int[] arr = {-12,-11,-10,3,4,5,67,88,99,100};
        //for decending order.
        int[] arr= {15,14,13,13,12,11,5,4,3,1}; 
        int target = 11;
         int ans = Binarysearch(arr ,target);
        System.out.println(ans);
    }
        
  static int Binarysearch(int[] arr, int target){
     int start = 0;
     int end = arr.length-1;
     Boolean ACC = arr[start]< arr[end];
     while (start<=end) {
        //FINDING THE MID ELEMENT IN THE ARRAY.
        int mid = start + ( end -start)/2;
        if (target == arr[mid]){
            return mid;
        }
        if (ACC) {
         if (target<arr[mid]) {
         end =mid -1;
            
        } else {
          start = mid +1;
        }
    }
     
         else{
            if (target>arr[mid]) {
                
                end =mid -1;
            
            } else {
                start = mid +1;
     }
    
    }
}
     
     return -1;
    }
}
  