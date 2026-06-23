package ArraysQuestion;

public class maxwealth {
    public static void main(String[] args) {
     int[][] accounts = {{1,2,3},{3,2,1}};
    //  int ans =maximunwealth(accounts);
     System.out.println(maximunwealth(accounts));
    }

   static int maximunwealth(int[][] accounts) {
        int max = Integer.MIN_VALUE;
        // visiting in each row of element. 
        for (int person = 0; person < accounts.length; person++) {
            int sum = 0;
            // visiting in each col of element. 
            for (int account = 0; account < accounts[person].length; account++) {
                //adding each elements in one row.
                sum += accounts[person][account];
            }
                // compairing sum with max value for getting the max value in that row.
                if (sum > max) {
                    max = sum;
                }
            }
       
        return max;
    }
}