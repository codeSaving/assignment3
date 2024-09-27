package AssignmentModule2Chapter2;

import java.util.Scanner;

public class ProgramingOneChapterTwo {
    public static void main(String[] args) {
     Scanner input = new Scanner(System.in);

     // promt the use to enter subtotal and gratuit
        System.out.println("enter the subtotal and a gratuity rate: ");
        double subtotal = input.nextDouble();

        // we get the value and store it in gratuityRate
        double graduityRate = input.nextDouble();

        // it is time to calculate gratuity
        double graduity = subtotal * (graduityRate / 100);
        // it is time to calculate total
        double total = subtotal + graduity;
        System.out.print("The gratuity is $" + (int) (graduity* 100)/100.0 +(" and "));
        System.out.println("total is $" + (int) ( total * 100)/ 100.0);





    }
}
