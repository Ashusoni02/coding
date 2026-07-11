package recursion;

import java.util.Scanner;

public class funtion_rec {
     public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("enter the digit: ");
        int n = sc.nextInt();
        System.out.println( rer(n));
       
    }
    public static int rer(int n){
        if (n==0) {
            return 0;
        }else{
        return n * rer(n-1);  
        }
    }
}
