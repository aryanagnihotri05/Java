package String;

public class  String6 {


    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Tony");
        System.out.println(sb);
        sb.insert(0, 'S');
        System.out.println(sb);
        sb.insert(3, 'n');
        System.out.println(sb);
        sb.delete(3, 4);
        System.out.println(sb);
    }
}
