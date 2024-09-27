package classes.AssignmentModule2Chapter2;

public class Assinment {

    public static void main(String[] args) {
                int vehicleType = 1; // Example value. You can change this to test different cases.

                // Switch statement to determine the emission category
                switch (vehicleType) {
                    case 0:
                        System.out.println("Electric");
                        break;

                    case 1:
                        System.out.println("Hybrid");
                        break;

                    case 2:
                    case 3:
                    case 4:
                        System.out.println("Gasoline Low Emission");
                        break;

                    case 5:
                        System.out.println("Gasoline");
                        break;

                    case 6:
                    case 7:
                    case 8:
                    case 9:
                        System.out.println("Diesel");
                        break;

                    default:
                        System.out.println("Unknown category");
                        break;
                }
            }
        }






