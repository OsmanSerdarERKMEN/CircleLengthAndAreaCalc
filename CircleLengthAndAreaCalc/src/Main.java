import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double r;
        final double PI = 3.14;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your circle's radius: ");
        r = input.nextDouble();
        double area = (PI * r * r);
        double length = (2 * PI * r);
        System.out.println("Circle's area is: " + area + "cm2");
        System.out.println("Circle's area is: " + length + "cm");
    }
}