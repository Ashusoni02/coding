package college_work.programming_pratical;

class PolyDemo {

    public static void main(String[] args) {
        PolyDemo obj = new PolyDemo();

        obj.add(10, 20);
        obj.add(10, 20, 30);
    }

    void add(int a, int b) {
        System.out.println("Sum = " + (a + b));
    }

    void add(int a, int b, int c) {
        System.out.println("Sum = " + (a + b + c));
    }
}
