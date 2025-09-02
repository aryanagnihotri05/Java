package Lists.arraylists;

import java.util.ArrayList;

public class arrlist1 {
    public static void main(String[] args) {


        ArrayList<Integer> set = new ArrayList<Integer>();

        set.add(1);
        set.add(3);
        set.add(8);
        set.add(9);
        set.add(1);

        System.out.println(set);

        set.add(2,85);

        System.out.println(set);
    }
}
