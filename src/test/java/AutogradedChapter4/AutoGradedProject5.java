package AutogradedChapter4;

import java.util.Scanner;

public class AutoGradedProject5 {

        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.print("Enter a string for SSN: ");
            String s = input.nextLine();
            boolean isValid = s.length() == 11 &&
                    Character.isDigit(s.charAt(0)) &&
                    Character.isDigit(s.charAt(1)) &&
                    Character.isDigit(s.charAt(2)) &&
                    s.charAt(3) == '-' &&
                    Character.isDigit(s.charAt(4)) &&
                    Character.isDigit(s.charAt(5)) &&
                    s.charAt(6) == '-' &&
                    Character.isDigit(s.charAt(7)) &&
                    Character.isDigit(s.charAt(8)) &&
                    Character.isDigit(s.charAt(9));
            if (isValid) {
                System.out.println(s + " is a valid social security number");
            } else {
                System.out.println(s + " is an invalid social security number");
            }
        }

}
