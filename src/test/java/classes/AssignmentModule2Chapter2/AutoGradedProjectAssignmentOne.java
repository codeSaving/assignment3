package classes.AssignmentModule2Chapter2;

import java.util.Scanner;

public class AutoGradedProjectAssignmentOne {
    public static void main(String[] args) {


        Scanner nm = new Scanner(System.in);

        System.out.println("Enter a, b, c : ");
        double a = nm.nextDouble();
        double b = nm.nextDouble();
        double c = nm.nextDouble();

        // let's compute discriminant
        double discriminant = b * b - 4 * a * c;
        // let's test if(discriminant < 0), display The equation has no real roots
         if (discriminant < 0) {
             System.out.println("The equation has no real roots.");
             // else if (discriminant ==0) ---> one root
         }else if (discriminant == 0){
             double root = -b / (2* a);
             System.out.println("The root is " + root);
             // if discriminant, there are two real roots
         }else {
             double r1 = (-b + Math.pow(discriminant, 0.5)) / (2 * a);
             double r2 = (-b - Math.pow(discriminant, 0.5)) / (2 * a);
             System.out.println("The roots are " + r1 + " and " + r2);
         }

    }
}
