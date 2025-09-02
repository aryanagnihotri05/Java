package class_object;

public class OOPS {

    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "abc";
        s1.father_name = "bcd";
        s1.mother_name = "cde";
        s1.age = 15;
        s1.standard = 9;
        s1.English = 93;
        s1.Maths = 96;
        s1.Science = 98;
        s1.total = s1.English + s1.Maths + s1.Science;
        s1.percentage = (double)((float)(s1.total * 100) / 300.0F);
        s1.getinfo();
    }
}

