package array;

import java.util.Scanner;

public class array6 {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int columns = sc.nextInt();
        int[][] matrix = new int[rows][columns];

        int x;
        int i;
        for(x = 0; x < rows; ++x) {
            for(i = 0; i < columns; ++i) {
                matrix[x][i] = sc.nextInt();
            }
        }

        x = sc.nextInt();

        for(i = 0; i < rows; ++i) {
            for(int j = 0; j < columns; ++j) {
                if (matrix[i][j] == x) {
                    System.out.println("x found at loacation (" + i + "," + j + ")");
                }
            }
        }

    }
}
