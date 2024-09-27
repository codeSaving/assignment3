package AssignmentModule2Chapter2;

import java.util.Scanner;

public class ThirdAssignment {
    public static void main(String[] args) {

        /*
 Goal: Learn how to work with variables, standard input/output, and arithmetic operations.

Assignment: Write a complete Java program that simulates a calculator that can multiply two numbers.
 When running, your program should produce the following output (user input in bold):

Insert the first number:
10.2
Insert the second number:
-2
The product is -20.4
Your program's main class should be named Product .
         */


        Scanner input = new Scanner(System.in);
        double firstNumebr, secondNumber;
        System.out.println("Insert the first number: ");
        firstNumebr = input.nextDouble();
        System.out.println("Insert the second number: ");
        secondNumber = input.nextDouble();
        System.out.println("The product is " + firstNumebr * secondNumber);

    }
}
