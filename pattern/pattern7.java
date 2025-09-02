package pattern;

public class pattern7 {



    public static void main(String[] args) {
        for(int i = 1; i <= 5; ++i) {
            int spaces = 5 - i;

            int j;
            for(j = 1; j <= spaces; ++j) {
                System.out.print(" ");
            }

            for(j = 1; j <= 5; ++j) {
                System.out.print("*");
            }

            System.out.println();
        }

    }
}
