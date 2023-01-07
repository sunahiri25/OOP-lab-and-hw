import java.util.Scanner;

public class PrimeList {
    public static void main(String[] args) {
        int upperBound;

        Scanner in = new Scanner(System.in);
        System.out.print("Enter the upper bound: ");
        upperBound = in.nextInt();
        in.close();

        printPrime(upperBound);
        int numOfPrime = countPrime(upperBound);
        System.out.printf("[%d primes found (%.2f%%)]", numOfPrime, (double) numOfPrime / upperBound * 100);
    }

    public static boolean isPrime(int aPosInt) {
        if (aPosInt < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(aPosInt); i++) {
            if (aPosInt % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void printPrime(int upperBound) {
        for (int i = 1; i < upperBound; i++) {
            if (isPrime(i)) {
                System.out.println(i);
            }
        }
    }

    public static int countPrime(int upperBound) {
        int count = 0;
        for (int i = 1; i < upperBound; i++) {
            if (isPrime(i)) {
                count++;
            }
        }
        return count;
    }
}
