import java.util.Scanner;
import java.util.regex.*;

public class TrainConsistManagementApp {
    public static void main(String[] args) {
        System.out.println("===============================================");
        System.out.println("UC11 - Validate Train ID & Cargo Codes (Regex)");
        System.out.println("===============================================");

        Scanner sc = new Scanner(System.in);

        // Define regex patterns
        String trainIdPattern = "TRN-\\d{4}";
        String cargoCodePattern = "PET-[A-Z]{2}";

        // Compile patterns
        Pattern trainPattern = Pattern.compile(trainIdPattern);
        Pattern cargoPattern = Pattern.compile(cargoCodePattern);

        // Get user input
        System.out.print("\nEnter Train ID (Format: TRN-1234): ");
        String trainId = sc.nextLine();

        System.out.print("Enter Cargo Code (Format: PET-AB): ");
        String cargoCode = sc.nextLine();

        // Validate Train ID
        boolean isTrainValid = trainPattern.matcher(trainId).matches();
        System.out.println("Train ID Valid: " + isTrainValid);

        // Validate Cargo Code
        boolean isCargoValid = cargoPattern.matcher(cargoCode).matches();
        System.out.println("Cargo Code Valid: " + isCargoValid);

        System.out.println("\nUC11 validation completed...");
        sc.close();
    }
}
