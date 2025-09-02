package HAsHING;

import java.util.HashSet;
import java.util.Iterator;

public class HAshing {

    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<Integer>();
        set.add(1);
        set.add(3);
        set.add(5);


        if (set.contains(1)){
            System.out.println("Set contains element");
        }

        if (!set.contains(2)){
            System.out.println("Set doesn't Contain element");
        }
        System.out.println(set);

        System.out.println("Size of set is : " +set.size());

        set.remove(1);
        System.out.println(set);

        Iterator it = set.iterator();

        while(it.hasNext());
        System.out.println(it.next());
    }
}
