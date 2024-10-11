package tekJavaInterviewQuestions;

public class PracticeIt1 {
    public static void main(String[] args) {

        // --> start rage  --> end range
        // if --> divisible by3 = fizz
        // if --> divisible by 5 = buzz
        // if --> divisible by 3 And 5 = FizzBuss
        // -->

printFizzBuss(1, 30);
    }

    public static void printFizzBuss (int start, int end){
        for ( int i = start; i<= end; i++){
            if (i %3 == 0 && i % 5 ==0){
                System.out.println("Fizz");
            }else if (i%3 ==0){
                System.out.println("FInnnnn");
            }else if (i%5 == 0){
                System.out.println("RAAAA");
            }else {
                System.out.println(i);
            }
        }
    }
}
