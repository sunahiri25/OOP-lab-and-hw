import java.util.Scanner;

public class PerfectNumberList {
    public static void main(String[] args) {
        int upperBound;

        Scanner in = new Scanner(System.in);
        System.out.print("Enter the upper bound: ");
        upperBound = in.nextInt();
        in.close();

        System.out.println("These numbers are perfect:");
        printPerfect(upperBound);
        int numOfPerfect = countPerfect(upperBound);
        System.out.printf("\n[%d perfect numbers found (%.2f%%)]", numOfPerfect, (double) numOfPerfect / upperBound * 100);

        System.out.println("\nThese numbers are neither deficient nor perfect:");
        printNeitherDeficientNorPerfect(upperBound);
        int numOfNeitherDeficientNorPerfect = upperBound - numOfPerfect - countDeficient(upperBound);
        System.out.printf("\n[%d numbers found (%.2f%%)]", numOfNeitherDeficientNorPerfect, (double) numOfNeitherDeficientNorPerfect / upperBound * 100);
    }

    public static boolean isPerfect(int aPosInt) {
        return sumOfProperDivisors(aPosInt) == aPosInt;
    }

    public static boolean isDeficient(int aPosInt) {
        return sumOfProperDivisors(aPosInt) < aPosInt;
    }

    public static void printPerfect(int upperBound) {
        for (int i = 1; i < upperBound; i++) {
            if (isPerfect(i)) {
                System.out.print(i + " ");
            }
        }
    }

    public static void printNeitherDeficientNorPerfect(int upperBound) {
        for (int i = 1; i < upperBound; i++) {
            if (!isPerfect(i) && !isDeficient(i)) {
                System.out.print(i + " ");
            }
        }
    }

    public static int countPerfect(int upperBound) {
        int count = 0;
        for (int i = 1; i < upperBound; i++) {
            if (isPerfect(i)) {
                count++;
            }
        }
        return count;
    }

    public static int countDeficient(int upperBound) {
        int count = 0;
        for (int i = 1; i < upperBound; i++) {
            if (isDeficient(i)) {
                count++;
            }
        }
        return count;
    }

    public static int sumOfProperDivisors(int aPosInt) {
        int sum = 0;
        for (int i = 1; i < aPosInt; i++) {
            if (aPosInt % i == 0) {
                sum += i;
            }
        }
        return sum;
    }
}
