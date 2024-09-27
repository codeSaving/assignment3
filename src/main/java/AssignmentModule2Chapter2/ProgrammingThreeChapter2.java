package AssignmentModule2Chapter2;

import java.util.Scanner;

public class ProgrammingThreeChapter2 {
    public static void main(String[] args) {
        // to read the input, we need to create the scanner
    Scanner scanner = new Scanner(System.in);
    // let's promt the user to enter the first point with x and y
        System.out.println("Enter x1 and y2 : ");
        double x1 = scanner.nextDouble();
        double y1 = scanner.nextDouble();
        System.out.println("Enter x2 and y2 : ");
        double x2 = scanner.nextDouble();
        double y2 = scanner.nextDouble();
        double distance = Math.pow((x2-x1) * (x2-x1)+ (y2-y1) * (y2-y1), 0.5);
        System.out.println("The distance between the two points is " + distance);







    }
}
