package HomeworkAssignment5;

import java.util.Scanner;

public class Test {


// Import the Scanner class for user input


    // Start class CreditCardValidation


        // Start main method
        public static void main(String[] args) {
            // Create a Scanner to get user input
            Scanner input = new Scanner(System.in);

            // Prompt user to enter a credit card number
            System.out.print("Enter a credit card number as a long integer: ");

            // Read the credit card number as a long integer
            long creditCardNumber = input.nextLong();

            // Check if the card number is valid and print the result
            System.out.println(creditCardNumber + " is " + (isCreditCardValid(creditCardNumber) ? "valid" : "invalid"));
        } // End main method

        // Method to check if the credit card number is valid
        public static boolean isCreditCardValid(long creditCardNumber) {
            // Check if it has a valid prefix and if it passes the Luhn algorithm
            return ((hasVPrefix(creditCardNumber, 37) ||
                    hasVPrefix(creditCardNumber, 6) ||
                    hasVPrefix(creditCardNumber, 4) ||
                    hasVPrefix(creditCardNumber, 5)) &&
                    ((sumOfDoubleEven(creditCardNumber) + sumOfOddDigits(creditCardNumber)) % 10 == 0));
        }

        // Method to sum the double of every second digit from the right
        public static int sumOfDoubleEven(long creditCardNumber) {
            int res = 0; // Initialize result sum
            // Convert the credit card number to a string
            String numberString = String.valueOf(creditCardNumber);

            // Start from the second-to-last digit and go backward
            for (int i = numberString.length() - 2; i >= 0; i -= 2) {
                // Double the digit and add its sum to the result
                res += getDigitSum(Character.getNumericValue(numberString.charAt(i)) * 2);
            }
            return res; // Return the total sum
        }

        // Method to get the sum of digits if the number is two digits
        public static int getDigitSum(int number) {
            // If the number is less than 10, return it as is
            // If it's 10 or more, return the sum of its digits
            return (number < 9) ? number : number / 10 + number % 10;
        }

        // Method to sum the digits in odd positions from the right
        public static int sumOfOddDigits(long creditCardNumber) {
            int sum = 0; // Initialize sum
            // Convert the credit card number to a string
            String numberString = String.valueOf(creditCardNumber);

            // Start from the last digit and go backward, adding odd-position digits
            for (int i = numberString.length() - 1; i >= 0; i -= 2) {
                sum += Character.getNumericValue(Long.toString(creditCardNumber).charAt(i));
            }
            return sum; // Return the total sum
        }

        // Method to check if the credit card number has a valid prefix
        public static boolean hasVPrefix(long creditCardNumber, int prefix) {
            // Convert the credit card number to a string
            String numString = Long.toString(creditCardNumber);

            // Get the length of the prefix
            int prefixLength = String.valueOf(prefix).length();

            // Check if the number starts with the prefix and has a valid length
            return numString.startsWith(Integer.toString(prefix)) &&
                    numString.length() >= 13 && numString.length() <= 16;
        }

    } // End class CreditCardValidation

