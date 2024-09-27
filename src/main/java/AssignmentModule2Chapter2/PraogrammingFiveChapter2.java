package AssignmentModule2Chapter2;

import java.util.Scanner;

public class PraogrammingFiveChapter2 {
    public static void main(String[] args) {

     Scanner j = new Scanner(System.in);
        System.out.println("Enter investment amount: ");
        double investementAmount = j.nextDouble();
        System.out.println("Enter annual interest rate in percentage: ");
        double annualInterestrate = j.nextDouble();

        System.out.println("Enter number of years: ");
        int numOfYears = j.nextInt();

        double monInterestRate = annualInterestrate / 1200;
        double futureInvestmentRate = investementAmount * Math.pow(1 + monInterestRate, numOfYears * 12 );
        System.out.println("Accumulated value is $ " +(int)(futureInvestmentRate * 100));







    }
}
