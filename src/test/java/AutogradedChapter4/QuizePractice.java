package AutogradedChapter4;

import java.util.Scanner;

public class QuizePractice {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            String modelName = scanner.nextLine().trim();

            int year = scanner.nextInt();

            // Checking exact match for model case-sensitive
            boolean isExactMatch = modelName.equals("PowerPack") || modelName.equals("EnergyBar");
            // Checking case-insensitive
            boolean isCaseInsensitiveMatch = modelName.equalsIgnoreCase("PowerPack") || modelName.equalsIgnoreCase("EnergyBar");
            boolean isSubstringMatch = modelName.toLowerCase().contains("powerpack") || modelName.toLowerCase().contains("energybar");

            if (isExactMatch) {
                System.out.println("Exact match found.");
            } else {
                System.out.println("Exact match not found.");
            }

            if (isCaseInsensitiveMatch) {
                System.out.println("Case-insensitive match found.");
            } else {
                System.out.println("Case-insensitive match not found.");
            }

            if (isSubstringMatch) {
                System.out.println("Substring match found.");
            } else {
                System.out.println("Substring match not found.");
            }

            if ((modelName.toLowerCase().contains("powerpack") && year >= 2015 && year <= 2018) ||
                    (modelName.toLowerCase().contains("energybar") && year >= 2016 && year <= 2019)) {
                System.out.println("Issue notice.");
            } else {
                System.out.println("OK.");
            }
        }
    }


