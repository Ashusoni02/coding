package ArraysQuestion.practics;

// import ArraysQuestion.maxwealth;

public class stock {
    public static void main(String[] args) {
        int[] n = {7,6,4,3,1};
        System.out.println(maxProfit(n));
    } 
    static int maxProfit(int[] n) {
        int minprice = Integer.MAX_VALUE;
        int maxprofit = 0;
        for (int i = 0; i < n.length; i++) {
               minprice = Math.min(minprice, n[i]);
            maxprofit = Math.max(maxprofit, n[i] - minprice);
        }
        return maxprofit;
    }
}
