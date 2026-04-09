import java.util.Scanner;

public class TrainConsistManagementApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Train Consist Management System ===");
        System.out.println("Use Case 16: Sort Passenger Bogies by Capacity");
        System.out.print("Enter number of passenger bogies: ");
        int n = scanner.nextInt();

        int[] capacities = new int[n];
        System.out.println("Enter capacities of passenger bogies:");
        for (int i = 0; i < n; i++) {
            capacities[i] = scanner.nextInt();
        }

        // Bubble Sort Algorithm
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (capacities[j] > capacities[j + 1]) {
                    // Swap adjacent elements
                    int temp = capacities[j];
                    capacities[j] = capacities[j + 1];
                    capacities[j + 1] = temp;
                }
            }
        }

        System.out.println("\nSorted Passenger Bogie Capacities (Ascending Order):");
        for (int capacity : capacities) {
            System.out.print(capacity + " ");
        }

        System.out.println("\nUC16 sorting completed....");
        scanner.close();
    }
}
