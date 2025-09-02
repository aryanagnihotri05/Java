package DSAKK.LL;

public class Main {
    public static void main(String[] args) {
        LL list = new LL();
        list.insertFirst(6);
//        list.display();
//        int val = list.deleteFirst();
//        System.out.println("Deleted: "+ val);
//        list.display();
        list.insertFirst(8);
        list.insertFirst(1);
        list.insertLast(45);
        list.insertLast(3);
        list.insertMid(11,5);
        list.display();
        int val1 = list.deleteFirst();
        System.out.println("Deleted: "+ val1);
        list.display();
        int val = list.deleteLast();
        System.out.println("Deleted: "+val);
        list.display();
        int n = list.delete(3);
        System.out.println("Deleted: "+n);
        list.display();
    }
}
