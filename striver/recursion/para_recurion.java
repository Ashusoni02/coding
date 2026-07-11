package recursion;

import java.util.Scanner;

public class para_recurion {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("enter the digit: ");
        int n = sc.nextInt();
        re(n, 0);
    }

    public static void re(int i,int sum){
     if (i<1) {
        System.out.println(sum);
        return;
     }else{
        re(i-1, sum+i);
     }

    }
}
