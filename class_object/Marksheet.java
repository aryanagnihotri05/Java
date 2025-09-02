package class_object;

public class Marksheet {
    int Hindi;
    int English;
    int Maths;
    float Percentage;
    int Total;

    private void Setupmarks(int Hindi, int English, int Maths) {
        this.Hindi = Hindi;
        this.English = English;
        this.Maths = Maths;
    }

    private void printmarks() {
        System.out.println("Hindi:" + this.Hindi);
        System.out.println("English:" + this.English);
        System.out.println("Maths:" + this.Maths);
    }

    private void printtotal() {
        this.Total = this.Hindi + this.English + this.Maths;
        System.out.println("Total:" + this.Total);
    }

    private void printpercentage() {
        this.Percentage = (float)(this.Hindi + this.English + this.Maths) / 3.0F;
        System.out.println("Percentage:" + this.Percentage);
    }

    public static void main(String[] args) {
        Marksheet Aryan = new Marksheet();
        Aryan.Setupmarks(80, 65, 75);
        Aryan.printmarks();
        Aryan.printtotal();
        Aryan.printpercentage();
    }
}
