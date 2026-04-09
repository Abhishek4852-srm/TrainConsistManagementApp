import java.util.Arrays;
import java.util.Scanner;

public class TrainConsistManagementApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Train Consist Management System ===");
        System.out.println("Use Case 17: Sort Bogie Names Using Arrays.sort()");
        System.out.print("Enter number of bogie types: ");
        int n = scanner.nextInt();
        scanner.nextLine(); // consume newline

        String[] bogieNames = new String[n];
        System.out.println("Enter bogie type names:");
        for (int i = 0; i < n; i++) {
            bogieNames[i] = scanner.nextLine();
        }

        // Sorting using built-in Arrays.sort()
        Arrays.sort(bogieNames);

        System.out.println("\nSorted Bogie Names (Alphabetical Order):");
        System.out.println(Arrays.toString(bogieNames));

        System.out.println("\nSorting completed successfully!");
        scanner.close();
    }
}
