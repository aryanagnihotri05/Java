package Revision;

public class FindMin {

    public static void main(String[] args) {
        int[] arr = {18, 12, 7, 3, 14, 28};
        System.out.println(FindMinimum(arr));
    }
    static int FindMinimum(int[] arr){
        int ans = arr[0];
        for(int i = 0;i< arr.length;i++){
            if (ans < arr[i]){
                ans = arr[i];
            }
        }
        return ans;
    }
}
