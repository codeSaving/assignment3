package AutoGradedProgramingProjectAndHomework;

import java.util.Scanner;

/*
(Markov matrix)

An n x n  matrix is called a positive Markov matrix if each element
is positive and the sum of the elements in each column is 1. Write
the following method to check whether a matrix is a Markov matrix:

public static boolean isMarkovMatrix(double[][] m)
Write a main method that prompts the user to input a 3x3 double
 matrix, and then tell them whether it is a Markov matrix.

Sample Run 1

Enter a 3-by-3 matrix row by row:
0.15 0.875 0.375
0.55 0.005 0.225
0.30 0.12 0.4
It is a Markov matrix
Sample Run 2

Enter a 3-by-3 matrix row by row:
0.95 -0.875 0.375
0.65 0.005 0.225
0.30 0.22 -0.4
It is not a Markov matrix


 */
public class AutoGradedProgramming4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a 3-by-3 matrix row by row:");
        double [][] matrix = new double[3][3];
        for(int i = 0; i < 3; i++){
            for(int j = 0;  j < 3; j++){
                matrix [i][j] = input.nextDouble();
            }
        }
        boolean isMarkov = isMarkovMatrix(matrix);
        if(isMarkov){
            System.out.println("It is a Markov matrix");
        }else {
            System.out.println("It is not a Markov matrix");
        }
    }

    public static boolean isMarkovMatrix(double[][]m){
        for(int colum = 0; colum <m[0].length; colum++){
            double columSum = 0;
            for (int row = 0; row < m.length;row++){
                if(m[row][colum]< 0){
                    return false;
                }
                columSum += m[row][colum];
            }
            if(columSum != 1){
                return false;
            }
        }
        return true;
    }



}
