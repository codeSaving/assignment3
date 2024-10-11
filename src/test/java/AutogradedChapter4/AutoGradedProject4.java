package AutogradedChapter4;

import java.util.Scanner;

public class AutoGradedProject4 {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            // Prompt for year
            System.out.print("Enter a year: ");
            int year = input.nextInt();

            // Prompt for month
            System.out.print("Enter a month: ");
            String month = input.next();

            int days;
            switch (month) {
                case "Jan": case "Mar": case "May": case "Jul": case "Aug": case "Oct": case "Dec":
                    days = 31; break;
                case "Apr": case "Jun": case "Sep": case "Nov":
                    days = 30; break;
                case "Feb":
                    days = (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) ? 29 : 28; break;
                default:
                    System.out.println(month + " is not a correct month name");
                    input.close();
                    return; // Exit if invalid month
            }

            // Display the result in the specified format
            System.out.println(month + " " + year + " has " + days + " days");
            input.close();
        }
    }

