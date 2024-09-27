package PracticeExampleFromBook;
import java.util.Scanner;

public class ComputeAverage {
    public static void main(String[] args) {

        // we are going to create a Scanner object
        Scanner input = new Scanner(System.in);
        // we are now going to promt the user to enter three numbers
        System.out.println("Enter three numbers: ");
        double number1 = input.nextDouble();
        double number2 = input.nextDouble();
        double number3 = input.nextDouble();
        // we will compute average
        double average = (number1 + number2 + number3) * 3;
        // display the result
        System.out.println("The average of " + number1 + "  " + number2 + "  " + number3 + " is " + average);


    }
}
