import java.util.Scanner;

public class AverageWithInputValidation {
    public static void main(String[] args) {
        // Declare constant 
        final int NUM_STUDENTS = 3;
        // Declare variables
        int numberIn;
        boolean isValid; // boolean flag to control the input validation loop 
        int sum = 0;
        double average = 0.0;
        for (int studentNo = 1; studentNo <= NUM_STUDENTS; ++studentNo) {
            // Prompt user for mark with input validation
            Scanner in = new Scanner(System.in);
            isValid = false; // reset assuming is not valid
            do {
                System.out.print("Enter the mark (0-100) for student " + studentNo + ": ");
                numberIn = in.nextInt();
                if (0 <= numberIn && numberIn <= 100) {
                    isValid = true;
                } else {
                    System.out.println("Invalid input, try again...");
                }
            } while (!isValid);
            sum += numberIn;
            average = (double) sum / NUM_STUDENTS;
        }
        System.out.printf("The average is: %.2f%n", average);
    }
}
