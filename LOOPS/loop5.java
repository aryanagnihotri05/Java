package LOOPS;

import java.util.Scanner;

public class loop5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arrMultipleTable = new int[n][10];
        int row = 1;
        int column = 1;

        int a;
        int b;
        for(a = 0; a < arrMultipleTable.length; ++a) {
            for(b = 0; b < arrMultipleTable[a].length; ++b) {
                arrMultipleTable[a][b] = row * column;
                ++column;
            }

            ++row;
            column = 1;
        }

        for(a = 0; a < arrMultipleTable.length; ++a) {
            for(b = 0; b < arrMultipleTable[a].length; ++b) {
                System.out.print(" " + arrMultipleTable[a][b] + "\t| ");
            }

            System.out.print("\n");
        }

    }
}
