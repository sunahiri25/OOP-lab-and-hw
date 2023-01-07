public class SumAverageRunningInt {
    public static int using_for_loop(int LOWERBOUND, int UPPERBOUND) {
        // Use a for-loop to sum lowerbound to upperbound
        int sum = 0;
        for (int number = LOWERBOUND; number <= UPPERBOUND; ++number) {
            sum += number;
        }
        return sum;
    }

    public static int using_while_do_loop(int LOWERBOUND, int UPPERBOUND) {
        int sum = 0;
        int number = LOWERBOUND;
        while (number <= UPPERBOUND) {
            sum += number;
            ++number;
        }
        return sum;
    }

    public static int using_do_while_loop(int LOWERBOUND, int UPPERBOUND) {
        int sum = 0;
        int number = LOWERBOUND;
        do {
            sum += number;
            ++number;
        } while (number <= UPPERBOUND);
        return sum;
    }

    public static int sum_of_the_squares(int LOWEBOUND, int UPPERBOUND) {
        int sum = 0;
        for (int i = LOWEBOUND; i <= UPPERBOUND; i++) {
            sum += i * i;
        }
        return sum;
    }

    public static void two_sums(int LOWEBOUND, int UPPERBOUND) {
        int sumOdd = 0; // Accumulating sum of odd numbers
        int sumEven = 0; // Accumulating sum of even numbers
        int absDiff = 0; // Absolute difference between the two sums
        // Compute sums
        for (int number = LOWEBOUND; number <= UPPERBOUND; number++) {
            if (number % 2 == 1) {
                sumOdd += number;
            } else {
                sumEven += number;
            }
        }
        // Compute absolute Difference
        absDiff = Math.abs(sumOdd - sumEven);
        // Print results
        System.out.println("The sum of odd numbers from " + LOWEBOUND + " to " + UPPERBOUND + " is: " + sumOdd);
        System.out.println("The sum of even numbers from " + LOWEBOUND + " to " + UPPERBOUND + " is: " + sumEven);
        System.out.println("Their absolute difference is: " + absDiff);
    }

    public static void main(String[] args) {
        int sum;
        double average;
        final int LOWERBOUND = 1;
        final int UPPERBOUND = 100;
        sum = using_for_loop(LOWERBOUND, UPPERBOUND);
        // Compute average in double
        average = (double) sum / (UPPERBOUND - LOWERBOUND + 1);
        // Print sum and average
        System.out.println("The sum of " + LOWERBOUND + " to " + UPPERBOUND + " is " + sum);
        System.out.println("The average is " + average);
        // to sum from 111 to 8899, and compute the average.
        System.out.println("The sum of 111 to 8899 is " + using_while_do_loop(111, 8899));
        int count = 0;
        for (int i = 111; i <= 8899; i++) {
            ++count;
        }
        System.out.println("The average is " + using_while_do_loop(111, 8899) / count);
        // to find the "sum of the squares" of all the numbers from 1 to 100.
        System.out.println("The sum of the squares of all the numbers from 1 to 100 is " + sum_of_the_squares(LOWERBOUND, UPPERBOUND));
        two_sums(LOWERBOUND, UPPERBOUND);
    }
}
