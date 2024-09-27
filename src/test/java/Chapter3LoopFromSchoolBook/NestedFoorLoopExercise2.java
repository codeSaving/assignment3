package Chapter3LoopFromSchoolBook;

public class NestedFoorLoopExercise2 {
    public static void main(String[] args) {

      /*
      Goal: Learn to write nested loops.

Assignment: Given an int variable n, write a program that takes in n as user input. It then prints out an inverted
 triangle of integers, n rows high. Each line consists of the corresponding integers, starting at 1. You must use
 nested for loops to solve this question.

For instance, if n is set to 4, the output of your code should be:

   1
  22
 333
4444
       */
        int n = 4;

        for (int e = 1; e <= n; e++) {
            for (int b = n - e; b > 0; b--) {
                System.out.print(" ");
            }
            for (int c = 1; c <= e; c++) {
                System.out.print(e);
            }
            System.out.println();
        }







    }
}
