import java.util.Scanner;

public class CylinderComputation {
    public static void main(String[] args) {
        double radius, height;
        double baseArea, surfaceArea, volume;
        // Prompt and read inputs as "double"
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the radius: ");
        radius = in.nextDouble();
        System.out.print("Enter the height: ");
        height = in.nextDouble();
        in.close();
        // Compute base area, surface area and the volume of the cylinder
        baseArea = Math.PI * radius * radius;
        surfaceArea = 2.0 * Math.PI * radius + 2.0 * baseArea;
        volume = baseArea * height;
        // print the values rounded to 2 decimal places
        System.out.printf("Base area is: %.2f%n", baseArea);
        System.out.printf("Surface area is: %.2f%n", surfaceArea);
        System.out.printf("Volume is: %.2f%n", volume);
    }
}

