package ArraysQuestion.sorting;

import java.util.*;

public class ques {
    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagaram";
        System.out.println(isAnagram(s,t));
    }

    static boolean isAnagram(String s, String t) {
       if (s == null || t == null) {
        return false;
    }

    if (s.length() != t.length()) {
        return false;
    }

    char[] a = s.toCharArray();
    char[] b = t.toCharArray();

    Arrays.sort(a);
    Arrays.sort(b);

    return Arrays.equals(a, b);
    }

}
