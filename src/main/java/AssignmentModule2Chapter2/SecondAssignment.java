package AssignmentModule2Chapter2;

import java.util.Scanner;

public class SecondAssignment {
    public static void main(String[] args) {

/*
Goal: Learn how to work with variables and standard input/output.

Assignment: As a nutritionist programming an app for tracking daily calorie intake, you need
to write a complete program that:
prompts the user to enter the daily calorie intake with the message: "Enter your daily calorie intake in kcal:";
displays on screen the following message (where X stands from the value entered by the user):
Today your calorie intake was X kcal.
Your program's main class should be named CalorieIntake. Use a double variable to store the daily calorie intake.
 */

        Scanner input = new Scanner(System.in);
        double X;
        System.out.println("Enter your daily calorie intake in kcal: ");
        X = input.nextDouble();
        System.out.println("Today your calorie intake was " + X + " kcal");

    }
}
