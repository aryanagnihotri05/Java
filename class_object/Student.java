package class_object;

class Student {
    String name;
    String father_name;
    String mother_name;
    int age;
    int standard;
    int English;
    int Maths;
    int Science;
    int total;
    double percentage;


    public void getinfo() {
        System.out.println("Student's name: " + this.name);
        System.out.println("Father's name: " + this.father_name);
        System.out.println("Mother's name: " + this.mother_name);
        System.out.println("Age: " + this.age);
        System.out.println("Class: " + this.standard);
        System.out.println("English Score: " + this.English);
        System.out.println("Maths Score: " + this.Maths);
        System.out.println("Science Score: " + this.Science);
        System.out.println("TOTAL: " + this.total);
        System.out.println("PERCENTAGE: " + this.percentage);
    }
}
