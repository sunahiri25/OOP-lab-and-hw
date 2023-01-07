import java.util.Scanner;

public class CircleComputation {
    public static void main(String[] args) {
        double radius, diameter;
        double circumference, area;
        // Prompt and read inputs as "double"
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the radius: ");
        radius = in.nextDouble();
        in.close();
        // Compute diameter, circumference and area
        diameter = 2.0 * radius;
        area = Math.PI * radius * radius;
        circumference = 2.0 * Math.PI * radius;
        // Print results
        System.out.printf("Diameter is: %.2f%n", diameter);
        System.out.printf("Circumference is: %.2f%n", circumference);
        System.out.printf("Area is %.2f%n", area);
    }
}
