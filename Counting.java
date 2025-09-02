import java.util.Random;

public class Counting {
    public static void main(String[] args) {
        int[] count = new int[10]; // Index 0 is unused
        Random random = new Random();

        while (true) {
            int number = random.nextInt(9) + 1; // Generates number from 1 to 9
            count[number]++;

            System.out.println("Generated: " + number);
            System.out.println("Current Counts:");
            for (int i = 1; i <= 9; i++) {
                System.out.print(i + "=" + count[i] + "  ");
            }
            System.out.println();

            try {
                Thread.sleep(500); // Delay to slow down output (optional)
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
