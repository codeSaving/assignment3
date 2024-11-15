package AutoGradedProgramingProjectAndHomework;

import java.util.Scanner;

/*
Hint: Step 1: Create a class named Exercise08_13.
Step 2: Add two methods: a main method and int[] locateLargest(double[][] a)
 Step 3: Implement int[] locateLargest(double[][] a) to return the location
  of the largest element in an array. The first element in the array is
  the row index and the second is the column index. If there are
  more than one largest element, return the smallest row index and
  then the smallest column index. S
  tep 4: Implement the main method.
  Step 4.1: Prompt the user to enter the number of rows and columns
   of the array.
   Step 4.2: Create the array for the array.
   Step 4.3: Prompt the user to enter the array.
   Step 4.4: Invoke locateLargest(a) method to return the location
    of the largest element. Step 4.5: Display the location of the
    largest element.
 */
public class TestAuto2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Step 4.1: Prompt the user to enter the number of rows and columns
        //   of the array.
        System.out.print("Enter the number of rows and columns of the array: ");
        int rows = scanner.nextInt();
        int columns = scanner.nextInt();

        // Step 4.2: Create the array for the array.
        double[][] array = new double[rows][columns];

        // Step 4.3: Prompt the user to enter the array.
        System.out.println("Enter the array:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                array[i][j] = scanner.nextDouble();
            }
        }

        // Step 4.4: Invoke locateLargest(a) method to return the location
        //    of the largest element
        int[] location = locateLargest(array);

        // Step 4.5: Display the location of the largest element
        System.out.println("The location of the largest element is at (" + location[0] + ", " + location[1] + ")");


    }

    public static int[] locateLargest(double[][] a) {
        int[] location = {0, 0};
        double max = a[0][0];

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (a[i][j] > max || (a[i][j] == max && (i < location[0] || (i == location[0] && j < location[1])))) {
                    max = a[i][j];
                    location[0] = i;
                    location[1] = j;
                }
            }
        }
        return location;
    }



}
