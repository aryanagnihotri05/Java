package class_object;

import java.util.Scanner;

public class class_object {
    int a;
    int b;


    void getdata() {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER FIRST NUMBER");
        a = sc.nextInt();
        System.out.println("ENTER SECOND NUMBER");
        b = sc.nextInt();
    }

    void putdata() {
        int c = a + b;
        System.out.println("ADDITION:" + c);
    }

    public static void main(String[] args) {
        class_object aa = new class_object();
        aa.getdata();
        aa.putdata();
    }
}
