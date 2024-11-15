package AutoGradedProgramingProjectAndHomework;
/*
Question
(Central city)

Given a set of cities, the central point is the city that has the shortest total
distance to all other cities (where distance is
. Write a program that prompts the user to enter the number of cities and the locations
of the cities (that is, their x, y coordinates), and then finds the central city and the
total distances to the central city.

Sample Run

Enter the number of cities: 5
Enter the coordinates of the cities: 2.5 5 5.1 3 1 9 5.4 54 5.5 2.1
The central city is at (2.5, 5.0)
The total distance to all other cities is 60.810516285521615
 */


/*
How would you write this program? Here are some hints:
Step 1: Create a class named Exercise08_21.
Step 2: Add three methods: a main method, distance(double[] c1, double[] c2), and totalDistance(double[][] cities, int i).
 Step 3: Implement the main method.
 Step 3.1: Prompt the user to enter numberOfCities.
 Step 3.2: Create cities using new double[numberOfCities][2].
 Step 3.3: Prompt the user to enter the coordinates for the cities.
 Step 3.4: Declare minTotal (double) and minIndex (int) to store the minimum total
 distance and the index of the minimum total distance city.
 Step 3.4: For every city with index i, invoke totalDistance(cities, i) to return the totalDistance.
  If it is < minTotal, assign totalDistance to minTotal and i to minIndex.
   Step 3.5: Display the minTotal and minIndex for the central city.
   Step 4: Implement distance(double[] c1, double[] c2). This method returns the distance between
   (c1[0], c1[1]) and (c2[0], c2[1]).
   Step 5: Implement and totalDistance(double[][] cities, int i).
   This method returns the total distance from city i to all other cities.

 */
import java.util.Scanner;
public class AutoGradedprogmiming5 {

        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            // Step 3.1: Prompt the user to enter numberOfCities.
            System.out.print("Enter the number of cities: ");
            int numberOfCities = input.nextInt();

            // Step 3.2: Create cities using new double[numberOfCities][2].
            double[][] cities = new double[numberOfCities][2];

            // Step 3.3: Prompt the user to enter the coordinates for the cities.
            System.out.println("Enter the coordinates of the cities:");
            for (int i = 0; i < numberOfCities; i++) {
                cities[i][0] = input.nextDouble();
                cities[i][1] = input.nextDouble();
            }

            // Step 3.4: Declare minTotal (double) and minIndex (int) to store the minimum total
            // distance and the index of the minimum total distance city.
            double minTotal = Double.MAX_VALUE;
            int minIndex = -1;
            //Step 3.4: For every city with index i, invoke totalDistance(cities, i) to return the totalDistance.
            //  If it is < minTotal, assign totalDistance to minTotal and i to minIndex.

            for (int i = 0; i < numberOfCities; i++) {
                double totalDist = totalDistance(cities, i);
                if (totalDist < minTotal) {
                    minTotal = totalDist;
                    minIndex = i;
                }
            }

            // Step 3.5: Display the central city and the total distance
            System.out.printf("The central city is at (%.1f, %.1f)%n", cities[minIndex][0], cities[minIndex][1]);
            System.out.println("The total distance to all other cities is " + minTotal);

            input.close();
        }

        // Step 4: Calculate distance between two cities
        public static double distance(double[] c1, double[] c2) {
            return Math.sqrt(Math.pow(c2[0] - c1[0], 2) + Math.pow(c2[1] - c1[1], 2));
        }

        // Step 5: Implement and totalDistance(double[][] cities, int i).
        public static double totalDistance(double[][] cities, int i) {
            double totalDist = 0;
            for (int j = 0; j < cities.length; j++) {
                if (i != j) {
                    totalDist += distance(cities[i], cities[j]);
                }
            }
            return totalDist;
        }
    }






