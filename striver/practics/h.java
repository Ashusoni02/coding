package practics;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class h {
   public static void main(String[] args) {
    int [] arr = {4,6,2,5,7,9,1,3};
    int n= arr.length-1;
   System.out.println(secondlargest(arr, n)); 
   System.out.println(secondsmallest(arr, n)); 
    
   } 
   public static int secondlargest(int[] arr, int n){
    int largest = arr[0];
    int slargest = -1;
    for (int i = 0; i <= n; i++) {
        if(arr[i]>largest){
            slargest = largest;
            largest = arr[i];
        }else if (arr[i]<largest && arr[i] >slargest) {
            slargest = arr[i];
        }
    }
    return slargest;
   }
   public static int secondsmallest(int[] arr, int n){
  int smallest = arr[0];
    int ssmallest = Integer.MAX_VALUE;
    for (int i = 0; i <= n; i++) {
        if(arr[i]<smallest  ){
            ssmallest = smallest;
            smallest = arr[i];
        }else if (arr[i]!= smallest && arr[i] <ssmallest) {
            ssmallest = arr[i];
        }
    }
    return ssmallest;
   }
}
