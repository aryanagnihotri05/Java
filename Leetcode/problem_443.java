package Leetcode;

public class problem_443 {

    public int compress(char[] chars) {
        int index = 0;
        int i = 0;

        while (i < chars.length) {
            char currentChar = chars[i];
            int count = 0;

            // count occurrences of current character
            while (i < chars.length && chars[i] == currentChar) {
                i++;
                count++;
            }

            chars[index++] = currentChar;

            if (count > 1){
                String str = String.valueOf(count);
                for (char c : str.toCharArray()){
                    chars[index++] = c;
                }
            }
        }
        return index;
    }

    public static void main(String[] args) {
        problem_443 prob = new problem_443();
        char[] arr = {'a','a','b','b','c','c','c'};

        System.out.println(prob.compress(arr));
    }
}
