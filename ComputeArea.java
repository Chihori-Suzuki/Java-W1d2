import java.util.Scanner;

public class ComputeArea {
    public static void main(String[] args) {

        final double pi = 3.14159;

        Scanner input = new Scanner(System.in);

        double radius = input.nextDouble();
        double length = input.nextDouble();
        double area = radius * radius * pi * length;

        System.out.println("the volume of a cylinder is: " + area + "cm3");

    }
}