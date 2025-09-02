package class_object;

import java.util.Scanner;

class Total {
    int Class1;
    int Class2;
    int Class3;
    int Class4;
    int Class5;
    int Class6;
    int Class7;
    int Class8;
    int Class9;
    int Class10;

    public void getinfo() {
        Scanner sc = new Scanner(System.in);
        System.out.println("CLASS: ");
        int a = sc.nextInt();
        if (a == 1) {
            System.out.println("Class 1st Marks: " + this.Class1);
        }

        if (a == 2) {
            System.out.println("Class 2nd Marks: " + this.Class2);
        }

        if (a == 3) {
            System.out.println("Class 3rd Marks: " + this.Class3);
        }

        if (a == 4) {
            System.out.println("Class 4th Marks: " + this.Class4);
        }

        if (a == 5) {
            System.out.println("Class 5th Marks: " + this.Class5);
        }

        if (a == 6) {
            System.out.println("Class 6th Marks: " + this.Class6);
        }

        if (a == 7) {
            System.out.println("Class 7th Marks: " + this.Class7);
        }

        if (a == 8) {
            System.out.println("Class 8th Marks: " + this.Class8);
        }

        if (a == 9) {
            System.out.println("Class 9th Marks: " + this.Class9);
        }

        if (a == 10) {
            System.out.println("Class 10th Marks: " + this.Class10);
        }

    }

    public void getpercentage(int Hindi, int English, int Maths, int Science, int Social_Studies, int IP) {
        float percentage = (float)((Hindi + English + Maths + Science + Social_Studies + IP) * 100 / 600);
        System.out.println(percentage);
    }
}
