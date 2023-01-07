import java.util.Scanner;

public class SphereComputation {
    public static void main(String[] args) {
        double radius;
        double surfaceArea, volume;
        // Prompt and read inputs as "double"
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the radius: ");
        radius = in.nextDouble();
        in.close();
        // Compute the volume and surface area of the sphere in double
        surfaceArea = 4 * Math.PI * radius * radius;
        volume = 4.0 / 3 * Math.PI * radius * radius * radius;
        // print the values rounded to 2 decimal places
        System.out.printf("Surface area is: %.2f%n", surfaceArea);
        System.out.printf("Volume is: %.2f%n", volume);
    }
}
