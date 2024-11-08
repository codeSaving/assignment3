package programmingAssignmentMain6;

import java.util.Scanner;

public class GreatCircleDistanceCalculator {

/*
Full name: Lhoucine ET TIHAMI
Objective: This program calculates the distance between two points
based on user input of latitude and longitude.
 */
// Scanner imported// start of class

        public static void main(String[] args) {// start of main method
            //Creat a scanner for a user input
            Scanner scanner = new Scanner(System.in);
            //promt the user to enter point 1 coordinates
            System.out.print("Enter point 1 (latitude and longitude) in degrees: ");
            // this following will read the input, split by (,) and convert to double
            String[] coordinats1 = scanner.nextLine().split(",");
            double x1 = Double.parseDouble(coordinats1[0].trim());
            double y1 = Double.parseDouble(coordinats1[1].trim());
            // promt the user to enter point 2 coordinates
            System.out.print("Enter point 2 (latitude and longitude) in degrees: ");
            // the following will read the input, split by (,) and convert to double
            String[] coordinats2 = scanner.nextLine().split(",");
            double x2 = Double.parseDouble(coordinats2[0].trim());
            double y2 = Double.parseDouble(coordinats2[1].trim());
            //using the formula to calculate the great circle distance
            double distance = 6371.01 * Math.acos(
                    Math.sin(Math.toRadians(x1)) * Math.sin(Math.toRadians(x2)) +
                            Math.cos(Math.toRadians(x1)) * Math.cos(Math.toRadians(x2)) *
                                    Math.cos(Math.toRadians(y1) - Math.toRadians(y2))
                    // display distance output, formatted to four decimal places
            );
            System.out.printf("The distance between the two points is %.4f km.%n", distance);
        }
    }




