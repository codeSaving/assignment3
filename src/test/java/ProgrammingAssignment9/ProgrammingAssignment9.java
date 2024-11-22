package ProgrammingAssignment9;

import java.util.Arrays;
/*
Full name: Lhoucine ET TIHAMI
Objective : The objective of this program is to calculate the total weekly hours for each employee.
It ensures the results are displayed in decreasing order.
 */

public class ProgrammingAssignment9 {// start of class

        public static void main(String[] args) {
            // a 2D array that displays emplyoee's weekly hours
            int[][] employeHours = {
                    {2, 4, 3, 4, 5, 8, 8},  // emp 0
                    {7, 3, 4, 3, 3, 4, 4},  // emp 1
                    {3, 3, 4, 3, 3, 2, 2},  // emp 2
                    {9, 3, 4, 7, 3, 4, 1},  // emp 3
                    {3, 5, 4, 3, 6, 3, 8},  // emp 4
                    {3, 4, 4, 6, 3, 4, 4},  // emp 5
                    {3, 7, 4, 8, 3, 8, 4},  // emp 6
                    {6, 3, 5, 9, 2, 7, 9}   // emp 7
            };



            // a 2D array that stores total hour + employee
            int[][] totalHours = new int[8][2];

            // Calculate total hours and store with employee ID
            for (int row = 0; row < employeHours.length; row++) {
                totalHours[row][0] = Arrays.stream(employeHours[row]).sum(); // Calculate the sum for the row
                totalHours[row][1] = row; // Save the employee ID
            }

            // using selection to sort employee by total hour in descending order
            for (int i = 0; i < totalHours.length - 1; i++) {
                for (int j = i + 1; j < totalHours.length; j++) {
                    if (totalHours[i][0] < totalHours[j][0]) {
                        int[] tmp = totalHours[i];
                        totalHours[i] = totalHours[j];
                        totalHours[j] = tmp;
                    }
                }
            }

            // Print the output
            outputEmployeeHours(totalHours);
        }
    // This method prints the total weekly hours for each employee
    public static void outputEmployeeHours(int[][] array) {
        for (int[] eachEmpAndTotHrs : array) {
            System.out.printf("Emp %d = %d total hours%n", eachEmpAndTotHrs[1], eachEmpAndTotHrs[0] );
        }
    }
}





