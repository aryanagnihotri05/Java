package pattern;

public class pattern4 {

    public static void main(String[] args) {
        for(int i = 1; i <= 4; ++i) {
            int j;
            for(j = 1; j <= 4 - i; ++j) {
                System.out.print(" ");
            }

            for(j = 1; j <= i; ++j) {
                System.out.print("*");
            }

            System.out.println();
        }

    }
}
