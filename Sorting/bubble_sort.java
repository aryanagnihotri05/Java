package Sorting;

public class bubble_sort {

    static void BubbleSort(int[] arr){
        int i, j, temp;
        boolean swapped;
        for (i = 0; i < arr.length - 1; i++){
            swapped = false;
            for (j = 0; j < arr.length - 1 - i; j++){
                if (arr[j] > arr[j +1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) break;
        }
    }

    static void printArray(int arr[]){
        int i;
        for (i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    public static void main(String[] args) {

        int[] arr = {5, 6, 1, 3};
        BubbleSort(arr);
        printArray(arr);

    }
}
