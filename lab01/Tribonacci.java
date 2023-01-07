public class Tribonacci {
    public static void main(String[] args) {
        int n = 4;
        int fn;
        int fnMinus1 = 1;
        int fnMinus2 = 1;
        int fnMinus3 = 2;
        int nMax = 20;
        System.out.println("The first " + nMax + " Tribonacci numbers are: ");
        System.out.print(fnMinus1 + " " + fnMinus2 + " " + fnMinus3 + " ");
        while (n <= nMax) {
            fn = fnMinus1 + fnMinus2 + fnMinus3;
            System.out.print(fn + " ");
            // Increment  the index n and shift the numbers for the next iteration
            n++;
            fnMinus1 = fnMinus2;
            fnMinus2 = fnMinus3;
            fnMinus3 = fn;
        }
    }
}
