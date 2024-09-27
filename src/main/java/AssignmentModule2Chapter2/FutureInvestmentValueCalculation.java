package AssignmentModule2Chapter2;
// Scanner imported
import java.util.Scanner;

public class FutureInvestmentValueCalculation {
    public static void main(String[] args) {

    /*
    * Full Name: Lhoucine ET TIHAMI
    * Statment of purpose: This program aims at calculating the future investment value based on
    * ---> the investment ammount, annual interest rate and number of years.
    * ---> the program relies on this formula:
    * futureInvestmentValue = investmentAmount * (1 + monthlyInterestRate)^(numberOfYears * 12
    */
// -----> Create Scanner object to read input
        Scanner scanner = new Scanner(System.in);
// -----> we are promting the user to enter the requested amount
        System.out.println("Enter investment amout: ");
// -----> we are storing the input in 'inveAmount'
        double invAmount = scanner.nextDouble();
// -----> we are promting again the user to enter the requested annual interest
        System.out.println("Enter annual interest rate: ");
// -----> we are storing the input in annualInterestRate
        double annualInterestRate = scanner.nextDouble();
// -----> we finally ask the user to enter the number of years
        System.out.println("Enter the number of years: ");
// -----> we store the input in numOfYears
        int numOfYears = scanner.nextInt();
// -----> we are then going to calculate the monthly interest rate
        double monthlyInterestRate = annualInterestRate /1200;
// -----> we calculate the future investment value relying on the formulas we have in the requirements
        double futureInvestmentValue = invAmount * Math.pow(1 + monthlyInterestRate, numOfYears * 12);
// -----> we print the accumulated value by
        System.out.printf("Accumulated value is %.2f%n",  futureInvestmentValue);

    }
}
