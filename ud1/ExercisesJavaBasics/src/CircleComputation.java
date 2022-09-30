import java.util.Scanner;

public class CircleComputation {
    public static void main(String[] args) {
        double radius, diameter, area, circumference;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the radius of a circle. It can have decimals(use , for decimals): ");
        radius = input.nextDouble();
        input.close();

        diameter = radius * 2;
        area = Math.PI * radius * radius;
        circumference = 2 * Math.PI * radius;

        System.out.println("For a circle with radius " + radius);
        System.out.println("The diameter is: " + diameter);
        System.out.println("The area is: " + area);
        System.out.println("The circumference is: " + circumference);

        
    }
}
