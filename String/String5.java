package String;

public class String5 {


    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Tony");
        System.out.println(sb);
        System.out.println(sb.charAt(0));
        sb.setCharAt(0, 'G');
        System.out.println(sb);
    }
}
