package LOOPS;

import java.util.Scanner;

public class loop8 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean isprime = true;

        for(int i = 2; i <= n / 2; ++i) {
            if (n % i == 0) {
                isprime = false;
                break;
            }
        }

        if (isprime) {
            if (n == 1) {
                System.out.println("This is neither prime not composite");
            } else {
                System.out.println("This is a prime number");
            }
        } else {
            System.out.println("This is not a prime number");
        }

    }
}
