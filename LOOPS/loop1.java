package LOOPS;

public class loop1 {

    public static void main(String[] args) {
        int num1 = 100;
        int num2 = 10;
        do {
            System.out.println(num1);
            --num2;
            num1 -= num2;
        } while(num2 > 0);

    }
}
