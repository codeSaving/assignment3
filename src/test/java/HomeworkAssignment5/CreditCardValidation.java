package HomeworkAssignment5;
/*
Full Name: Lhoucine ET TIHAMI
Objective: The objective of this code is to validate credit card numbers
using the Luhn algorithm and check for valid prefixes.
 */
// Scanner imported
import java.util.Scanner;

public class CreditCardValidation { // start of class
        public static void main(String[] args) { // start of main method
// scanner for user input
            Scanner input = new Scanner(System.in);
// promt the user to enter credit cart number
            System.out.print("Enter a credit card number as a long integer: ");

            long creditCardNumber = input.nextLong();
// check if credit cart is valid or not, along with printing the result
            System.out.println(creditCardNumber + " is " + (isCreditCardValid(creditCardNumber) ? "valid" : "invalid"));
        }// end of main method
    // we created this method to chech the validity of credit card number
    public static boolean isCreditCardValid(long creditCardNumber) {
    // we check if it contains prefix number
        return ((hasVPrefix(creditCardNumber, 37) || hasVPrefix(creditCardNumber, 6) ||
                hasVPrefix(creditCardNumber, 4) || hasVPrefix(creditCardNumber, 5)) &&
                ((sumOfDoubleEven(creditCardNumber) + sumOfOddDigits(creditCardNumber)) % 10 == 0));
    }

    // we created this method to sum up the double of second dgigit from the right
    public static int sumOfDoubleEven(long creditCardNumber) {
            int res = 0;
    // conversion if credit cart to string
            String numberString = String.valueOf(creditCardNumber);
    //looping through and starting from las second degit backward
            for (int i = numberString.length() - 2; i >= 0; i -= 2) {
                res += getDigitSum(Character.getNumericValue(numberString.charAt(i)) * 2);
            }
            return res;
        }
    // we created this method to get sum
        public static int getDigitSum(int number) {
    // if number less than 9, return it; if 10, return the sum
            return (number < 9) ? number : number / 10 + number % 10;
        }
    // method to sum the odd from the right using loop
        public static int sumOfOddDigits(long creditCardNumber) {
            int sum = 0;
    // conversion of credit card number to strimg
            String numberString = String.valueOf(creditCardNumber);
    // starting from the last digit backward
            for (int i = numberString.length() - 1; i >= 0; i -= 2) {
                sum += Character.getNumericValue(Long.toString(creditCardNumber).charAt(i));
            }
            return sum;
        }
    // we created this method to check if credit card contains valid prefix
        public static boolean hasVPrefix(long creditCardNumber, int prefix) {
    // conversion of credit card to string
            String numString = Long.toString(creditCardNumber);
    // get the lenght
            int prefixLength = String.valueOf(prefix).length();
    // check if credit cart starts with valid prefix and contain valid lenght
            return numString.startsWith(Integer.toString(prefix)) &&
                    numString.length() >= 13 && numString.length() <= 16;
        }
    }// end of class




