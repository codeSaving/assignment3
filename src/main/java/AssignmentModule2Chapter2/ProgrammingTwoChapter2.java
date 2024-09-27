package AssignmentModule2Chapter2;

import java.util.Scanner;

public class ProgrammingTwoChapter2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of minutes: ");
        long minutes = scanner.nextLong();
        // total of days
        long totalNumberOfDays = minutes /(24*60);
        // number of years
        long numberOfYears = totalNumberOfDays / 365;

        // remaining number of days
        long remainingNumberOfDays = totalNumberOfDays % 365;
        // display result and use concatenation
        System.out.println(minutes + " minutes is approximtely " + numberOfYears + " years and "+ remainingNumberOfDays + " days ");



    }
}
