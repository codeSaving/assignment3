package Chapter3LoopFromSchoolBook;

import java.util.Scanner;

public class GuessingGameUisngWhileLoop {
    public static void main(String[] args) {


        // generate a guessing number to be guessed

        int number = (int)(Math.random()*101);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Guess a magic number between 0 and 100");
        int guess = 2;
        while ( guess != number) {

            // promt the use to guess the number

            System.out.println("\nEnter your guess: ");
             guess = scanner.nextInt();
            if (guess == number)
                System.out.println("Yes, the number is : " + number);
            else if (guess > number)
                System.out.println("Your guess is too highe");
            else
                System.out.println("Your guess is too low");


        }
    }
}
