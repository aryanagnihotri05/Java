package class_object;

public class oops1 {

    public static void main(String[] args) {
        pen pen1 = new pen();
        pen1.color = "blue";
        pen1.type = "gel";
        pen pen2 = new pen();
        pen2.color = "black";
        pen2.type = "ballpoint";
        pen1.write();
        pen1.printColor();
        pen1.pentype();
        pen2.write();
        pen2.printColor();
        pen2.pentype();
    }
}

