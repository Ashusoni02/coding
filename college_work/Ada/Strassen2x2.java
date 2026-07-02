package college_work.Ada;

import java.util.Scanner;

public class Strassen2x2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] A = new int[2][2];
        int[][] B = new int[2][2];

        System.out.println("Enter elements of Matrix A:");
        for (int i = 0; i < 2; i++)
            for (int j = 0; j < 2; j++)
                A[i][j] = sc.nextInt();

        System.out.println("Enter elements of Matrix B:");
        for (int i = 0; i < 2; i++)
            for (int j = 0; j < 2; j++)
                B[i][j] = sc.nextInt();

        // Strassen's 7 multiplications
        int M1 = (A[0][0] + A[1][1]) * (B[0][0] + B[1][1]);
        int M2 = (A[1][0] + A[1][1]) * B[0][0];
        int M3 = A[0][0] * (B[0][1] - B[1][1]);
        int M4 = A[1][1] * (B[1][0] - B[0][0]);
        int M5 = (A[0][0] + A[0][1]) * B[1][1];
        int M6 = (A[1][0] - A[0][0]) * (B[0][0] + B[0][1]);
        int M7 = (A[0][1] - A[1][1]) * (B[1][0] + B[1][1]);

        // Calculate result matrix
        int C11 = M1 + M4 - M5 + M7;
        int C12 = M3 + M5;
        int C21 = M2 + M4;
        int C22 = M1 - M2 + M3 + M6;

        System.out.println("Resultant Matrix:");
        System.out.println(C11 + " " + C12);
        System.out.println(C21 + " " + C22);

        sc.close();
    }
}
