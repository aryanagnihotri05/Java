package class_object;

class Triangle extends Shape {

    public void area(int h, int b) {
        System.out.println(b * h);
    }

    public static void main(String[] args) {
        Triangle sh = new Triangle();
        sh.area();
        sh.area(45,22);
    }
}
