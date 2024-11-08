package AutoGradedChapter7;

import java.util.Scanner;

public class AutoGradedPrgming2 {

        public static void main(String[] args) {
            // Step 1: Create an array for counts using new int[100].
            int[] counts = new int[100];
            //Read a number.
            Scanner input = new Scanner(System.in);
            System.out.print("Enter integers between 1 and 100, inclusive: ");
            int number = input.nextInt();
            // Write a while loop
            while (number != 0) { //The loop continuation condition is (number != 0).
                //if number is between 1 and 100, count[number - 1]++.
                if (number >= 1 && number <= 100) {
                    counts[number - 1]++;
                }
                number = input.nextInt(); //read the number again.
            }
            // for i from 0 to 99
            for (int i = 0; i < counts.length; i++) {
                //if counts[i] > 1, display number i + 1, counts[i] and "time" or "times". I
                // f (counts[i] > 1), displays "times". If (counts[i] == 1), display "time".
                if (counts[i] > 0) {
                    System.out.println((i + 1) + " occurs " + counts[i] + (counts[i] > 1 ? " times" : " time"));
                }
            }
        }
    }















