package AutoGradedChapter7;

import java.util.Scanner;
public class Question9 {
    public static void main(String[] args) {
        /*
        Write a program that allows the user to input 20 double type numbers to
         an array and then output the largest (max) number.

         */
                 // we need to create an array to hold 20 of double
                double[] num = new double[20];
                //call scanner
                Scanner input = new Scanner(System.in);
                // we promt the uer to enter the input
                System.out.print("Can you please enter 20 double value:");
                // let's read it in anarray
                for (int i = 0; i < num.length; i++) {
                    num[i] = input.nextDouble();
                }
                // our target is to find the largest number
                double maxNum = num[0];
                for (int i = 1; i < num.length; i++) {
                    if (num[i] > maxNum) {
                        maxNum = num[i]; // if larger num found we update maxNum
                    }
                }
                // display the output
                System.out.println("The largest number is: " + maxNum);
            }
        }






