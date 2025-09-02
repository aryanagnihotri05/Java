package LOOPS;

import java.util.Scanner;

public class loop9 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i = 1; i <= 10; ++i) {
            for(int j = 1; j <= n; ++j) {
                do {
                    --n;
                } while(n >= 1);

                System.out.print(n * i);
            }

            System.out.println("*");
        }

    }

}
