package array;

import java.util.Scanner;

public class array1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] numbers = new int[size];

        int x;
        for(x = 0; x < size; x++) {
            numbers[x] = sc.nextInt();
        }
        System.out.println("Enter value to find in given array");

        x = sc.nextInt();
        for(int i = 0; i < size; ++i) {
            if (numbers[i] == x) {
                System.out.println("x found at index:" + i);
            }

        }
    }
}

