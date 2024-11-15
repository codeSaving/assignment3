package AutoGradedProgramingProjectAndHomework;

import java.util.Scanner;

public class TestAuo4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Step 4.1: Prompt the user to enter a 3x3 matrix.
        System.out.println("Enter a 3-by-3 matrix row by row:");
        double[][] matrix = new double[3][3];

        // Step 4.3: Input elements into the matrix.
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrix[i][j] = scanner.nextDouble();
            }
        }

        // Step 4.4: Check if the matrix is a Markov matrix.
        boolean isMarkov = isMarkovMatrix(matrix);

        // Step 4.5: Display the result.
        if (isMarkov) {
            System.out.println("It is a Markov matrix");
        } else {
            System.out.println("It is not a Markov matrix");
        }
    }
    // Step 3: Method to check if a matrix is a Markov matrix.
    public static boolean isMarkovMatrix(double[][] m) {
        for (int col = 0; col < m[0].length; col++) {
            double columnSum = 0;
            for (int row = 0; row < m.length; row++) {
                if (m[row][col] < 0) {
                    return false; // Element is not positive
                }
                columnSum += m[row][col];
            }
            if (columnSum != 1) {
                return false; // Column sum is not 1
            }
        }
        return true;
    }




}
