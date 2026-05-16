// leetcode.com/problems/squares-of-a-sorted-array/submissions/2003022415/
package ArraysQuestion.two_Pointer;

import java.util.Arrays;

class Solution {
    public static int[] sortedSquares(int[] nums) {
        
List<Integer> pos = new ArrayList<>();
List<Integer> neg = new ArrayList<>();   
    
    for (int i = 0; i < nums.length; i++) {

            int square = nums[i] * nums[i];

            if (nums[i] < 0) {
                neg.add(square);
            } else {
                pos.add(square);
            }
        }

        // Reverse negative part
        Collections.reverse(neg);
        
          int n1 = neg.size();
        int n2 = pos.size();
         int[] res= new int[n1 +n2];
  
          int i = 0;
          int j = 0;
          int id= 0;
          while (i <n1 && j <n2){
              if(neg.get(i)<=pos.get(j)){
                  res[id] = neg.get(i);
                  id++;
                  i++;     
              }else{
                  res[id] = pos.get(j);
                  id++;
                  j++;
              }
          }
          
          while (i <n1){
             res[id] = neg.get(i);
                  id++;
                  i++; 
          }
        while (j<n2){
             res[id] = pos.get(j);
                  id++;
                  j++; 
        }
          return res;
}
}
