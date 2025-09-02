package Functions;

import java.util.Scanner;

public class addition {

    public static int calculatesum(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(calculatesum(a, b));
        int x = sc.nextInt();
        int y = sc.nextInt();
        System.out.println(calculatesum(x, y));
    }
}
