// https://www.scribd.com/document/883799828/Josh-Technology-Question-Set
package interviews;

import java.util.Arrays;
import java.util.Scanner;

public class ques1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner((System.in));
        int n = sc.nextInt();
        int arr[] = new int[n];
        int arr1[] = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
            arr1[i] = arr[i]*arr[i];
        }

        Arrays.sort(arr1);
        for (int i = 0; i < n; i++) {
            System.out.println(arr1[i]);
        }
    }
}
