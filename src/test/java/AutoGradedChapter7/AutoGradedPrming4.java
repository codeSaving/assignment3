package AutoGradedChapter7;

import java.util.Scanner;

public class AutoGradedPrming4 {

        public static void main(String[] args) {// main method
            Scanner input = new Scanner(System.in);

            // Create an array numbers using new double[10].
            double[] numbers = new double[10];
            // Prompt the user to enter 10 numbers and store them in numbers.
            System.out.print("Enter 10 numbers: ");
            for (int i = 0; i < numbers.length; i++) {
                numbers[i] = input.nextDouble();
            }
            // Invoke mean(numbers) and deviation(numbers) to obtain mean and deviation for numbers.
            //System.out.printf("The mean is %.2f\n", mean(numbers));
            //System.out.printf("The standard deviation is %.5f\n", deviation(numbers));
            System.out.println("The mean is " + String.format("%.2f", mean(numbers)));
            System.out.println("The standard deviation is " + String.format("%.5f", deviation(numbers)));

        }
        // Implement the mean(double[] x) method as follows:
        public static double mean(double[] x) {
            //Declare and initialize a double variable sum.
            double sum = 0;
            for (double num : x) { // Write a loop to all elements in array x into sum.
                sum += num;
            }
            return sum / x.length; // Return sum / x.length;
        }
        // Implement the deviation(double [] x) method as follows:
        public static double deviation(double[] x) {
            double mean = 0;
            double squareSum = mean(x);
            // Write a loop. For each element x[i], add (x[i] - mean(x)) ^ 2 to squareSum.
            for (double num : x) {
                squareSum += Math.pow(num - mean, 2);
            }

            // return Math.sqrt(squareSum / (x.length - 1))
            return Math.sqrt(squareSum / (x.length - 1));
        }
    }




