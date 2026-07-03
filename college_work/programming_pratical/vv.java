package college_work.programming_pratical;

class ScopeDemo {
    public static void main(String[] args) {
        ScopeDemo obj = new ScopeDemo();
        obj.display();
    }
    int instanceVar = 20;       // Instance variable
    static int staticVar = 30;  // Static variable

    void display() {
        int localVar = 10;      // Local variable

        System.out.println("Local Variable: " + localVar);
        System.out.println("Instance Variable: " + instanceVar);
        System.out.println("Static Variable: " + staticVar);
    }

}