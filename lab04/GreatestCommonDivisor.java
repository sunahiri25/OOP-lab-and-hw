public class GreatestCommonDivisor {
    public static void main(String[] args) {
        System.out.printf("GCD(%d,%d) = %d \n", 5, 15, gcd(5, 15));
        System.out.printf("GCD(%d,%d) = %d \n", 99, 88, gcd(99, 88));

    }

    public static int gcd(int a, int b) {
        int temp;
        if (a < b) {
            temp = a;
            a = b;
            b = temp;
        }

        while (b != 0) {
            temp = b;
            b = a % b;
            a = temp;
        }

        return a;
    }
}
