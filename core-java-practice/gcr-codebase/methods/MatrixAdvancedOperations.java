package methods;
import java.util.*;
public class MatrixAdvancedOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of square matrix (2 or 3): ");
        int n = sc.nextInt();
        int[][] matrix = createRandomMatrix(n, n);
        System.out.println("\nOriginal Matrix:");
        printMatrix(matrix);
        // Transpose
        System.out.println("\nTranspose:");
        int[][] transpose = transposeMatrix(matrix);
        printMatrix(transpose);
        // Determinant
        double det = 0;
        if (n == 2) {
            det = determinant2x2(matrix);
        } else if (n == 3) {
            det = determinant3x3(matrix);
        }
        System.out.println("\nDeterminant = " + det);
        // Inverse
        if (det == 0) {
            System.out.println("\nInverse does not exist (determinant = 0)");
        } else {
            System.out.println("\nInverse:");
            double[][] inverse = null;
            if (n == 2) {
                inverse = inverse2x2(matrix);
            } else if (n == 3) {
                inverse = inverse3x3(matrix);
            }
            printMatrix(inverse);
        }
    }

    // Method to create random square matrix
    public static int[][] createRandomMatrix(int rows, int cols) {
        int[][] matrix = new int[rows][cols];
        for (int i=0; i<rows; i++) {
            for (int j=0; j<cols; j++) {
                matrix[i][j] = (int)(Math.random()*10); // 0-9
            }
        }
        return matrix;
    }

    // Method to print integer matrix
    public static void printMatrix(int[][] matrix) {
        for (int[] row: matrix) {
            for (int val: row) {
                System.out.print(val + "\t");
            }
            System.out.println();
        }
    }

    // Method to print double matrix
    public static void printMatrix(double[][] matrix) {
        for (double[] row: matrix) {
            for (double val: row) {
                System.out.printf("%.2f\t", val);
            }
            System.out.println();
        }
    }

    // Method to transpose a matrix
    public static int[][] transposeMatrix(int[][] matrix) {
        int n = matrix.length;
        int[][] trans = new int[n][n];
        for (int i=0;i<n;i++) {
            for (int j=0;j<n;j++) {
                trans[j][i] = matrix[i][j];
            }
        }
        return trans;
    }

    // Determinant of 2x2 matrix
    public static double determinant2x2(int[][] matrix) {
        return matrix[0][0]*matrix[1][1] - matrix[0][1]*matrix[1][0];
    }

    // Determinant of 3x3 matrix
    public static double determinant3x3(int[][] m) {
        return m[0][0]*(m[1][1]*m[2][2]-m[1][2]*m[2][1])
             - m[0][1]*(m[1][0]*m[2][2]-m[1][2]*m[2][0])
             + m[0][2]*(m[1][0]*m[2][1]-m[1][1]*m[2][0]);
    }

    // Inverse of 2x2 matrix
    public static double[][] inverse2x2(int[][] m) {
        double det = determinant2x2(m);
        double[][] inv = new double[2][2];
        inv[0][0] = m[1][1]/det;
        inv[0][1] = -m[0][1]/det;
        inv[1][0] = -m[1][0]/det;
        inv[1][1] = m[0][0]/det;
        return inv;
    }

    // Inverse of 3x3 matrix
    public static double[][] inverse3x3(int[][] m) {
        double det = determinant3x3(m);
        double[][] inv = new double[3][3];

        inv[0][0]=(m[1][1]*m[2][2] - m[1][2]*m[2][1])/det;
        inv[0][1]=-(m[0][1]*m[2][2] - m[0][2]*m[2][1])/det;
        inv[0][2]=(m[0][1]*m[1][2] - m[0][2]*m[1][1])/det;

        inv[1][0]=-(m[1][0]*m[2][2] - m[1][2]*m[2][0])/det;
        inv[1][1]=(m[0][0]*m[2][2] - m[0][2]*m[2][0])/det;
        inv[1][2]=-(m[0][0]*m[1][2] - m[0][2]*m[1][0])/det;

        inv[2][0]=(m[1][0]*m[2][1] - m[1][1]*m[2][0])/det;
        inv[2][1]=-(m[0][0]*m[2][1] - m[0][1]*m[2][0])/det;
        inv[2][2]=(m[0][0]*m[1][1] - m[0][1]*m[1][0])/det;

        return inv;
    }
}
