
// Take pi to be 3.1428
import java.util.Scanner;

class main {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter radius");
        double radius = myObj.nextDouble();
        double pi = 3.1428;
        double area = pi*(radius*radius);
        System.out.println("Area of circle is: " + area);
    }
}