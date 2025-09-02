package CWH;

public class array {
    public static void main(String[] args) {
        int[] marks = new int[5];
        //printing array normally
        marks[0] = 55;
        marks[1] = 13;
        marks[2] = 46;
        marks[3] = 11;
        marks[4] = 58;
        System.out.println(marks[4]);
        //printing an array using for loop
        System.out.println("printing an array using for loop");
        for(int i=0; i<marks.length;i++){
            System.out.println(marks[i]);
        }
        System.out.println("reversing an array using for loop");
        for (int i=marks.length - 1;i>=0;i--){
            System.out.println(marks[i]);
        }
        System.out.println("printing an array using for-each loop");
        for(int element : marks){
            System.out.println(element);
        }
    }
}
