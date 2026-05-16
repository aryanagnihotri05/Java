package DSA;

import java.util.*;

public class camelCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        StringBuilder word = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            // If uppercase letter and not first character → new word starts
            if (Character.isUpperCase(ch) && word.length() > 0) {
                printSwapped(word.toString());
                word.setLength(0); // reset
            }

            word.append(ch);
        }

        // Print last word
        if (word.length() > 0) {
            printSwapped(word.toString());
        }
    }

    // Function to swap case and print
    public static void printSwapped(String word) {
        StringBuilder result = new StringBuilder();

        for (char ch : word.toCharArray()) {
            if (Character.isLowerCase(ch)) {
                result.append(Character.toUpperCase(ch));
            } else {
                result.append(Character.toLowerCase(ch));
            }
        }

        System.out.println(result.toString());
    }
}
