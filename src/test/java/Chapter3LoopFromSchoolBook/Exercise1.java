package Chapter3LoopFromSchoolBook;

import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {


        int count = 0;
        while (count < 11){
            System.out.println("welcome to java");
            count++;
        }
        System.out.println("------------------------------");

        int number1 = (int) (Math.random() *10);
        int number2 = (int) ( Math.random()* 10);
        Scanner nm = new Scanner(System.in);
        System.out.println("What is " + number1 + " + " + number2 + " ? ");
        int answer = nm.nextInt();

        while ( number1 + number2 != answer){
            System.out.println("Wrong answer. try again. what is " + number1 + " + " + number2 + " ? ");
            answer = nm.nextInt();

        }
        System.out.println("You got it");






    }
}
