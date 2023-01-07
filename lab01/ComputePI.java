public class ComputePI {
    public static void main(String[] args) {
        double sum = 0.0;
        int MAX_DENOMINATOR = 10000;
        for (int denominator = 1; denominator <= MAX_DENOMINATOR; denominator += 2) {
            if (denominator % 4 == 1) {
                sum += 1.0 / denominator;
            } else if (denominator % 4 == 3) {
                sum -= 1.0 / denominator;
            } else {
                System.out.println("Impossible!!!");
            }
        }

        System.out.println("The value of pi is " + 4 * sum);
        // compare the values obtained and the Math.PI
        System.out.println("The values obtained = " + (4 * sum / Math.PI) * 100 + "% Math.PI");
        System.out.println(using_the_maximum_number_of_terms());
    }

    public static double using_the_maximum_number_of_terms() {
        int MAX_TERM = 10000;
        double sum = 0.0;
        for (int term = 1; term <= MAX_TERM; term++) {
            if (term % 2 == 1) {
                sum += 1.0 / (term * 2 - 1);
            } else {
                sum -= 1.0 / (term * 2 - 1);
            }
        }
        return 4 * sum;
    }
}
