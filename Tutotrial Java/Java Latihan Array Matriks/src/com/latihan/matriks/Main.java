package com.latihan.matriks;
import java.util.Arrays;
public class Main {

    public static void main(String[] args) {

        // menggunakan matriks penggabungan

        int[][] matrix1 = {
                {11, 22},
                {33, 44}
        };

        int[][] matrix2 = {
                {55, 66},
                {77, 88}
        };

//        int[][] result = concatenateMatrices(matrix1, matrix2);

//        // Menampilkan matriks hasil
//        for (int i = 0; i < result.length; i++) {
//            for (int j = 0; j < result[0].length; j++) {
//                System.out.print(result[i][j] + " ");
//            }
//            System.out.println();
//        }
//    }
//
//    public static int[][] concatenateMatrices(int[][] matrix1, int[][] matrix2) {
//        int m = matrix1.length; // Jumlah baris matriks pertama
//        int n = matrix1[0].length; // Jumlah kolom matriks pertama
//        int p = matrix2[0].length; // Jumlah kolom matriks kedua
//        int[][] result = new int[m][n + p]; // Membuat matriks hasil dengan jumlah kolom yang sesuai
//
//        // Menggabungkan dua matriks
//        for (int i = 0; i < m; i++) {
//            for (int j = 0; j < n; j++) {
//                result[i][j] = matrix1[i][j];
//            }
//            for (int j = 0; j < p; j++) {
//                result[i][j + n] = matrix2[i][j];
//            }
//        }
//
//        return result;


        // menggunakan matriks reverse

        int[][] matrix = {
                {11, 22, 33,56},
                {44, 55, 66,34},
                {77, 88, 99,45}
        };

        System.out.println("Original Matrix:");
        printMatrix(matrix);

        System.out.println("\nReversed Matrix (Horizontal):");
        int[][] reversedHorizontal = reverseMatrixHorizontal(matrix);
        printMatrix(reversedHorizontal);

        System.out.println("\nReversed Matrix (Vertical):");
        int[][] reversedVertical = reverseMatrixVertical(matrix);
        printMatrix(reversedVertical);
    }

    public static int[][] reverseMatrixHorizontal(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int[][] reversedMatrix = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                reversedMatrix[i][j] = matrix[i][cols - j -1];
            }
        }

        return reversedMatrix;
    }

    public static int[][] reverseMatrixVertical(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int[][] reversedMatrix = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                reversedMatrix[i][j] = matrix[rows - 1 - i][j];
            }
        }

        return reversedMatrix;
    }

    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }

    }
}
