public class TribonacciInt {
    public static void main(String[] args) {
        int n = 0;
        while (Integer.MAX_VALUE - tribonacci(n - 1) - tribonacci(n - 2) >= tribonacci(n - 3)) {
            System.out.printf("T(%d) = %d\n", n, tribonacci(n));
            n++;
        }
        System.out.printf("T(%d) is out of int", n);
    }

    public static int tribonacci(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1 || n == 2) {
            return 1;
        }
        int a = 0, b = 1, c = 1, d = 0;
        while (n-- > 2) {
            d = a + b + c;
            a = b;
            b = c;
            c = d;
        }
        return d;
    }
}
