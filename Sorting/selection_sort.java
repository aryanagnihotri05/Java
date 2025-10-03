package Sorting;

public class selection_sort {

    static void  SelectionSort(int[] arr){
        int i, j;
        for (i = 0; i < arr.length - 1; i++){
            int min = i;
            for (j = i + 1; j < arr.length; j++){
                if(arr[j] < arr[min]){
                    min = j;
                }
            }

            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
    }


    static void printArray(int arr[]){
        int i;
        for (i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {64,25, 12, 22, 11};
        SelectionSort(arr);
        printArray(arr);

    }
}
