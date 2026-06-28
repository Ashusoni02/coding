package practic_Questions;

import java.util.Stack;

public class ss {
    public static void main(String[] args) {
        String s ="([)]";
    }
    static boolean se(String s){
          Stack<Integer> sta = new Stack<>();
          for (int i = 0; i < s.length(); i++) {
              if (!sta.empty()) {
                 if (sta.contains(i)){
                
            }
            sta.push(i);
        }
          }
            
    }
}
