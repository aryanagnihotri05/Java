package Leetcode;

public class problem_43 {

    public boolean isPalindrome(int x) {
        String str = String.valueOf(x);
        String rev = new StringBuilder(str).reverse().toString();

        if (str.equals(rev)){
            System.out.println(x + "is a Palindrome");
            return true;
        }
        else {
            System.out.println(x + "is not a Palindrome");
            return false;
        }

//        int original = num;
//        int reversed = 0;
//
//        while (num > 0) {
//            int digit = num % 10;      // get last digit
//            reversed = reversed * 10 + digit; // build reversed number
//            num /= 10;                 // remove last digit
//        }
//
//        if (original == reversed) {
//            System.out.println(original + " is a palindrome.");
//            return true;
//        } else {
//            System.out.println(original + " is not a palindrome.");
//            return false;
//        }
    }

    public static void main(String[] args) {

        problem_43 ans = new problem_43();
        ans.isPalindrome(12121);
    }
}
