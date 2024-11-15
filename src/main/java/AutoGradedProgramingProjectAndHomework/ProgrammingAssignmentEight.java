package AutoGradedProgramingProjectAndHomework;
/*
Full Name: Lhoucine ET TIHAMI
Objective:
This program asks to Create a MyInteger class to store an integer
value and provide methods to verify if it is even, odd, or prime, compare
it with other values. It also asks to convert characters or strings to an integer.

 */
public class ProgrammingAssignmentEight {// start of class
    public static void main(String[] args) {// start of main method
        //testing with n1
        MyInteger n1 = new MyInteger(5);
        System.out.println("n1 is even? " + n1.isEven());
        System.out.println("n1 is prime? " + n1.isPrime());
        System.out.println("15 is prime? " + MyInteger.isPrime(15));

        char[] chars = {'3', '5', '3', '9'};
        System.out.println(MyInteger.parseInt(chars));
        String s = "3539";
        System.out.println(MyInteger.parseInt(s));
        // testing with n2
        MyInteger n2 = new MyInteger(24);
        System.out.println("n2 is odd? " + n2.isOdd());
        System.out.println("45 is odd? " + MyInteger.isOdd(45));
        System.out.println("n1 is equal to n2? " + n1.equals(n2));
        System.out.println("n1 is equal to 5? " + n1.equals(5));
        // Testing with n3
        MyInteger n3 = new MyInteger(10);
        System.out.println("n3 is even? " + n3.isEven());
        System.out.println("n3 is odd? " + n3.isOdd());
        System.out.println("n3 is prime? " + n3.isPrime());
        System.out.println("30 is prime? " + MyInteger.isPrime(30));
        System.out.println("n3 equals 11? " + n3.equals(13));
        System.out.println("n3 equals n1? " + n3.equals(n1));
    }// end of main method
}//end of class






