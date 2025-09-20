package Leetcode;

import java.util.HashMap;
import java.util.Map;
import java.util.Arrays; // needed for printing arrays

public class problem_1 {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[] {map.get(complement), i};
            }
            map.put(nums[i], i);
        }
        return new int[] {}; // no solution
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 5, 9, 7, 5, 4};
        int target = 11;

        problem_1 problem1 = new problem_1();
        int[] result = problem1.twoSum(arr, target);

        // Print result
        if (result.length > 0) {
            System.out.println("Indices: " + Arrays.toString(result));
            System.out.println("Values: " + arr[result[0]] + " + " + arr[result[1]] + " = " + target);
        } else {
            System.out.println("No solution found.");
        }
    }
}
