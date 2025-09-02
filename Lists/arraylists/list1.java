package Lists.arraylists;


import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

public class list1 {
    public static void main(String[] args)
    {

        LinkedList<Integer> arr1 = new LinkedList<>();
        arr1.add(0,45);
        arr1.add(1,34);
        arr1.add(2,54);
        System.out.println(arr1.size());
        ArrayList<Integer> arr = new ArrayList<Integer>();

        arr.add(2);
        arr.add(3);
        arr.add(7);
        arr.add(8);
        arr.add(5);
        arr.add(7);
        arr.add(19);
        arr.add(11);
        arr.add(3);
        arr.add(5);

        System.out.println(arr);

        arr.remove(5);
        System.out.println(arr);

        arr.add(6,0);
        System.out.println(arr);

        Collections.reverse(arr);
        System.out.println(arr);

        arr.set(3,14);
        System.out.println(arr);

    }
}
