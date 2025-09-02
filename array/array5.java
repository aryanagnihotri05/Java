package array;

import java.util.Scanner;

public class array5 {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int columns = sc.nextInt();
        int[][] matrix = new int[rows][columns];

        int i;
        int j;
        for(i = 0; i < rows; ++i) {
            for(j = 0; j < columns; ++j) {
                matrix[i][j] = sc.nextInt();
            }
        }

        for(i = 0; i < rows; ++i) {
            for(j = 0; j < columns; ++j) {
                System.out.print(matrix[i][j] + " ");
            }

            System.out.println();
        }

    }
}
