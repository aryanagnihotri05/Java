package pattern;

public class pattern10 {

    public static void main(String[] args) {
        for(int i = 1; i <= 5; ++i) {
            int j;
            for(j = 1; j <= 5 - i; ++j) {
                System.out.print(" ");
            }

            for(j = i; j >= 1; --j) {
                System.out.print(j);
            }

            for(j = 2; j <= i; ++j) {
                System.out.print(j);
            }

            System.out.println();
        }

    }

}
