package college_work.programming_pratical;

public class ExceptionHandlingDemo {
    public static void main(String[] args) {
        try {
            int a = 10;
            int b = 0;

            int c = a / b;   // Causes ArithmeticException
            System.out.println("Result = " + c);
        } catch (ArithmeticException e) {
            System.out.println("Exception Caught: Division by zero is not allowed.");
        }

        System.out.println("Program continues after exception handling.");
    }
}