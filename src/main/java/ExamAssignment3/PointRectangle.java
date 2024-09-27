package ExamAssignment3;
/*
Full Name: Lhoucine ET TIHAMI
programming assignment 3

objective: This program checks whether a given point (x, y) is inside or outside a
rectangle centred at (0,0). The rectangle consists of width of 10 and height of 5.
 */



// Import the Scanner class to read input
import java.util.Scanner;

public class PointRectangle {
// begin of class
    public static void main(String[] args) {
// begin of main method
//Creat scanner object to read the input
        Scanner scanner = new Scanner(System.in);
//promt the user to enter a point with two coordinates
        System.out.println("Enter a point with two coordinates: ");
// create x and y for coordinate
        double x = scanner.nextDouble(); // read x coordinate
        double y = scanner.nextDouble(); // read y coordinate
// create boolean to test of if the point is within the rectangle
        boolean isWithinRectangle = (Math.abs(x) <= 10/ 2.0)// check is x within point
                && (Math.abs(y)<= 5.0/2.0);                 // check is y within point
// display the output
        System.out.println("Point (" + x + ", " + y + ") is " +
                ((isWithinRectangle) ? "in " : "not in ") + "the rectangle");
    }// end of main method
}    // end of a class
