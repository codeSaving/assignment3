package AutoGradedChapter7;

import java.util.Scanner;

public class AutoGraded5 {
   // public class Exercise07_19 { // Step 1: Create a class named Exercise07_19

        public static void main(String[] args) { // Step 2: Add a main method
            // Prompt the user to enter the size of list.
            Scanner input = new Scanner(System.in);
            System.out.print("Enter the size of the list: ");
            int size = input.nextInt();
            // Create list using new int[size].
            int[] list = new int[size];
            // Prompt the user to enter int values for list.
            System.out.print("Enter the content of the list: ");
            for (int i = 0; i < size; i++) {
                list[i] = input.nextInt();
            }

            // Invoke isSorted(list) to test if the elements in list are sorted.
            boolean sort = isSorted(list);
            // Display the results
            System.out.print("The list has " + size + " integers: ");
            for (int number : list) {
                System.out.print(number + " ");
            }
            System.out.println();
            if (sort) {
                System.out.println("The list is sorted.");
            } else {
                System.out.println("The list is not sorted.");
            }
        }
        // Implement the isSorted(int[] list) method as follows:
        public static boolean isSorted(int[] list) {
            // Write a for loop: for i from 0 to list.length - 2, if (list[i] > list[i + 1]), return false.
            for (int i = 0; i < list.length - 2; i++) {
                if (list[i] > list[i + 1]) {
                    return false;
                }
            }
            // If nothing is return in the for loop, return true after the for loop.
            return true;
        }
    }




