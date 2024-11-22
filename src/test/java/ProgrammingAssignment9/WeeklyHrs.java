package ProgrammingAssignment9;

import java.util.Arrays;
import java.util.Comparator;

public class WeeklyHrs {

    public static void main(String[] args) {
        // Employee hours array (rows represent employees, columns represent days of the week)
        int[][] hours = {
                {2, 4, 3, 4, 5, 8, 8},
                {7, 3, 4, 3, 3, 4, 4},
                {3, 3, 4, 3, 3, 2, 2},
                {9, 3, 4, 7, 3, 4, 1},
                {3, 5, 4, 3, 6, 3, 8},
                {3, 4, 4, 6, 3, 4, 4},
                {3, 7, 4, 8, 3, 8, 4},
                {6, 3, 5, 9, 2, 7, 9}
        };

        // Array to store employee IDs and their total hours
        int[][] employeeTotalHours = new int[hours.length][2];

        // Calculate total hours for each employee
        for (int i = 0; i < hours.length; i++) {
            int total = 0;
            for (int j = 0; j < hours[i].length; j++) {
                total += hours[i][j];
            }
            employeeTotalHours[i][0] = i; // Employee ID
            employeeTotalHours[i][1] = total; // Total hours
        }

        // Sort the employees by total hours in decreasing order
        Arrays.sort(employeeTotalHours, Comparator.comparingInt((int[] row) -> row[1]).reversed());

        // Display the sorted result
        System.out.println("Employee ID | Total Hours");
        System.out.println("--------------------------");
        for (int[] employee : employeeTotalHours) {
            System.out.printf("Emp %-9d| %d\n", employee[0], employee[1]);
        }
    }

}
