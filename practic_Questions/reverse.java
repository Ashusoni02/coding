package practic_Questions;

public class reverse {
    public static void main(String[] args) {
        int x = 1534236469; 
        System.out.println(reverse(x));
    }
        public static int reverse(int x) {
            int rev = 0;

    while (x != 0) {
        int rem = x % 10;
        x /= 10;

       // Check for overflow before multiplying by 10
        if (rev > Integer.MAX_VALUE / 10 ||
            (rev == Integer.MAX_VALUE / 10 && rem > 7)) {
            return 0;
        }

        // Check for underflow
        if (rev < Integer.MIN_VALUE / 10 ||
            (rev == Integer.MIN_VALUE / 10 && rem < -8)) {
            return 0;
        }
      
        rev = rev * 10 + rem;
    }

    return rev;

    }

}
