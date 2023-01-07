import java.util.Scanner;

public class TrigonometricSeries {
    public static void main(String[] args) {
        double[] x = {0, Math.PI / 6, Math.PI / 4, Math.PI / 3, Math.PI / 2};
        int numTerms;

        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of terms: ");
        numTerms = in.nextInt();
        in.close();

        for (double value : x) {
            System.out.println("Calculated values:");
            System.out.printf("sin(%d) = %.2f \n", (int) Math.round(value * 180 / Math.PI)
                    , sin(value, numTerms));
            System.out.printf("cos(%d) = %.2f \n", (int) Math.round(value * 180 / Math.PI)
                    , cos(value, numTerms));

            System.out.println("java.lang.Math values:");
            System.out.printf("sin(%d) = %.2f \n", (int) Math.round(value * 180 / Math.PI)
                    , Math.sin(value));
            System.out.printf("cos(%d) = %.2f \n", (int) Math.round(value * 180 / Math.PI)
                    , Math.cos(value));
        }
    }

    public static double computeTerm(double x, int numTerms) {
        double term = 1.0;
        for (int i = numTerms; i > 0; i--) {
            term *= x / i;
        }
        return term;
    }

    public static double sin(double x, int numTerms) {
        double result = 0.0;
        for (int i = 0; i < numTerms; i++) {
            result += (i % 2 == 0 ? 1 : -1) * computeTerm(x, (2 * i + 1));
        }
        return result;
    }

    public static double cos(double x, int numTerms) {
        double result = 0.0;
        for (int i = 0; i < numTerms; i++) {
            result += (i % 2 == 0 ? 1 : -1) * computeTerm(x, (2 * i));
        }
        return result;
    }
}
