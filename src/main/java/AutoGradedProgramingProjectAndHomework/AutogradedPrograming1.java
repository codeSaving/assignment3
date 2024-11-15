package AutoGradedProgramingProjectAndHomework;
import java.util.Scanner;
public class AutogradedPrograming1 {
    public static void main(String[] args) {


//        int [][] matrix = new int [3][4];
//        int max = 1;
//        for(int i = 0; i < matrix.length; i++){
//            for ( int j = 0; j < matrix[i].length; j++){
//               matrix [i][j] = max++;
//                System.out.print(matrix[i][j] +  " \t");
//
//            }
//            System.out.println();
//
//        }

// Declare a 3x4 matrix
        double[][] m = new double[3][4];

        // Create a scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Input matrix values using nested for loop
        for (int i = 0; i < m.length; i++) { // Loop through rows
            System.out.print("Enter a 3-by-4 matrix row " + i + ": ");
            for (int j = 0; j < m[i].length; j++) { // Loop through columns
                m[i][j] = scanner.nextDouble(); // Input value for the element
            }
        }
        // Calculate and display the sum for each column
        for (int j = 0; j < m[0].length; j++) { // Loop through columns
            double columnSum = sumColumn(m, j); // Call sumColumn to get the sum for column j
            System.out.println("Sum of the elements for column " + j + " is " + columnSum);
        }


    }
    public static double sumColumn(double[][] m, int columnIndex) {
        double sum = 0; // Initialize sum to 0
        for (int i = 0; i < m.length; i++) { // Loop through rows
            sum += m[i][columnIndex]; // Add the element in the current column
        }
        return sum; // Return the sum of the specified column
    }



}















