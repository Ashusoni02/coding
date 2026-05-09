package ArraysQuestion;

public class rotationcountIndublicate {
     public static void main(String[] args) {
        // int[] arr = { 15, 18, 2, 3, 6, 12};
        // int[] arr = { 4,5,6,7,0,1,2};
        int[] arr = { 2,2,2,3,3,5,1};
        System.out.println(Innerrotationcount(arr)  );
    }
    static int Innerrotationcount (int[] arr) {
         int pivot = findpivot(arr); 
        return pivot+1;
        
    }
     static int findpivot(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            }
            if (mid > start && arr[mid] < arr[mid - 1]) {
                return mid - 1;
            }
        
           if(arr[mid]==arr[start] &&arr[mid]==arr[start]){
            if (arr[start]>arr[start+1]) {
                return start;
            }
            start++;
            if ( arr[end] < arr[end - 1]) {
                return end-1;
            }
             end -- ;
              } 
             else if(arr[start]<arr[mid] || arr[mid]==arr[start] && arr[mid]>arr[end]){
               start = mid + 1;
             }else{
                end = mid-1;
             }

            
             
        }
        return -1;
    }
}
