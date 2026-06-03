package JAVA_Collection.list;
import java.util.Collections;
import java.util.Stack;
public class stack {
    public static void main(String[] args) {
        Stack<Integer> sta = new Stack<>();
        sta.push(2);
        sta.push(1);
        sta.push(0);
        Collections.sort(sta);
        System.out.println(sta);
        System.out.println(sta.peek());
        sta.pop();
        System.out.println(sta);
    }
}
