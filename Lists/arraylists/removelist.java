package Lists.arraylists;

import java.util.ArrayList;

public class removelist {
    public static void main(String[] args) {

        ArrayList<Integer> arr = new ArrayList<>();

        arr.add(2);
        arr.add(3);
        arr.add(5);
        arr.add(6);
        arr.add(3);
        arr.add(5);
        arr.add(3);

        System.out.println(arr);

        //Removing elements form index
        arr.remove(1);
        System.out.println(arr);

        arr.remove(Integer.valueOf(3));
        System.out.println(arr);

        
    }
}
