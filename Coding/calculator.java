
import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int answer = 0;

     
        while (true) {
            System.out.print("Enter a operator :");
            char c = in.next().trim().charAt(0);
            if (c == '+' || c == '-' || c == '*' || c == '/' || c == '%') {
                // input number
                System.out.print("Enter first number: ");
                int num1 = in.nextInt();
                System.out.print("Enter second number: ");
                int num2 = in.nextInt();
                if (c == '+') {
                   answer = num1 + num2;
                   
                } else if (c == '-') {
                    answer = num1 - num2;
                    
                } else if (c == '*') {
                    answer = num1 * num2;
                    
                } else if (c == '/') {
                    if (num2 != 0) {
                        answer = num1 / num2;
                        
                    } 
                } else if (c == '%') {
                    if (num2 != 0) {
                        answer = num1 % num2;
                    }
                }

            }

            System.out.println("The output is: " + answer);
        }
    }
}
