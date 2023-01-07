import java.util.Arrays;
import java.util.Scanner;

public class GradesStatistics2 {
    public static int[] grades;

    public static void main(String[] args) {
        readGrades(); // Read and save the inputs in static int[] grades
        System.out.print("The grades are: ");
        print(grades);
        System.out.println();
        System.out.println("The average is: " + String.format("%.2f", average(grades)));
        System.out.println("The median is: " + String.format("%.2f", median(grades)));
        System.out.println("The minimum is: " + min(grades));
        System.out.println("The maximum is: " + max(grades));
        System.out.println("The standard deviation is: " + String.format("%.2f", stdDev(grades)));
    }

    public static void readGrades() {
        int numStudents;
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
    }

    // Print the given int array in the form of [x1, x2, x3,..., xn]
    public static void print(int[] array) {
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            if (i == 0) {
                System.out.print(array[i]);
            } else {
                System.out.print(", " + array[i]);
            }
        }
        System.out.print("]");
    }

    // Return the average value of the given int[]
    public static double average(int[] array) {
        int sum = 0;
        double average;
        for (int grade : grades) {
            sum += grade;
        }
        average = (double) sum / grades.length;
        return average;
    }

    // Return the median value of the given int[]
    public static double median(int[] array) {
        Arrays.sort(array);
        if (array.length % 2 == 0) {
            return (double) (array[array.length / 2 - 1] + array[array.length / 2]) / 2;
        } else {
            return array[array.length / 2];
        }
    }

    // Return the maximum value of the given int[]
    public static int max(int[] array) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    // Return the minimum value of the given int[]
    public static int min(int[] array) {
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }

    // Return the standard deviation of the given int[]
    public static double stdDev(int[] array) {
        double mean = average(array);
        double stdDev = 0.0;
        for (int i : array) {
            double temp = Math.pow(i, 2) - Math.pow(mean, 2);
            stdDev += temp;
        }
        stdDev = Math.sqrt(1.0 / array.length * stdDev);
        return stdDev;
    }
}
