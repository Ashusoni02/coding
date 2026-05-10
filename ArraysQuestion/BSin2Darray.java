package ArraysQuestion;

import java.util.Arrays;

public class BSin2Darray {
    public static void main(String[] args) {
        int[][] matrix = { { 1, 3, 5, 7 },
                { 10, 11, 16, 20 },
                { 23, 30, 34, 60 },
             };
        // int target = 16;
        // int ans = Matrix(matrix, target);
        System.out.println(Arrays.toString(Matrix(matrix, 16)));
    }

    static int[] Matrix(int[][] matrix, int target) {
        int r = 0;
        int c = matrix[0].length - 1;
        while (r < matrix.length && c >= 0) {
            if (target == matrix[r][c]) {
                return new int[] { r, c };
            }
            if (target > matrix[r][c]) {
                r++;
            } else {
                c--;

            }
        }
        return new int[] { -1, -1 };
    }
}
