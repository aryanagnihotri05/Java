package DSAKK.DLL;

public class DLLIST {
    public static void main(String[] args) {
        DLL list = new DLL();
        list.insertFirst(5);
        list.insertFirst(88);
        list.insertLast(69);
        list.insertMid(11,1);
//        System.out.println("Deleted First Element: " + list.deleteFirst());
//        System.out.println("Deleted Last Element: "+ list.deleteLast());
        System.out.println("Deleted: "+ list.delete(3));
        list.display();

//        list.display();
    }
}
