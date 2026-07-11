package recursion;

import java.util.Arrays;
import java.util.Scanner;

public class sting {
       public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        System.out.print("enter the digit: ");
        int n = sc.nextInt();
         System.out.println(re(n));
    }
    public static int re(int n) {
      if (n<=1) {
        return n;
      }
    int  firstlast = re(n-1);
    int   secondlast = re(n-2);
    return firstlast+ secondlast;
    }
}
