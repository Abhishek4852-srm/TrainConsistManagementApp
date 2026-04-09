import java.util.Scanner;

public class TrainConsistManagementApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Train Consist Management System ===");
        System.out.println("Use Case 18: Linear Search for Bogie ID");
        System.out.print("Enter number of bogies: ");
        int n = scanner.nextInt();
        scanner.nextLine(); // consume newline

        String[] bogieIDs = new String[n];
        System.out.println("Enter bogie IDs:");
        for (int i = 0; i < n; i++) {
            bogieIDs[i] = scanner.nextLine();
        }

        System.out.print("Enter bogie ID to search: ");
        String searchKey = scanner.nextLine();

        boolean found = false;
        for (int i = 0; i < bogieIDs.length; i++) {
            if (bogieIDs[i].equals(searchKey)) {
                System.out.println("Bogie ID " + searchKey + " found at position " + (i + 1));
                found = true;
                break; // Early termination once match is found
            }
        }

        if (!found) {
            System.out.println("Bogie ID " + searchKey + " not found in the consist.");
        }

        System.out.println("\nUC18 search completed...");
        scanner.close();
    }
}
