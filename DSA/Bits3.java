package DSA;

import java.util.Scanner;

public class Bits3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int oper = sc.nextInt();
        int n = 5;
        int pos = 1;
        int BitMask = 1 << pos;
        int NewNumber;
        if (oper == 1) {
            NewNumber = BitMask | n;
            System.out.println(NewNumber);
        } else {
            NewNumber = BitMask & n;
            System.out.println(NewNumber);
        }

    }
}
