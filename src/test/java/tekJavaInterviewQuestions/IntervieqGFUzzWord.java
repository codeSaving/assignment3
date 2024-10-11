package tekJavaInterviewQuestions;

public class IntervieqGFUzzWord {



            // create a function that takes start and end range
            // it should print the numbers
            // if the number is divisible by 3, it should print Fizz
            // if the number is divisible by 5, it should print Buzz
            // if the numebr is divisible by 3 and 5, it should print FizzBuzz
            // any other case, the number is printed.
            // 1
            // 2
            // Fizz
            // 4
            // Buzz
            //...
            // 14
            // FizzBuzz

        public static void printFizzBuzz(int start, int end) {
            for (int i = start; i <= end; i++) {
                if (i % 3 == 0 && i % 5 == 0) {
                    // if the numebr is divisible by 3 and 5, it should print FizzBuzz
                    System.out.println("FINRA");
                } else if (i % 3 == 0) {
                    // if the number is divisible by 3, it should print Fizz
                    System.out.println("FIN");
                } else if (i % 5 == 0) {
                    // if the number is divisible by 5, it should print Buzz
                    System.out.println("RA");
                } else {
                    System.out.println(i);
                }
            }


        }






}
