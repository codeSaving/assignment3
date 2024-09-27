package Chapter3LoopFromSchoolBook;

import java.util.Enumeration;

public class ForLoopExcerice2 {
    public static void main(String[] args) {

  /*
  Goal: Learn to write for loops.

Assignment: Write a for loop that prints all the integers from 300 down to 150 inclusive that are multiples of 3,
 each separated by exactly one space.
   */

  for ( int j = 300; j >= 150; j--){
      if (j % 3 == 0){
          System.out.println(j);
      }
      if (j > 150){
          System.out.println(" ");
      }
        }
        System.out.println();;



    }
}
