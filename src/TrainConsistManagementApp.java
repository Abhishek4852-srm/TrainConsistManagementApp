import java.util.ArrayList;
import java.util.List;

public class TrainConsistManagementApp {

    private List<String> bogieList = new ArrayList<>();

    // Method to add bogies
    public void addBogie(String bogieId) {
        bogieList.add(bogieId);
        System.out.println("Bogie " + bogieId + " added successfully.");
    }

    // UC20: Search operation with fail-fast validation
    public boolean searchBogie(String bogieId) {
        // Defensive check before searching
        if (bogieList.isEmpty()) {
            throw new IllegalStateException(
                    "Search operation failed: No bogies available in the train consist. Please add bogies before searching."
            );
        }

        // Proceed with search if validation passes
        for (String id : bogieList) {
            if (id.equalsIgnoreCase(bogieId)) {
                System.out.println("Bogie " + bogieId + " found in the train consist.");
                return true;
            }
        }

        System.out.println("Bogie " + bogieId + " not found in the train consist.");
        return false;
    }

    public static void main(String[] args) {
        TrainConsistManagementApp app = new TrainConsistManagementApp();

        try {
            // Attempting search before adding bogies
            app.searchBogie("BG101");
        } catch (IllegalStateException e) {
            System.out.println(e.getMessage());
        }

        // Adding bogies and performing valid searches
        app.addBogie("BG101");
        app.addBogie("BG205");
        app.searchBogie("BG205");   // Found
        app.searchBogie("BG999");   // Not found
    }
}
