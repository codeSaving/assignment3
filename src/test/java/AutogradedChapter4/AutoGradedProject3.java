package AutogradedChapter4;

import java.util.Scanner;

public class AutoGradedProject3 {

        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            // Step 1: Prompt the user to enter a letter
            System.out.print("Enter a letter: ");
            String s = input.nextLine();

            // Step 2: Check if the input length is not 1
            if (s.length() != 1) {
                System.out.println("Invalid input. Please enter a single character.");
                return; // Exit the program
            }

            // Step 3: Get the first character from the string
            char ch = s.charAt(0);

            // Step 4: Convert ch to uppercase
            ch = Character.toUpperCase(ch);

            // Step 5: Check if ch is not a letter
            if (!Character.isLetter(ch)) {
                System.out.println(ch + " is an invalid input");
            }
            // Step 6: Check if ch is a vowel
            else if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
                System.out.println(ch + " is a vowel");
            }
            // Step 7: Otherwise, it is a consonant
            else {
                System.out.println(ch + " is a consonant");
            }

            input.close(); // Close the scanner
        }
    }
