public class FibonacciInt {
    public static void main(String[] args) {
        int n = 0;
        while (Integer.MAX_VALUE - fibonacci(n - 1) >= fibonacci(n - 2)) {
            System.out.printf("F(%d) = %d\n", n, fibonacci(n));
            n++;
        }
        System.out.printf("F(%d) is out of int", n);
    }

    public static int fibonacci(int n) {
        if (n == 0) {
            return 1;
        }
        // Fibonacci Series using Binet Formula
        double a = Math.pow(((1 + Math.sqrt(5)) / 2), n);
        double b = Math.pow(((1 - Math.sqrt(5)) / 2), n);
        return (int) ((a - b) / Math.sqrt(5));
    }
}
