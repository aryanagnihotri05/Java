package Revision;

import java.util.Scanner;

public class fibonacci {
    static void fibonaacci(int count){
        int p = 0, q = 1;
        System.out.print(p + ", ");
        System.out.print(q + ", ");
        while(count>=3){

//            int fibo = q + p;
//            System.out.print(fibo+", ");
//            p = q;
//            q = fibo;

            int temp = q;
            q = p + q;
            System.out.print(q+", ");
            p = temp;

            count--;
        }
        System.out.print("..........");
        System.out.println();
    }
    static void nth_fibo(int count){
        int p = 0, q = 1;
        while (count>=3) {
            int temp = q;
            q = p + q;
            p = temp;
            count--;
        }
        System.out.println("nth of Fibonacci series is: "+q);
    }

    static void add(int count){
        int sum = 0;
        int p = 0, q = 1;
        while(count>=2){
            int temp = q;
            sum = sum + q;
            q = p + q;
            p = temp;
            count --;
        }
        System.out.println(sum);
    }

    public static void main(String[] args){
        // 0, 1, 1, 2, 3, 5, 8.........

        System.out.println("Enter a number of terms of fibonnaci series: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        fibonaacci(n);
        nth_fibo(n);
        add(n);
    }
}
