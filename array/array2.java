package array;

import java.util.Scanner;

public class array2 {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        String[] names = new String[size];

        int i;
        for(i = 0; i < size; ++i) {
            names[i] = sc.next();
        }

        for(i = 0; i < size; ++i) {
            System.out.println("name " + (i + 1) + " is: " + names[i]);
        }

    }
}
