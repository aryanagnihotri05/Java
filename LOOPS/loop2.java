package LOOPS;

import java.util.Scanner;

public class loop2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cost = sc.nextInt();
        int income = sc.nextInt();
        if (income > cost) {
            System.out.println(income - cost);
        }

    }
}
