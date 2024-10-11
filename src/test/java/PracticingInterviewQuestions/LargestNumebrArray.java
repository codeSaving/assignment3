package PracticingInterviewQuestions;

public class LargestNumebrArray {

        public static void main(String[] args) {
            int[] numbers = {3, 5, 7, 2, 8};
            int largest = numbers[0];

            for (int i = 1; i < numbers.length; i++) {
                if (numbers[i] > largest) {
                    largest = numbers[i];
                }
            }

            System.out.println("Largest number is: " + largest); // Outputs 8
        }
    }



