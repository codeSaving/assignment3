package ProgrammingAssignment6;

import java.util.Scanner;

public class Test {

/*
Full name: Lhoucine ET TIHAMI
Objective: This program calculates the distance between two points
based on user input of latitude and longitude.
*/

                public static void main(String[] args) {
                        // Create a scanner for user input
                        Scanner scanner = new Scanner(System.in);

                        // Prompt user for point 1 coordinates
                        System.out.print("Enter point 1 (latitude and longitude) in degrees: ");
                        // Read input, split by comma, and convert to double
                        String[] coordinats1 = scanner.nextLine().split(",");
                        double x1 = Double.parseDouble(coordinats1[0].trim()); // Latitude of point 1
                        double y1 = Double.parseDouble(coordinats1[1].trim()); // Longitude of point 1

                        // Prompt user for point 2 coordinates
                        System.out.print("Enter point 2 (latitude and longitude) in degrees: ");
                        // Read input, split by comma, and convert to double
                        String[] coordinats2 = scanner.nextLine().split(",");
                        double x2 = Double.parseDouble(coordinats2[0].trim()); // Latitude of point 2
                        double y2 = Double.parseDouble(coordinats2[1].trim()); // Longitude of point 2

                        // Calculate the great circle distance using the formula
                        double distance = 6371.01 * Math.acos(
                                Math.sin(Math.toRadians(x1)) * Math.sin(Math.toRadians(x2)) +
                                        Math.cos(Math.toRadians(x1)) * Math.cos(Math.toRadians(x2)) *
                                                Math.cos(Math.toRadians(y1) - Math.toRadians(y2))
                        );

                        // Display the distance formatted to four decimal places
                        System.out.printf("The distance between the two points is %.4f km.%n", distance);
                }
        }







