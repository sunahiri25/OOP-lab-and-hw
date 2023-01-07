import java.util.Scanner;

public class GradesStatistics {
    public static void main(String[] args) {
        // Declare variables
        final int numStudents;
        int[] grades;
        double averageGrade;
        int maxGrade, minGrade;
        // Prompt for the number of items and read the input as "int"
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        numStudents = in.nextInt();
        // Allocate the array
        grades = new int[numStudents];
        // Prompt and read the items into the "int" array, if array length > 0
        if (grades.length > 0) {
            for (int i = 0; i < grades.length; i++) {
                System.out.print("Enter the grade for student " + (i + 1) + ": ");
                grades[i] = in.nextInt();
            }
        }
        in.close();
        // Compute average, max and min
        averageGrade = average(grades);
        maxGrade = max(grades);
        minGrade = min(grades);
        // Print results
        System.out.println("The average is: " + String.format("%.2f", averageGrade));
        System.out.println("The minimum is: " + minGrade);
        System.out.println("The maximum is: " + maxGrade);
    }

    private static int max(int[] grades) {
        int max = grades[0];
        for (int i = 1; i < grades.length; i++) {
            if (grades[i] > max) {
                max = grades[i];
            }
        }
        return max;
    }

    private static int min(int[] grades) {
        int min = grades[0];
        for (int i = 1; i < grades.length; i++) {
            if (grades[i] < min) {
                min = grades[i];
            }
        }
        return min;
    }

    private static double average(int[] grades) {
        int sum = 0;
        double average;
        for (int grade : grades) {
            sum += grade;
        }
        average = (double) sum / grades.length;
        return average;
    }
}
