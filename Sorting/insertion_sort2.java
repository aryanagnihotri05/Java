package Sorting;

public class insertion_sort2 {

    void sort(int[] arr){
        for(int i = 0; i < arr.length - 2; i++){

            for (int j = i+1; j >= 0; j--){
                if (arr[j] < arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
                else {
                    break;
                }
            }
        }
    }

    static void print(int[] arr){
        for (int i = 0; i < arr.length; i++){
            System.out.println(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int arr[] = { 12, 11, 13, 5, 6 };
        insertion_sort insertion = new insertion_sort();
        insertion.sort(arr);
        print(arr);
    }
}
