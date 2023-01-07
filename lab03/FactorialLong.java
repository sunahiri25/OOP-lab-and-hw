public class FactorialLong {
    public static void main(String[] args) {
        int n = 1;
        while (Long.MAX_VALUE / factorial(n - 1) >= n) {
            System.out.printf("The factorial of %d is %d\n", n, factorial(n));
            n++;
        }
        System.out.printf("The factorial of %d is out of range", n);
    }

    public static long factorial(int n) {
        long result = 1;
        for (int i = n; i > 0; i--) {
            result *= i;
        }
        return result;
    }
}
