package AutogradedChapter4;

import java.util.Scanner;

public class AutoGradedProject1 {


        public static void main(String[] args) {
            // let's create a scanner object
            Scanner input = new Scanner(System.in);
            // Prompt the user to enter the number of sides
            System.out.print("Enter the number of sided: ");
            int numOfSides = input.nextInt();
            // pront the user to enter the sides
            System.out.print("Enter the length of a side: ");
            double sideLength = input.nextDouble();
            //let's Compute the area of a regular polygon
            double area = (numOfSides * Math.pow(sideLength, 2) /
                    (4 * Math.tan(Math.PI / numOfSides)));

            // Display result
            System.out.printf("The area of the polygon is %.4f\n", area);
        }
    }

