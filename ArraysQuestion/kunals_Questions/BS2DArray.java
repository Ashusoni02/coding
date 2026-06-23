package ArraysQuestion;

import java.util.Arrays;

public class BS2DArray {
    public static void main(String[] args) {
       int[][] matrix = {{ 1,4,7,11,15},{2,5,8,12,19},{3,6,9,16,22},{10,13,14,17,24},{18,21,23,26,30}};
       System.out.println(searchMatrix(matrix,58));
    }
    public static boolean searchMatrix(int[][] matrix, int target) {
        int r = 0;
        int c = matrix.length-1;
        while (r < matrix.length && c > 0) {
            if (target == matrix[r][c]) {
                return true;
            }
            if (matrix[r][c] < target) {
                r++;
            }else{
                c--;
            }
        }
        return false;
    }
}
