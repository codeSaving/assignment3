package ReverseIntegerUisngScanner;

import java.util.Scanner;

public class ReverseInteger {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an Integer: ");
        int number = input.nextInt();
        reverse(number);


    }
    public static void reverse(int number) {
        while (number != 0) {
            int remainder = number % 10;
            System.out.print(remainder);
            number = number / 10;
        }

    }
}
