package AutoGradedProgramingProjectAndHomework;

import java.util.Scanner;

public class TestIt {
    public static void main(String[] args) {
        double [][] m = new double[3][4];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < m.length; i++){
            System.out.println("Enter 3-b-4 matrix row " + i + ": ");
            for(int j = 0; j< m[i].length; j++){
               m[i][j]= scanner.nextDouble();


            }
        }
        for (int j =0; j < m[0].length; j++){
            double colmSum =  sumColumn(m, j);
            System.out.println("Sum of the elements for column " + j + " is" + colmSum);

        }
    }

    public static double sumColumn(double[][] m, int columnIndex){
        double sum = 0;
        for(int i = 0; i < m.length; i++){
            sum += m[i][columnIndex];
        }
        return sum;
    }
}
