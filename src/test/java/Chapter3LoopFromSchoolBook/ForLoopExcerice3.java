package Chapter3LoopFromSchoolBook;

import java.util.Scanner;

public class ForLoopExcerice3 {
    public static void main(String[] args) {
      /*
      Goal: Learn to write for loops.

Assignment: Assume a Scanner stdin has already been declared and instantiated. Write some code that takes two int
 inputs from the user and then uses a for loop to calculate their Greatest Common Denominator. Print the result.
       */
        Scanner stdin = new Scanner(System.in);
        int x = stdin.nextInt();
        int y = stdin.nextInt();
        int min = Math.min(x, y);
        int GreatComDenominator = 1;
        for (int i = 1; i <= min; i++) {
            if (x % i == 0 && y % i == 0) {
                GreatComDenominator = i;
            }
        }
        System.out.println(GreatComDenominator);






    }
}
