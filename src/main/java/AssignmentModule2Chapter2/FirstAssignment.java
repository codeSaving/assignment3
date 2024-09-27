package AssignmentModule2Chapter2;

public class FirstAssignment {

    public static void main(String[] args) {

          /*
Goal: Learn how to display the value of a variable to the user.

Assignment: You are assigned the task of designing a pedometer app that can track and display
 the number of steps the user has taken in a given number of days. Assuming the value 115000 for
 steps and 10 for days, your app should display the corresponding value of the average number of
 steps taken per day. Write a complete Java program with the main class Pedometer that implements the pedometer app.

Your program should use:

an int variable steps to store the number of steps;
an int variable days to store the number of days;
a double variable stepsPerDay that stores the value of the average number of steps per day taken.

         */


        int numberOfSteps = 115000;
        int numberOfDays = 10;
        double stepsPerDay = numberOfSteps /numberOfDays;
        System.out.println(stepsPerDay);




    }
}
