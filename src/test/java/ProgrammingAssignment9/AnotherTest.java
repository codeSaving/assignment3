package ProgrammingAssignment9;

import java.util.Arrays;

public class AnotherTest {

        public static void main(String[] args) {
            // A 2D array representing employees' weekly hours (7 days for each employee)
            int[][] employeHours = {
                    {2, 4, 3, 4, 5, 8, 8},  // Employee 0
                    {7, 3, 4, 3, 3, 4, 4},  // Employee 1
                    {3, 3, 4, 3, 3, 2, 2},  // Employee 2
                    {9, 3, 4, 7, 3, 4, 1},  // Employee 3
                    {3, 5, 4, 3, 6, 3, 8},  // Employee 4
                    {3, 4, 4, 6, 3, 4, 4},  // Employee 5
                    {3, 7, 4, 8, 3, 8, 4},  // Employee 6
                    {6, 3, 5, 9, 2, 7, 9}   // Employee 7
            };

            // A 2D array to store total hours and employee ID
            // Each row: [total hours, employee ID]
            int[][] totalHours = new int[8][2];

            // Calculate total weekly hours for each employee and store their ID
            for (int row = 0; row < employeHours.length; row++) {
                // Sum the hours for the current employee (row)
                totalHours[row][0] = Arrays.stream(employeHours[row]).sum();
                // Store the employee ID (row index)
                totalHours[row][1] = row;
            }

            // Sort employees by total hours in descending order using selection sort
            for (int i = 0; i < totalHours.length - 1; i++) {
                for (int j = i + 1; j < totalHours.length; j++) {
                    // Swap rows if the current employee has fewer total hours than the next
                    if (totalHours[i][0] < totalHours[j][0]) {
                        int[] tmp = totalHours[i];
                        totalHours[i] = totalHours[j];
                        totalHours[j] = tmp;
                    }
                }
            }

            // Display the sorted employee hours
            printArray(totalHours);
        }

        // Method to print the employee hours in a formatted table
        public static void printArray(int[][] array) {
            // Print table header
            System.out.println("Employee  | Total Hours");
            System.out.println("--------------------------");

            // Print each employee's ID and total hours
            for (int[] entry : array) {
                System.out.printf("Emp %-9d| %d%n", entry[1], entry[0]);
            }
        }
    }




