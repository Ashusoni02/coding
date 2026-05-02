

import java.util.Scanner;

import javax.print.DocFlavor.STRING;

// import javax.print.DocFlavor.STRING;

public class funtion {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = in.nextInt();
        boolean result = sum(num);
        System.out.println("Is the number an Armstrong number? " + result);
        for (int i = 0; i <= 999; i++) {
            if (sum(i)) {
                System.out.println(i + " is an Armstrong number.");
            }
        }
    }
   
static boolean sum(int num) {
   int n = num;
   int sum = 0;
   while (n>0) {
   int rem = n%10;
   sum = sum + rem*rem*rem; 
   n = n/10;
   }
    if (sum == num) {
        return true;
    
   }
   return false;
}
}
