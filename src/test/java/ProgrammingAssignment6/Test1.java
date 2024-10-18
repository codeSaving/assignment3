package ProgrammingAssignment6;

import java.util.Scanner;

public class Test1 {

        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            // Read the coordinates for point 1
            double[] point1 = getCoordinates(input, "Enter point 1 (latitude and longitude) in degrees: ");
            // Read the coordinates for point 2
            double[] point2 = getCoordinates(input, "Enter point 2 (latitude and logitude) in degree: ");
            // Calculate and display the great circle distance
            double distance = calculateGreatCircleDistance(point1[0], point1[1], point2[0], point2[1]);
            System.out.printf("The great circle distance between the two points is %.4f km.%n", distance);
        }
        // Method to get coordinates (latitude and longitude) from user input
        public static double[] getCoordinates(Scanner input, String prompt) {
            System.out.print(prompt);
            String[] coordinates = input.nextLine().split(",");
            double latitude = Double.parseDouble(coordinates[0].trim());
            double longitude = Double.parseDouble(coordinates[1].trim());
            return new double[]{latitude, longitude}; // Return both latitude and longitude in an array
        }

        // Method to calculate the great circle distance
        public static double calculateGreatCircleDistance(double latitude1, double longitude1, double latitude2, double longitude2) {
            double earthRadius = 6371.01;  // Average earth radius in kilometers
            return earthRadius * Math.acos(
                    Math.sin(Math.toRadians(latitude1)) * Math.sin(Math.toRadians(latitude2)) +
                            Math.cos(Math.toRadians(latitude1)) * Math.cos(Math.toRadians(latitude2)) *
                                    Math.cos(Math.toRadians(longitude1) - Math.toRadians(longitude2))
            );
        }
    }


