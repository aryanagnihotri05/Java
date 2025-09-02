package DSAKK.CLL;

public class CLLIST {
    public static void main(String[] args) {
        CLL list = new CLL();
        list.insert(89);
        list.insert(73);
        list.insert(12);
        list.insert(45);
        list.display();
        list.delete(12);
        list.display();
    }
}
