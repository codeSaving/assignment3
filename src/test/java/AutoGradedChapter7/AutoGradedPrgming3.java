package AutoGradedChapter7;

import java.util.Scanner;

public class AutoGradedPrgming3 {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            //Create an array to store up to 10 numbers
            int[] numbers = new int[10];
            // Declare and initialize numberOfDistinctValues
            int numberOfDistinctValues = 0;
            // Prompt the user to enter ten numbers
            System.out.print("Enter ten numbers: ");
            // Loop to read 10 integers
            for (int i = 0; i < 10; i++) {
                int value = input.nextInt();
                // Test if value is already in numbers.
                if (!isInNumbers(numbers, numberOfDistinctValues, value)) {
                    // if value is not numbers, add value to numbers: numbers[numberOfDistinctValues] = value.
                    numbers[numberOfDistinctValues] = value;
                    // Increase numberOfDistinctValues by 1.
                    numberOfDistinctValues++;
                }
            }
            // Display the output: display numberOfDistinctValues and all the elements in numbers.
            System.out.println("The number of distinct numbers is " + numberOfDistinctValues);
            System.out.print("The distinct numbers are ");
            // Print the distinct numbers separated by spaces
            for (int i = 0; i < numberOfDistinctValues; i++) {
                System.out.print(numbers[i] + " ");
            }
        }
        // public static boolean isInNumbers(int[] numbers, int size, int value)
        public static boolean isInNumbers(int[] numbers, int size, int value) {
            for (int i = 0; i < size; i++) {
                if (numbers[i] == value) {
                    return true;
                }
            }
            return false;
        }
    }





