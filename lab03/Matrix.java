public class Matrix {

    // Method signatures
    public static void createRandomMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j] = (int) (Math.random() * 20);
            }
        }
    }

    public static void createRandomMatrix(double[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j] = Math.random() * 20;
            }
        }
    }

    public static int[][] createRandomMatrix(int rows, int cols) {
        int[][] matrix = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = (int) (Math.random() * 20);
            }
        }
        return matrix;
    }


    public static void print(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.printf("%5s", matrix[i][j]);
            }
            System.out.println();
        }
    }

    public static void print(double[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.printf("%7.2f", matrix[i][j]);
            }
            System.out.println();
        }
    }

    // Used in add(), subtract()
    public static boolean haveSameDimension(int[][] matrix1, int[][] matrix2) {
        return matrix1.length == matrix2.length && matrix1[0].length == matrix2[0].length;
    }

    public static boolean haveSameDimension(double[][] matrix1, double[][] matrix2) {
        return matrix1.length == matrix2.length && matrix1[0].length == matrix2[0].length;
    }

    public static int[][] add(int[][] matrix1, int[][] matrix2) {
        int[][] sumMatrix = new int[0][];
        if (!haveSameDimension(matrix1, matrix2)) {
            System.out.println("Two matrices do not have the same dimensions!");
            return sumMatrix;
        }
        sumMatrix = new int[matrix1.length][matrix1[0].length];
        for (int i = 0; i < sumMatrix.length; i++) {
            for (int j = 0; j < sumMatrix[0].length; j++) {
                sumMatrix[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        return sumMatrix;
    }

    public static double[][] add(double[][] matrix1, double[][] matrix2) {
        double[][] sumMatrix = new double[0][];
        if (!haveSameDimension(matrix1, matrix2)) {
            System.out.println("Two matrices do not have the same dimensions!");
            return sumMatrix;
        }
        sumMatrix = new double[matrix1.length][matrix1[0].length];
        for (int i = 0; i < sumMatrix.length; i++) {
            for (int j = 0; j < sumMatrix[0].length; j++) {
                sumMatrix[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        return sumMatrix;
    }

    public static int[][] subtract(int[][] matrix1, int[][] matrix2) {
        int[][] subMatrix = new int[0][];
        if (!haveSameDimension(matrix1, matrix2)) {
            System.out.println("Two matrices do not have the same dimensions!");
            return subMatrix;
        }
        subMatrix = new int[matrix1.length][matrix1[0].length];
        for (int i = 0; i < subMatrix.length; i++) {
            for (int j = 0; j < subMatrix[0].length; j++) {
                subMatrix[i][j] = matrix1[i][j] - matrix2[i][j];
            }
        }
        return subMatrix;
    }

    public static double[][] subtract(double[][] matrix1, double[][] matrix2) {
        double[][] subMatrix = new double[0][];
        if (!haveSameDimension(matrix1, matrix2)) {
            System.out.println("Two matrices do not have the same dimensions!");
            return subMatrix;
        }
        subMatrix = new double[matrix1.length][matrix1[0].length];
        for (int i = 0; i < subMatrix.length; i++) {
            for (int j = 0; j < subMatrix[0].length; j++) {
                subMatrix[i][j] = matrix1[i][j] - matrix2[i][j];
            }
        }
        return subMatrix;
    }

    public static int[][] multiply(int[][] matrix1, int[][] matrix2) {
        int[][] mulMatrix = new int[0][];
        if (matrix1[0].length != matrix2.length) {
            System.out.println("Matrices can not be multiplied!");
            return mulMatrix;
        }
        mulMatrix = new int[matrix1.length][matrix2[0].length];
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix2[0].length; j++) {
                for (int k = 0; k < matrix2.length; k++) {
                    mulMatrix[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }
        return mulMatrix;
    }

    public static double[][] multiply(double[][] matrix1, double[][] matrix2) {
        double[][] mulMatrix = new double[0][];
        if (matrix1[0].length != matrix2.length) {
            System.out.println("Matrices can not be multiplied!");
            return mulMatrix;
        }
        mulMatrix = new double[matrix1.length][matrix2[0].length];
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix2[0].length; j++) {
                for (int k = 0; k < matrix2.length; k++) {
                    mulMatrix[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }
        return mulMatrix;
    }
}
