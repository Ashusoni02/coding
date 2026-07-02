package college_work.programming_pratical;
public class TypeCastingDemo {
    public static void main(String[] args) {

        // Implicit Type Casting (Widening)
        int num = 100;
        double d = num;
        System.out.println("Implicit Type Casting:");
        System.out.println("Integer value: " + num);
        System.out.println("Double value: " + d);

        // Explicit Type Casting (Narrowing)
        double x = 99.99;
        int y = (int) x;
        System.out.println("\nExplicit Type Casting:");
        System.out.println("Double value: " + x);
        System.out.println("Integer value: " + y);
    }
}