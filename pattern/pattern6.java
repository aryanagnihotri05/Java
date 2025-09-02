package pattern;

public class pattern6 {


    public static void main(String[] args) {
        int i;
        int spaces;
        int j;
        for(i = 1; i <= 4; ++i) {
            for(spaces = 1; spaces <= i; ++spaces) {
                System.out.print("*");
            }

            spaces = 2 * (4 - i);

            for(j = 1; j <= spaces; ++j) {
                System.out.print(" ");
            }

            for(j = 1; j <= i; ++j) {
                System.out.print("*");
            }

            System.out.println();
        }

        for(i = 4; i >= 1; --i) {
            for(spaces = 1; spaces <= i; ++spaces) {
                System.out.print("*");
            }

            spaces = 2 * (4 - i);

            for(j = 1; j <= spaces; ++j) {
                System.out.print(" ");
            }

            for(j = 1; j <= i; ++j) {
                System.out.print("*");
            }

            System.out.println();
        }

    }
}
