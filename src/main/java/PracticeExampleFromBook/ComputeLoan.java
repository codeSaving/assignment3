package PracticeExampleFromBook;

import java.util.Scanner;

public class ComputeLoan {

    public static void main(String[] args) {
        // create scanner object

        Scanner input = new Scanner(System.in);
        // get data from the user; interest rate
        System.out.print("Enter yearly intrest rate, for example 8.25: ");
        double annualInterestRate = input.nextDouble();
        // obtain monthley interest rate
        double monthelyInterestRate= annualInterestRate /1200;

        System.out.println("Enter number of years as an integer, for example 5 : ");
        int numberOfYears = input.nextInt();
        System.out.println("Enter loan amount, for example 12000.95: ");
        double loanAmount = input.nextDouble();
        // calculate payments
        double monthlyPayment = loanAmount * monthelyInterestRate / (1 -1 /
                Math.pow(1+ monthelyInterestRate, numberOfYears*12));
        double totalPayment = monthlyPayment * numberOfYears *12;
        System.out.println("The monthly payment is " + (int) (monthlyPayment * 100) / 100.0);
        System.out.println("The total payment is " + (int) (totalPayment * 100) / 100.0);







    }
}
