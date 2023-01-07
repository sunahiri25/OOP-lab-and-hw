import java.util.Scanner;

public class PerfectPrimeFactorList {
    public static void main(String[] args) {
        int upperBound;

        Scanner in = new Scanner(System.in);
        System.out.print("Enter the upper bound: ");
        upperBound = in.nextInt();
        in.close();

        System.out.println("These numbers are equal to the product of prime factors:");
        printPerfectPrimeFactor(upperBound);
        int numOfPerfectPrimeFactor = countPerfectPrimeFactor(upperBound);
        System.out.printf("\n[%d numbers found (%.2f%%)]", numOfPerfectPrimeFactor, (double) numOfPerfectPrimeFactor / upperBound);

    }

    public static boolean isProductOfPrimeFactors(int aPosInt) {
        if (aPosInt < 2) {
            return false;
        }
        int product = 1;
        for (int i = 2; i < aPosInt; i++) {
            if (aPosInt % i == 0 && PrimeList.isPrime(i)) {
                product *= i;
            }
        }
        return product == aPosInt;
    }

    public static void printPerfectPrimeFactor(int upperBound) {
        for (int i = 2; i < upperBound; i++) {
            if (isProductOfPrimeFactors(i)) {
                System.out.print(i + " ");
            }
        }
    }

    public static int countPerfectPrimeFactor(int upperBound) {
        int count = 0;
        for (int i = 2; i < upperBound; i++) {
            if (isProductOfPrimeFactors(i)) {
                count++;
            }
        }
        return count;
    }
}
