public class Fibonacci {
    public static void main(String[] args) {
        int n = 3;
        int fn;
        int fnMinus1 = 1;
        int fnMinus2 = 1;
        int nMax = 20;
        int sum = fnMinus1 + fnMinus2;
        double average;
        System.out.println("The first " + nMax + " Fibonacci numbers are: ");
        System.out.print(fnMinus1 + " " + fnMinus2 + " ");
        while (n <= nMax) {
            fn = fnMinus1 + fnMinus2;
            sum += fn;
            System.out.print(fn + " ");
            // Increment  the index n and shift the numbers for the next iteration
            ++n;
            fnMinus2 = fnMinus1;
            fnMinus1 = fn;
        }
        // Compute and display the average
        average = (double) sum / nMax;
        System.out.println("\nThe average is " + average);
    }
}
