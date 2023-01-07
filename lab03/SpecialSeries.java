import java.util.Scanner;

public class SpecialSeries {
    public static void main(String[] args) {
        double x;
        int numTerms;
        
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the value of x: ");
        x = in.nextDouble();
        System.out.print("Enter the number of terms: ");
        numTerms = in.nextInt();
        in.close();

        System.out.println("The sum of the series: " + specialSeries(x, numTerms));

    }

    public static double specialSeries(double x, int numTerms) {
        double res = 0.0;
        for (int i = 0; i < numTerms; i++) {
            res += computeTerm(x, 2 * i + 1);
        }
        return res;
    }

    public static double computeTerm(double x, int numTerms) {
        double term = Math.pow(x, numTerms) / numTerms;
        for (int i = 1; i < numTerms; i += 2) {
            term *= (double) i / (i + 1);
        }
        return term;
    }
}
