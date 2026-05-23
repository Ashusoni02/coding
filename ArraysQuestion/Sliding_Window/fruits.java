import java.util.HashMap;

import ArraysQuestion.two_Pointer.closestsum;

public interface fruits {
    public static void main(String[] args) {
        int[] arr = {0,1,2,2};
        System.out.println(totalFruit(arr));
    }
    static int  totalFruit(int[] arr){
         int low = 0;
        int res = 0;
        int n = arr.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int high = 0; high < n; high++) {
                int k = arr[high];
                map.put(k,  map.getOrDefault(k, 0) +1);
                while (map.size()>2) {
                    int h = arr[low];
                    map.put(h,map.get(h)-1);
                    if (map.get(h) ==0) {
                        map.remove(h);
                    }
                    low++;

                }
                int len = high -low+1;
                res = Math.max(len,res );
        }
        return res;
    }
}
