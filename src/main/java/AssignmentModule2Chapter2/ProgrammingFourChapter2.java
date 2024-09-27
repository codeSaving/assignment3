package AssignmentModule2Chapter2;

import java.util.Scanner;

public class ProgrammingFourChapter2 {
    public static void main(String[] args) {

      Scanner n = new Scanner(System.in);
        System.out.println("Enter three points for a tringle: ");
        double x1 = n.nextDouble();
        double y1 = n.nextDouble();
        double x2 = n.nextDouble();
        double y2 = n.nextDouble();
        double x3 = n.nextDouble();
        double y3 = n.nextDouble();

        double side1 = Math.pow(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2), 0.5);
        double side2 = Math.pow(Math.pow(x2 - x3, 2) + Math.pow(y2 - y3, 2), 0.5);
        double side3 = Math.pow(Math.pow(x3 - x1, 2) + Math.pow(y3 - y1, 2), 0.5);

        double s = (side1 + side2 + side3) /2;
        double area = Math.pow(s* (s - side1) * (s - side2) * (s - side3), 0.5);
        System.out.println(" The area of the triangle is " + area);





    }
}
