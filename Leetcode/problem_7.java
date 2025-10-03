package Leetcode;

public class problem_7 {
    public int reverse(int x) {
        long reverse = 0;
        while (x != 0){
            long digit = x % 10;
            reverse = reverse * 10 + digit;
            x = x / 10;
        }
        return Math.toIntExact(reverse);
    }

    public static void main(String[] args) {
        problem_7 sol = new problem_7();
        int ans = sol.reverse(1534236469);
        System.out.println(ans);
    }
}
