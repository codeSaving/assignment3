package classes.AssignmentModule2Chapter2;

import java.util.Scanner;

public class Quiz1 {
    public static void main(String[] args) {


        System.out.println(4.0 + 1.0 <=5.0);

        System.out.println("-------------------------------------------");

        int x = 1;
        int y = -1;
        int z =1;
        if (x > 0){
            if (y>0)
                System.out.println("x > o and y> 0");
            else
                System.out.println("x > 0 and y < 0");

        } else if (z>0) {
            System.out.println("x < 0 and z > 0");

        }
        System.out.println("------------------------------------------");
        Scanner nm = new Scanner(System.in);
        System.out.println("Enter a non negative whole number: ");
        int number = nm.nextInt();
        if (number % 2 == 0){
            System.out.println("Input number is even");
        }else {
            System.out.println("Input number is odd");
        }


    }
}
