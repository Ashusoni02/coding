package practics;

import java.util.Arrays;

public class dub {
    public static void main(String[] args) {
        int[] a = {-1,-100,3,99};
        int k =2;
        int n = a.length-1;
        System.out.println(Arrays.toString(checkunique(a, n,k)));
    }
    public static int[] checkunique(int[] a ,int n ,int k){
            k= k%n;
             reverse(a, k+1,n);
            reverse(a, 0, k);
            reverse(a, 0,n);
            return a;
    }
       static void reverse(int[] a, int low ,int high){
       while(low<=high) {
        int temp = a[low];
        a[low] =a[high];
        a[high] = temp;
        low++;
        high--;}
        }
    }

