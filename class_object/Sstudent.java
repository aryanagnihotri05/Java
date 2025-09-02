package class_object;

class Sstudent {
    String name;
    int age;
    int maths;
    int science;
    int total;
    float percentage;

    public void printinfo() {
        System.out.println(this.name);
        System.out.println(this.age);
        System.out.println(this.maths);
        System.out.println(this.science);
        System.out.println(this.total);
        System.out.println(this.percentage);
    }

    Sstudent(String name, int age, int maths, int science, int total) {
        this.name = name;
        this.age = age;
        this.maths = maths;
        this.science = science;
        this.total = maths + science;
        this.percentage = (float)(total * 100) / 200.0F;
    }
}