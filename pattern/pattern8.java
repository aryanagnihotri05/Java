package pattern;

public class pattern8 {


    public static void main(String[] args) {
        for(int i = 1; i <= 5; ++i) {
            int spaces = 5 - i;

            int j;
            for(j = 1; j <= spaces; ++j) {
                System.out.print(" ");
            }

            for(j = 1; j <= i; ++j) {
                System.out.print(j + " ");
            }

            System.out.println();
        }

    }
}
