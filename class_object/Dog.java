package class_object;

public class Dog {
    String name;
    String breed;
    int age;
    String color;

    public Dog(String name, String breed, int age, String color) {
        this.name = name;
        this.breed = breed;
        this.age = age;
        this.color = color;
    }

    public String getName() {
        return this.name;
    }

    public String getBreed() {
        return this.breed;
    }

    public int getAge() {
        return this.age;
    }

    public String getColor() {
        return this.color;
    }

    public String toString() {
        String name1 = this.getName();
        return "Hi my name is " + name1 + " , My breed ,age and color are " + this.getBreed() + " , " + this.getAge() + " , " + this.getColor();
    }

    public static void main(String[] args) {
        Dog tuffy = new Dog("tuffy", "papillon", 5, "white");
        System.out.println(tuffy.toString());
    }
}
