// Custom Runtime Exception
class CargoSafetyException extends RuntimeException {
    public CargoSafetyException(String message) {
        super(message);
    }
}

// Goods Bogie Class
class GoodsBogie {
    private String shape;
    private String cargo;

    public GoodsBogie(String shape) {
        this.shape = shape;
    }

    public String getShape() {
        return shape;
    }

    public String getCargo() {
        return cargo;
    }

    // Cargo assignment with try-catch-finally
    public void assignCargo(String cargo) {
        try {
            System.out.println("\nAttempting cargo validation for " + shape + " bogie...");
            if (shape.equalsIgnoreCase("Rectangular") && cargo.equalsIgnoreCase("Petroleum")) {
                throw new CargoSafetyException("Unsafe cargo assignment!");
            }
            this.cargo = cargo;
            System.out.println("Cargo validation successful for " + shape + " bogie.");
        } catch (CargoSafetyException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            System.out.println("Cargo validation completed for " + shape + " bogie.");
        }
    }

    @Override
    public String toString() {
        return shape + " -> " + (cargo != null ? cargo : "No Cargo Assigned");
    }
}

// Main Program
public class TrainConsistManagementApp {
    public static void main(String[] args) {
        System.out.println("===============================================");
        System.out.println("UC15 - Safe Cargo Assignment Using try-catch-finally");
        System.out.println("===============================================");

        GoodsBogie rectangular = new GoodsBogie("Rectangular");
        GoodsBogie cylindrical = new GoodsBogie("Cylindrical");

        // Safe assignment
        cylindrical.assignCargo("Petroleum");

        // Unsafe assignment
        rectangular.assignCargo("Petroleum");

        System.out.println("\nUC15 runtime completed...");
    }
}
