package pattern;

public class pattern1 {

    public static void main(String[] args) {
        for(int i = 1; i <= 4; ++i) {
            for(int n = 1; n <= i; ++n) {
                System.out.print("*");
            }

            System.out.println();
        }

    }
}
