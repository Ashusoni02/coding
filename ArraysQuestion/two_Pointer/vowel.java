 package ArraysQuestion.two_Pointer;
public class vowel {
    public static void main(String[] args) {
        String s = "abciiidef";
        System.out.println(maxVowels(s, 3));
    }
 
 static int maxVowels(String s, int k) {
       int vowelcout = 0;
     int left = 0;
     int right = 0;
     int maxCount = 0;
     while(right<s.length()){
         if(isvowel(s.charAt(right))){
             vowelcout++;
         }
         if(right-left+1>k){
             if(isvowel(s.charAt(left))){
             vowelcout--;
             }
           left++;  
         }
         if(right-left+1 == k){
  maxCount = Math.max(maxCount,vowelcout);
         }
         right++;
     }
     return maxCount;
 }
    static boolean isvowel(char ch){
 return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }
}

