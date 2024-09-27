package Chapter3LoopFromSchoolBook;

public class NestedFoorLoopExcercise1 {

    public static void main(String[] args) {

        /*
       Question
Goal: Learn to write nested loops.

     Assignment: Given the int variable n, having already been declared and initialized, write a program that displays the
     time tables from 1 till 10, and from 1 till n. For instance, if n is set to 4, the output of your code should be:

1 2 3 4 5 6 7 8 9 10
2 4 6 8 10 12 14 16 18 20
3 6 9 12 15 18 21 24 27 30
4 8 12 16 20 24 28 32 36 40
         */
        int n = 4;
        for (int k = 1; k <= n; k++){
            for ( int f = 1; f<= 10 ; f++){
                System.out.print(k * f + " ");
            }
            System.out.println();
        }

    }
}
