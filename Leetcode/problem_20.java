package Leetcode;

import java.util.Stack;

public class problem_20 {

        public boolean isValid(String s) {

            Stack<Character> stack = new Stack<>();
            for(char ch : s.toCharArray()){
                if (ch == '(' || ch == '{' || ch == '['){
                    stack.push(ch);
                }

                else {
                    if (stack.isEmpty()){
                        return false;
                    }

                    char top = stack.pop();

                    if (ch == ')' && top != '(') return false;
                    if (ch == '}' && top != '{') return false;
                    if (ch == ']' && top != '[') return false;
                }
            }
            return stack.isEmpty();
        }

    public static void main(String[] args) {


            String s = "([])";
        problem_20 prob = new problem_20();
        System.out.println(prob.isValid(s));
    }
}
