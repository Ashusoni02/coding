package college_work.programming_pratical;

public class ClassDemo {
public static void main(String[] args) {
        Student s = new Student();   // Creating object

        s.rollNo = 101;
        s.name = "Rahul";

        s.display();
    }
}
class Student {
    int rollNo;
    String name;
    
    void display() {
        System.out.println("Roll No: " + rollNo);
        System.out.println("Name: " + name);
    }
}
