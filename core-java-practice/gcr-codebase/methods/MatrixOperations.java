package methods;
import java.util.*;
public class MatrixOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // input
        System.out.print("Enter rows of Matrix A: ");
        int r1=sc.nextInt();
        System.out.print("Enter columns of Matrix A: ");
        int c1=sc.nextInt();
        System.out.print("Enter rows of Matrix B: ");
        int r2=sc.nextInt();
        System.out.print("Enter columns of Matrix B: ");
        int c2=sc.nextInt();
        // random matrices
        int[][] A = createRandomMatrix(r1, c1);
        int[][] B = createRandomMatrix(r2, c2);
        System.out.println("\nMatrix A:");
        printMatrix(A);
        System.out.println("\nMatrix B:");
        printMatrix(B);
        // Addition & Subtraction
        if (r1 == r2 && c1 == c2) {
            System.out.println("\nMatrix Addition:");
            printMatrix(addMatrices(A, B));
            System.out.println("\nMatrix Subtraction:");
            printMatrix(subtractMatrices(A, B));
        } else {
            System.out.println("\nAddition & Subtraction not possible (dimension mismatch)");
        }
        // Multiplication
        if (c1 == r2) {
            System.out.println("\nMatrix Multiplication:");
            printMatrix(multiplyMatrices(A, B));
        } else {
            System.out.println("\nMultiplication not possible (columns of A ≠ rows of B)");
        }
    }
    // Method to create a random matrix
    public static int[][] createRandomMatrix(int rows, int cols) {
        int[][] matrix = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = (int)(Math.random() * 10); // 0–9
            }
        }
        return matrix;
    }

    // Method to add two matrices
    public static int[][] addMatrices(int[][] A, int[][] B) {
        int[][] result=new int[A.length][A[0].length];
        for (int i=0;i<A.length;i++) {
            for (int j=0;j<A[0].length;j++) {
                result[i][j]=A[i][j]+B[i][j];
            }
        }
        return result;
    }

    // Method to subtract two matrices
    public static int[][] subtractMatrices(int[][] A, int[][] B) {
        int[][] result=new int[A.length][A[0].length];
        for (int i=0;i<A.length;i++) {
            for (int j=0;j<A[0].length;j++) {
                result[i][j]=A[i][j]-B[i][j];
            }
        }
        return result;
    }
    // Method to multiply two matrices
    public static int[][] multiplyMatrices(int[][] A, int[][] B) {
        int[][] result=new int[A.length][B[0].length];
        for (int i=0;i<A.length;i++) {
            for (int j=0;j<B[0].length;j++) {
                for (int k=0;k<A[0].length;k++) {
                    result[i][j]+=A[i][k]*B[k][j];
                }
            }
        }
        return result;
    }
    // Method to print matrix
    public static void printMatrix(int[][] matrix) {
        for (int[] row:matrix) {
            for (int val:row) {
                System.out.print(val+"\t");
            }
            System.out.println();
        }
    }
}
