public class ExercisesOnRecursion {
    public static void main(String[] args) {
        System.out.printf("factorial(%d) = %d \n", 4, factorial(4));
        System.out.printf("F(%d) = %d \n", 5, fibonacci(5));
        System.out.printf("len(%d) = %d \n", 12, lengthOfSn(12));
        System.out.printf("GCD(%d,%d) = %d \n", 12, 36, gcd(12, 36));
    }

    public static int factorial(int n) {
        return (n == 0) ? 1 : n * factorial(n - 1);
    }

    public static int fibonacci(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static int lengthOfSn(int n) {
        return (n == 1) ? 1 : lengthOfSn(n - 1) + numOfDigits(n);
    }

    public static int numOfDigits(int n) {
        return String.valueOf(n).length();
    }

    public static int gcd(int a, int b) {
        return (b == 0) ? a : gcd(b, a % b);
    }
}
