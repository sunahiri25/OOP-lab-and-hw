import java.util.Scanner;

public class TestMatrix {
    public static void main(String[] args) {
        int[][] intMatrix1, intMatrix2, intMatrix3;
        double[][] doubleMatrix1, doubleMatrix2, doubleMatrix3;
        int rows, cols;

        System.out.print("Enter number of rows: ");
        Scanner sc = new Scanner(System.in);
        rows = sc.nextInt();
        System.out.print("Enter number of columns: ");
        cols = sc.nextInt();
        sc.close();

        intMatrix1 = new int[rows][cols];
        Matrix.createRandomMatrix(intMatrix1);
        System.out.println("The 1st integer matrix:");
        Matrix.print(intMatrix1);

        intMatrix2 = new int[rows][cols];
        Matrix.createRandomMatrix(intMatrix2);
        System.out.println("The 2nd integer matrix:");
        Matrix.print(intMatrix2);

        intMatrix3 = Matrix.createRandomMatrix(rows - 1, cols);
        System.out.println("The 3rd integer matrix:");
        Matrix.print(intMatrix3);

        doubleMatrix1 = new double[rows][cols];
        System.out.println("The 1st double matrix:");
        Matrix.createRandomMatrix(doubleMatrix1);
        Matrix.print(doubleMatrix1);

        doubleMatrix2 = new double[rows][cols];
        System.out.println("The 2nd double matrix:");
        Matrix.createRandomMatrix(doubleMatrix2);
        Matrix.print(doubleMatrix2);

        doubleMatrix3 = new double[cols][rows];
        System.out.println("The 3rd double matrix:");
        Matrix.createRandomMatrix(doubleMatrix3);
        Matrix.print(doubleMatrix3);

        System.out.println("The sum of 1st integer matrix and 2nd integer matrix:");
        Matrix.print(Matrix.add(intMatrix1, intMatrix2));

        System.out.println("The sum of 1st integer matrix and 3rd integer matrix:");
        Matrix.print(Matrix.add(intMatrix1, intMatrix3));

        System.out.println("The difference of 1st integer matrix and 2nd integer matrix:");
        Matrix.print(Matrix.subtract(intMatrix1, intMatrix2));

        System.out.println("The difference of 2nd integer matrix and 3rd integer matrix:");
        Matrix.print(Matrix.subtract(intMatrix2, intMatrix3));

        System.out.println("The product of 1st integer matrix and 3rd integer matrix:");
        Matrix.print(Matrix.multiply(intMatrix1, intMatrix2));

        System.out.println("The product of 2nd integer matrix and 3rd integer matrix:");
        Matrix.print(Matrix.multiply(intMatrix2, intMatrix3));

        System.out.println("The sum of 1st double matrix and 2nd double matrix:");
        Matrix.print(Matrix.add(doubleMatrix1, doubleMatrix2));

        System.out.println("The sum of 2nd double matrix and 3rd double matrix:");
        Matrix.print(Matrix.add(doubleMatrix2, doubleMatrix3));

        System.out.println("The difference of 1st double matrix and 2nd double matrix:");
        Matrix.print(Matrix.subtract(doubleMatrix1, doubleMatrix2));

        System.out.println("The difference of 1st double matrix and 3rd double matrix:");
        Matrix.print(Matrix.subtract(doubleMatrix1, doubleMatrix3));

        System.out.println("The product of 1st double matrix and 2nd double matrix:");
        Matrix.print(Matrix.multiply(doubleMatrix1, doubleMatrix2));

        System.out.println("The product of 1st double matrix and 3rd double matrix:");
        Matrix.print(Matrix.multiply(doubleMatrix1, doubleMatrix3));
    }
}
