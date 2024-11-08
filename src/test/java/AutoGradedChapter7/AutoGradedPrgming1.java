package AutoGradedChapter7;

import java.util.Scanner;

public class AutoGradedPrgming1 {

    public static void main(String[] args) {


            Scanner input = new Scanner(System.in);

            // promt the user to enter the number of students
            System.out.print("Enter number of students: ");
            int numberOfStudents = input.nextInt();
            //Create an array for scores using new double
            double[] scores = new double[numberOfStudents];

            //Declare and initialize the variable best to keep the best score
            double best = 0;

            //Prompt the user to enter the scores in a loop
            System.out.print("Enter " + numberOfStudents + " scores: ");
            for (int i = 0; i < numberOfStudents; i++) {
                scores[i] = input.nextDouble(); // for each score, we store it in scores [i]
                if (scores[i] > best) { //compare to the best
                    best = scores[i]; // assign it to best
                }
            }
           // creat for loop from 0 to numberOfStudents-1
            for (int i = 0; i < numberOfStudents-1; i++) {
                char grade;

                if (scores[i] >= best - 10) {
                    grade = 'A';
                } else if (scores[i] >= best - 20) {
                    grade = 'B';
                } else if (scores[i] >= best - 30) {
                    grade = 'C';
                } else if (scores[i] >= best - 40) {
                    grade = 'D';
                } else {
                    grade = 'F';
                }
                System.out.println("Student " + i + " score is " + scores[i] + " and grade is " + grade);
            }
        }
    }



