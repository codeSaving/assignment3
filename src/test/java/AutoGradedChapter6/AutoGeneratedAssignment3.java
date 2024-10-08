package AutoGradedChapter6;
import java.util.Scanner;
public class AutoGeneratedAssignment3 {
            //Method to count the occurrences of a specified character in the string
            public static int count(String str, char a) {
                int count = 0; // Declare and initialize count
                //Iterate through the string, starting from index 1 to str.length() - 1
                for (int i = 1; i < str.length() - 1; i++) {
                    if (str.charAt(i) == a) {
                        count++;
                    }
                }
                return count; //Return the count
            }
            // Main method
            public static void main(String[] args) {
                Scanner input = new Scanner(System.in);

                //  Prompt the user to enter a string
                System.out.print("Enter a string: ");
                String s = input.nextLine();

                // Step 4.2: Prompt the user to enter a character
                System.out.print("Enter a character: ");
                String line = input.nextLine();
                char ch = line.charAt(0);

                //  Invoke count(s, ch) to return the count and display the result
                int occ = count(s, ch);
                System.out.println(ch + " appears in "  + s  + " " + occ +  "  times.");
            }
        }



