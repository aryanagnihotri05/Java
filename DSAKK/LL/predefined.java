package DSAKK.LL;

import java.util.*;

public class predefined {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            LinkedList<String> list = new LinkedList<>();

            int n = sc.nextInt();
            sc.nextLine();

            for (int i = 0; i < n; i++) {
                String song = sc.nextLine();
                list.add(song);
            }

            Collections.reverse(list);

            for (String song : list) {
                System.out.print(song + " ");
            }

            sc.close();
        }
    }


