package Leetcode;

public class problem_4 {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

        int m = nums1.length;
        int n = nums2.length;
        int i = 0, j = 0, k = 0;
        int[] merged = new int[m + n];
        while(i < m && j < n){
            if(nums1[i] < nums2[j]){
                merged[k++] = nums1[i++];
            }
            else {
                merged[k++] = nums2[j++];
            }
        }
        while (i < m){
            merged[k++] = nums1[i++];
        }
        while (j < n){
            merged[k++] = nums2[j++];
        }

        int total = m + n;

        if (total % 2 == 0){
            return (merged[total / 2 - 1] + merged[total / 2]) / 2.0;
        }
        else {
            return merged[total/2];
        }
    }

    public static void main(String[] args) {
        problem_4 problem4 = new problem_4();
        int[] num1 = {1, 2};
        int[] num2 = {3,4,5,6,};
        System.out.println(problem4.findMedianSortedArrays(num1, num2));

    }
}
