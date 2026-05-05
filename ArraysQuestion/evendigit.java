package ArraysQuestion;

// https://leetcode.com/problems/find-numbers-with-even-number-of-digits/
public class evendigit {

    public static void main(String[] args) {
        int nums[] = { 12, 345, 2, 6, 7896 };
        // int ans =(findNumbers(nums))
        System.out.print("the number is :  "+(findNumbers(nums)));
    }

    // number of numbers that has even numbers of digits.
    static int findNumbers(int[] nums) {

        int count = 0;
        for (int num : nums) {
            if (even(num)) {
                count++;
            }

        }

        return count;
    }

    // it gives us the digit of no. is even of not.
    static boolean even(int num) {
        int numofdigit = digit(num);
        if (numofdigit % 2 == 0) {
            return true;
        }
        return false;

    }

    // it shows how many digits are in number.
    static int digit(int num) {
        int count = 0;
        while (num > 0) {
            count++;
            num = num / 10;

        }
        return count;
    }
}
