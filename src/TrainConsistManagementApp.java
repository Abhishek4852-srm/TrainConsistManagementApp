// Custom Exception Class
class InvalidCapacityException extends Exception {
    public InvalidCapacityException(String message) {
        super(message);
    }
}

// Passenger Bogie Class
class PassengerBogie {
    private String name;
    private int capacity;

    public PassengerBogie(String name, int capacity) throws InvalidCapacityException {
        if (capacity <= 0) {
            throw new InvalidCapacityException("Capacity must be greater than zero");
        }
        this.name = name;
        this.capacity = capacity;
    }

    public String getName() {
        return name;
    }

    public int getCapacity() {
        return capacity;
    }

    @Override
    public String toString() {
        return name + " -> " + capacity;
    }
}

// Main Program
public class TrainConsistManagementApp {
    public static void main(String[] args) {
        System.out.println("===============================================");
        System.out.println("UC14 - Handle Invalid Bogie Capacity (Custom Exception)");
        System.out.println("===============================================");

        try {
            PassengerBogie sleeper = new PassengerBogie("Sleeper", 72);
            System.out.println("Created: " + sleeper);

            PassengerBogie acChair = new PassengerBogie("AC Chair", 56);
            System.out.println("Created: " + acChair);

            // Invalid bogie creation (capacity = 0)
            PassengerBogie invalid = new PassengerBogie("First Class", 0);
            System.out.println("Created: " + invalid);

        } catch (InvalidCapacityException e) {
            System.out.println("❌ Exception: " + e.getMessage());
        }

        System.out.println("\nUC14 validation completed...");
    }
}
