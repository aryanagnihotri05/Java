package DSA;

public class Bits1 {
    public Bits1() {
    }

    public static void main(String[] args) {
        int n = 5;
        int pos = 1;
        int bitMask = 1 << pos;
        int NewNumber = bitMask | n;
        System.out.println(NewNumber);
    }
}
