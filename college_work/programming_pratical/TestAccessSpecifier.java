package college_work.programming_pratical;

public class TestAccessSpecifier {
    public static void main(String[] args) {
        AccessSpecifierDemo obj = new AccessSpecifierDemo();
        obj.display();
    }
}
class AccessSpecifierDemo {
    public int a = 10;          // Public
    private int b = 20;         // Private
    protected int c = 30;       // Protected
    int d = 40;                 // Default

    void display() {
        System.out.println("Public: " + a);
        System.out.println("Private: " + b);
        System.out.println("Protected: " + c);
        System.out.println("Default: " + d);
    }
}

