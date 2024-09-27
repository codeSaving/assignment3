package classes.AssignmentModule2Chapter2;

import java.util.Scanner;

public class Calculator {

        public static void main(String[] args) {
            Scanner j = new Scanner(System.in);

            // Let's prompt the user to get the first number with newline formatting
            System.out.print("Enter the first number:\n");
            double num1 = j.nextDouble();

            // Let's prompt the user to get the second number with newline formatting
            System.out.print("Enter the second number:\n");
            double num2 = j.nextDouble();

            // Let's get the operator we want to use with newline formatting
            System.out.print("Choose the operation (+, -, *, /):\n");
            char operator = j.next().charAt(0);

            double result;

            // Let's use switch to handle different operations
            switch (operator) {
                case '+':
                    result = num1 + num2;
                    break;

                case '-':
                    result = num1 - num2;
                    break;

                case '*':
                    result = num1 * num2;
                    break;

                case '/':
                    if (num2 == 0) {
                        System.out.println("Cannot divide by zero.");
                        return;
                    }
                    result = num1 / num2;
                    break;

                default:
                    System.out.println("Invalid operation selected.");
                    return;
            }

            // Format the result to always show one decimal place
            System.out.printf("The result is: %.1f\n", result);
        }
    }
