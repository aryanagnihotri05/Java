// You are given an array 'a' of size 'n'.
//Print the Next Greater Element(NGE) for every element.
//
//
//The Next Greater Element for an element 'x' is the first element on the right side of 'x' in the array, which is greater than 'x'.
//
//
//If no greater elements exist to the right of 'x', consider the next greater element as -1.

package interviews;

import java.util.Scanner;

public class ques2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr  = new int[n];
        int[] arr1  = new int[n];

        for (int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++){
            arr1[i] = -1;
        }

        for (int i = 0; i < n; i++){

            for (int j = i + 1; j < n; j++){
                if(arr[j] > arr[i]){
                    arr1[i] = arr[j];
                    break;
                }
            }
        }
        for (int i = 0; i < n; i++){
            System.out.println(arr1[i]);
        }
    }
}
