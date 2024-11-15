package AutoGradedProgramingProjectAndHomework;
/*
Write the following method that returns the location of the
 largest element in a two-dimensional array.

public static int[] locateLargest(double[][] a)
The return value is a one-dimensional array that contains two
elements. These two elements indicate the row and column indices of
the largest element in the two-dimensional array. If there is more
than one largest element, return the smallest row index and then the
smallest column index.

Write a main method that prompts the user to enter a two-dimensional
array and displays the location of the largest element in the array.

Sample Run

Enter the number of rows and columns of the array: 3 4
Enter the array:
23.5 35 2 10
4.5 3 45 3.5
35 44 5.5 9.6
The location of the largest element is at (1, 2)
 */


import java.util.Scanner;

public class AutogradedProgramming2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of rows and columnc of the array: ");
        int rows = input.nextInt();
        int columns = input.nextInt();
        double [][] array = new double[rows][columns];

        System.out.println("Enter the array: ");
        for (int i = 0; i < rows; i++){
            for( int j = 0; j < columns; j++){
                array [i][j] = input.nextDouble();
            }
        }
        int [] location = locateLargest(array);
        System.out.println("the location of the largest is at ( " + location[0] + " , " + location [1] + " )");


    }
    public static int [] locateLargest (double [][]a ){
        int[] location = {0, 0};
        double max = a [0][0];
        for(int i = 0; i< a.length; i++){
            for(int j = 0; j< a[i].length; j++){
                if(a[i][j] > max || (a[i][j] == max &&  (i < location[0] || (i == location [0] && j < location[1] )))){

                    max = a [i][j];
                    location [0]= i;
                    location [1] = i;
                }
            }

        }
        return location;
    }







}
