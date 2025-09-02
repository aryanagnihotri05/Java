package DSA;

public class Bits2 {
    public Bits2() {
    }

    public static void main(String[] args) {
        int n = 5;
        int pos = 2;
        int BitMask = 1 << pos;
        int Notbitmask = ~BitMask;
        int NewNumber = Notbitmask & n;
        System.out.println(NewNumber);
    }
}
