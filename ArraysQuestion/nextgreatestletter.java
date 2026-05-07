package ArraysQuestion;

import java.util.Arrays;

public class nextgreatestletter {
    public static void main(String[] args) {
        char[] letter = {'c','f','j'};
      char target = 'a';
      char ans =greatest(letter, target);
      System.out.println(ans);
    }
     // retrun the index of the smallest no. >=to the target'
    static char greatest(char[] letter,char target){
        int start = 0;
        int end = letter.length-1;
      
        while (start<=end) {
            int mid = start + (end -start)/2;   
            if (target<letter[mid]) {
                end = mid-1;
            }
            else {
                start = mid +1;
            }
           
        }

        return letter[start %  letter.length];
    }
}