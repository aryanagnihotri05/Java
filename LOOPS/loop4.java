package LOOPS;

public class loop4 {

    public static void main(String[] args) {
        int num1 = 100;

        for(int i = 10; i >= 0; --i) {
            System.out.println(num1);
            num1 -= i;
        }

    }
}
