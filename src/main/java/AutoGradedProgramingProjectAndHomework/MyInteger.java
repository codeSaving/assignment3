package AutoGradedProgramingProjectAndHomework;
/*
Full Name: Lhoucine ET TIHAMI
Objective:
This program asks to Create a MyInteger class to store an integer
value and provide methods to verify if it is even, odd, or prime, compare
it with other values. It also asks to convert characters or strings to an integer.

 */
public class MyInteger { // start of class
    // store int value reprsent by MyInteger object
    private int value;
    // constructor that create a MyInteger wit a specific value
    public MyInteger(int value) {
        this.value = value; }
    // get method to return the int value of MyInteger

    public int getValue() {
        return value; }
    //create instance method to check if value even
    public boolean isEven() {
        return (value % 2) == 0; }
    // create instance method to check if value odd
    public boolean isOdd() {
        return value % 2 !=0; }
    // instance method to check if value prime
    public boolean isPrime() {
        if (value <= 1) {
            return false;
        }
        if (value == 2) {
            return true;
        }
        for (int i = 2; i * i <= value; i++) {
            if (value % i == 0) {
                return false;
            }
        }
        return true;
    }
    // static method to check if given int even
    public static boolean isEven(int number) {
        return number % 2 == 0; }
    // static method to check if given int odd
    public static boolean isOdd(int number) {
        return number % 2 != 0;}
    // static method to check if given number
    public static boolean isPrime(int number) {
        if (number <= 1) return false;
        for(int i = 2; i<=Math.sqrt(number); i++){
            if (number % i == 0) return false;
        }
        return true;
    }
    // static method to chech if MyInteger obj is even
    public static boolean isEven(MyInteger obj) {
        return obj.isEven();
    }
    // static method to check if MyInteger obj odd
    public static boolean isOdd(MyInteger obj) {
        return obj.isOdd();
    }
    // static method to check if a given MyInteger obj prime
    public static boolean isPrime(MyInteger myInt) {
        return myInt.isPrime();
    }
    // method to check if value is equal to int's passed value

    public boolean equals(int num) {
       return this.value == num; }
    // method to check if MyInteger's value is equal to another MyInteger's passed value
    public boolean equals(MyInteger myInt) {
       return this.value == myInt.value; }
    // static method to convert array numeric char to int
    public static int parseInt(char[] values) {
        int sum = 0;
        for (char i : values) {
            sum = sum * 10 + (i - '0');
        }
        return sum;
    }
    // static method to convert a string into int
    public static int parseInt(String value) {
        return Integer.parseInt(value);
    }
}
