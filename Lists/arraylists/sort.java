package Lists.arraylists;

public class sort {

        void BubbleSort(int arr[]) {
            for (int i = 0; i < arr.length - 1; i++) {
                for (int j = 0; j < arr.length - 1; j++) {
                    if (arr[j] > arr[j + 1]) {
                        int temp = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = temp;

                    }
                }
            }
        }
            void printArray(int arr[]) {
                for (int i = 0; i < arr.length; ++i) {
                    System.out.print(arr[i] + " ");
                    System.out.println();

                }
            }

    public static void main(String[] args) {
            sort ob = new sort();
            int arr[] = {2,6,8,7,5};
            ob.BubbleSort(arr);
            ob.printArray(arr);

    }
}


