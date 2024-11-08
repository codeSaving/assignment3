package AutoGradedChapter9;
import java.util.Scanner;
public class UsingMethod {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            // Get user input
            int N = promtForNumOfBalls(input);
            int K = promptForNumOfSlots(input);
            // Drop the balls and get the distribution
            int[] slots = simulateBallFall(N, K);
            // Display the final distribution
            displayFinalSlot(slots);
        }

        // Method to get number of balls
        public static int promtForNumOfBalls(Scanner input) {
            System.out.print("Enter number of balls: ");
            return input.nextInt();
        }
        // Method to get number of slots
        public static int promptForNumOfSlots(Scanner input) {
            System.out.print("Enter number of slots: ");
            return input.nextInt();
        }

        // Method to simulate dropping the balls
        public static int[] simulateBallFall(int N, int K) {
            int[] slots = new int[K];
            for (int i = 0; i < N; i++) {
                int position = getBallPosition(K);
                slots[position]++;
            }
            return slots;
        }

        // Method to get the position of a ball after it hits the nails
        public static int getBallPosition(int K) {
            int R = 0;
            for (int j = 0; j < K - 1; j++) {
                if (Math.random() >= 0.5) R++; // Move right if random >= 0.5
            }
            return R;
        }

        // Method to display the final slot distribution
        public static void displayFinalSlot(int[] slots) {
            System.out.println();;
            for (int i = 0; i < slots.length; i++) {
                System.out.println("Slot " + i + "  --->  " + slots[i] + " balls");
            }
        }
    }








