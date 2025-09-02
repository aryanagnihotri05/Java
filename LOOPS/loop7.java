package LOOPS;

import java.util.Scanner;

public class loop7 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;

        int i;
        for(i = 1; i <= n; ++i) {
            sum += i;
        }

        System.out.println("SUM OF N NUMBERS:" + sum);
        System.out.println("TABLE OF "+n+" IS");

        for(i = n; i <= n * 10; i += n) {
            System.out.println(i);
        }

        System.out.println("OR");

        for(i = 1; i < 11; ++i) {
            System.out.println(n+"X"+i+"="+i * n);
        }

    }
}
