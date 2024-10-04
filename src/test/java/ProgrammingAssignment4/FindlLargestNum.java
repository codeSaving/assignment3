/*
--> Full Name: Lhoucine ET TIHAMI
--> Purpose: This program reads numbers from the user, identifies the largest number,
    and counts how many times it appears. The input ends when the user enters 0.
 */
package ProgrammingAssignment4;
import java.util.Scanner; // scanner imported
public class FindlLargestNum { // begin of class
        public static void main(String[] args) { // begin of main method
            // Create Scanner object
            Scanner scanner = new Scanner(System.in);
            // Prompt the user to enter the first number
            System.out.print("Enter numbers: ");
            //We are going to assign the first number to max
            int max = scanner.nextInt();
            //we are Initializing count for the largest number
            int count = 1;
            // this variable created to hold the future input
            int number;
            // this will continue reading numbers until 0 is entered
            while ((number = scanner.nextInt()) != 0) {
            //If the number is greater than the current max, update max and reset count
                if (number > max) {
                    max = number;
                    count = 1; // Reset count for the new max
                }
            //If the number is equal to the current max, increment count
                else if (number == max) {
                    count++;
                }
            }
            // Display the results
            System.out.println("The largest number is " + max);
            System.out.println("The occurrence count of the largest number is " + count);
        }
    }


