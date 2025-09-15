package DSAKK.LL;

public class Main {
    public static void main(String[] args) {
        LL list1 = new LL();

        list1.insertLast(1);
        list1.insertLast(1);
        list1.insertLast(2);
        list1.insertLast(5);
        list1.insertLast(6);

        LL list2 = new LL();
        list2.insertLast(2);
        list2.insertLast(3);
        list2.insertLast(4);
        list2.insertLast(5);
        list2.insertLast(7);
        list2.insertLast(8);

        LL ans = LL.merge(list1,list2);
        ans.display();

//        list.display();
//        list.remove_duplicate_sorted2();
//        list.display();
//        list.display();
//        int val = list.deleteFirst();
//        System.out.println("Deleted: "+ val);
//        list.display();
//        list.insertLast(45);
//        list.insertLast(3);
//        list.insertMid(11,5);
//        int val1 = list.deleteFirst();
//        System.out.println("Deleted: "+ val1);
//        list.display();
//        int val = list.deleteLast();
//        System.out.println("Deleted: "+val);
//        list.display();
//        int n = list.delete(3);
//        System.out.println("Deleted: "+n);
//        list.display();
    }
}
