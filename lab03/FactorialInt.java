public class FactorialInt {
    public static void main(String[] args) {
        int n = 1;
        while (Integer.MAX_VALUE / factorial(n - 1) >= n) {
            System.out.printf("The factorial of %d is %d\n", n, factorial(n));
            n++;
        }
        System.out.printf("The factorial of %d is out of range", n);
    }

    public static int factorial(int n) {
        int result = 1;
        for (int i = n; i > 0; i--) {
            result *= i;
        }
        return result;
    }
}
