package striver;

import java.util.Scanner;

public class recursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter how many times you want to print the name: ");
        int n = sc.nextInt();
        // int  count = 0;
       re(n, 1); 
    }
    public static void re(int n,int i){
        if (i==n) {
            return;
        }else{
            re(n,i+1); 
        System.err.println(i);
        }               //it casued stack overflow.
    }
}
