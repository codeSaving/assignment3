package AutogradedChapter4;

import java.util.Scanner;

public class AutoGradedProject2 {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Step 1: Prompt the user to enter a decimal value
            System.out.print("Enter a decimal value (0 to 15): ");
            int decimal = scanner.nextInt();

            // Step 2: Check if the input is invalid
            if (decimal < 0 || decimal > 15) {
                System.out.println(decimal + " is an invalid input");
            }
            // Step 3: Handle decimal values from 0 to 9
            else if (decimal < 10) {
                System.out.println("The hex value is " + decimal);
            }
            // Step 4: Handle decimal values from 10 to 15
            else {
                char hexValue = (char) ('A' + (decimal - 10));
                System.out.println("The hex value is " + hexValue);
            }

        }
    }


