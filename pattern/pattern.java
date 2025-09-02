package pattern;

public class pattern {

    public static void main(String[] args) {
        for(int i = 1; i <= 5; ++i) {
            for(int n = 5; n >= i; n--) {
                System.out.print(n);
            }

            System.out.println();
        }

    }
}
