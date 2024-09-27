package Chapter3LoopFromSchoolBook;

public class ForLoopExercise1 {
    public static void main(String[] args) {
   /*
   Goal: Learn to write for loops.

Assignment: Given an int variable n already declared. Write a program that prints integer values until n.
Your program should only print values that are both multiples of 3, and end in 1.
Hint: use the module operator % to retrieve the unit number.
    */
       int n = 0;
        for (int j = 1; j <= n; j++) {
            if (j % 3 == 0 && j % 10 == 1) {
                System.out.print(j + " ");
            }
        }
        System.out.println();





    }
}
