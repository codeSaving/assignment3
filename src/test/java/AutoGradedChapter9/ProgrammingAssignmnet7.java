package AutoGradedChapter9;
/*
Full Name: Lhoucine ET TIHAMI
the objective: This program simulates a bean machine where balls fall through
rows of nails into slots. Based on the number of balls and slots, it randomly
determines whether each ball falls right or left at each nail. The program then
displays the final count of balls in each slot.
 */
import java.util.Arrays;
public class ProgrammingAssignmnet7 { // start of class
        public static void main(String[] args) {// start of main method
            int N = 200; // this represents the number of balls
            int K = 18;  // this represents the number of slots
            // an array of k elements
            int[] slots = new int[K];
            // using Loop to go through each ball
            for (int i = 0; i < N; i++) {
            // we declare and initialize R to track the ball
                int R = 0;

                // Simulate the ball's path through (K-1) nails
                for (int j = 0; j < K - 1; j++) {
                    if (Math.random() >= 0.5) {
                        R++; // if random result is 0.5 or more, Shift right
                    }
                }

                // Increment the slot corresponding to the final position of the ball
                slots[R]++;
            }
            // display the result
            System.out.println("Number of balls in each slot: " + Arrays.toString(slots));
        }// end of main method

    }// end of class










