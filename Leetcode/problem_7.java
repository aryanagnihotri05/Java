package Leetcode;

import java.util.Scanner;

public class problem_7 {

    public String multiply(String num1, String num2) {
        long x = Integer.parseInt(num1);
        long y = Integer.parseInt(num2);
        long res = x * y;
        String ans = String.valueOf(res);
        return ans;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String num1 = "123456789";
        String num2 = "987654321";
        problem_7 ans = new problem_7();
        System.out.println(ans.multiply(num1,num2));

    }
}
